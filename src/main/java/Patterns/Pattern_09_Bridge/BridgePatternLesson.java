package Patterns.Pattern_09_Bridge;

public class BridgePatternLesson {
    public static void main(String[] args) {
        Vehicle vehicle = new Car(new Mercedes());
        vehicle.drive();
        Vehicle vehicleTruck = new Truck(new Mercedes());
        vehicleTruck.drive();
        Vehicle vehicleCarFord =  new Car(new Ford());
        vehicleCarFord.drive();

    }
}

abstract class Vehicle {
    Model model;

    public Vehicle(Model model) {
        this.model = model;
    }

    abstract void drive();
}

interface Model {
    void drive(String str);
}


class Car extends Vehicle {

    public Car(Model model) {
        super(model);
    }

    @Override
    void drive() {
        model.drive("Drive car ");
    }
}

class Truck extends Vehicle {

    public Truck(Model model) {
        super(model);
    }

    @Override
    void drive() {
        model.drive("Drive truck ");
    }
}

class Mercedes implements Model {

    @Override
    public void drive(String str) {
        System.out.println(str + "Mercedes");
    }
}

class Ford implements Model {

    @Override
    public void drive(String str) {
        System.out.println(str + "Ford");
    }
}

//interface Car {}
//interface Truck {}
//interface Bike {}
//
//class MercedesCar implements  Car{}
//class MercedesTruck implements Truck{}
//
//class FordCar implements Car{}
//class FordTruck implements Truck {}
