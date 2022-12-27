package NestedClasses;

public class SampleInnerStaticClass {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(150);
        Car car = new Car("red", 2, engine);
        System.out.println(car);

        Car.Engine engine1 = new Car.Engine(250);
        engine1.startEngine();
        engine1.stopEngine();

        Car dieselCar = new Car("dark", 5, new Car.Engine(100));
//        Car.DieselEngine dieselEngine = new Car.DieselEngine(150);
    }
}

class Car {
    String color;
    int dorCount;
    Engine engine;


    public Car(String color, int dorCount, Engine engine) {
        this.color = color;
        this.dorCount = dorCount;
        this.engine = engine;
        this.engine.horsePower = 100;
    }

    interface EngineWork {
        void startEngine();
        void stopEngine();
    }

    public static class Engine extends Platform implements EngineWork {
        int horsePower;
        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }

        @Override
        public void startEngine() {
            System.out.println("start Engine");
        }

        @Override
        public void stopEngine() {
            System.out.println("stop Engine");
        }
    }

    public class DieselEngine extends Engine{
        public DieselEngine(int horsePower) {
            super(horsePower);
        }
    }


    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", dorCount=" + dorCount +
                ", engine=" + engine +
                '}';
    }
}

class Platform {

}