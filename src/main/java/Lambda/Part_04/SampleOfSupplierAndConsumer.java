package Lambda.Part_04;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SampleOfSupplierAndConsumer {
    private static Random random = new Random();
    public static void main(String[] args) {
        ArrayList<Car> ourCars = create5Cars(() -> new Car("Nissan", "red", 220, random.nextInt(200)));
        System.out.println(ourCars);

        ArrayList<Car> newCars = create5Cars();
        System.out.println(newCars);

        changeCar(ourCars.get(1), car -> {car.color = "yellow"; car.enginePower = 240.5;
            System.out.println("upgraded car " + car);});
    }

    //Supplier
    public static ArrayList<Car> create5Cars(Supplier<Car> carSupplier) {
        ArrayList<Car> carArrayList =  new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            carArrayList.add(carSupplier.get()); // new Car
        }
        return carArrayList;
    }

    //Consumer
    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car); // accept Car object
    }


    public static ArrayList<Car> create5Cars() {
        ArrayList<Car> carArrayList =  new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            carArrayList.add(new Car("Nissan", "red", 220, random.nextInt(200))); // new Car
        }
        return carArrayList;
    }
}

class Car{
    String model;
    String color;
    double enginePower;
    int id;

    public Car(String model, String color, double enginePower, int id) {
        this.model = model;
        this.color = color;
        this.enginePower = enginePower;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", enginePower=" + enginePower +
                ", id=" + id +
                '}';
    }
}
