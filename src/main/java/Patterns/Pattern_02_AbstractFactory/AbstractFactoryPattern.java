package Patterns.Pattern_02_AbstractFactory;

public class AbstractFactoryPattern {
    public static void main(String[] args) {
        Factory carFactory = new AbstractFactory().createFactory(FactoryType.CAR_FACTORY);
        Car toyota = carFactory.createCar(CarBrands.TOYOTA);
        toyota.drive();
        Car audi = carFactory.createCar(CarBrands.AUDI);
        audi.drive();

        Factory truckFactory =  new AbstractFactory().createFactory(FactoryType.TRUCK_FACTORY);
        Truck mercedes =  truckFactory.createTruck(TruckBrands.MERCEDES);
        mercedes.drive();
        Truck ford = truckFactory.createTruck(TruckBrands.FORD);
        ford.drive();
    }
}

interface Car {
    void drive();
}

class Toyota implements Car {
    @Override
    public void drive() {
        System.out.println("Drive Toyota");
    }
}

class Audi implements Car {

    @Override
    public void drive() {
        System.out.println("Drive Audi");
    }
}

class CarFactory implements Factory{
    public Car createCar(CarBrands carBrands) {
        switch (carBrands) {
            case TOYOTA:
                return new Toyota();
            case AUDI:
                return new Audi();
            default:
                return null;
        }
    }

    @Override
    public Truck createTruck(TruckBrands truckBrands) {
        return null;
    }
}

enum CarBrands {
    MERCEDES, AUDI, TOYOTA, FORD
}


interface Truck {
    void drive();
}

class Ford implements Truck {
    @Override
    public void drive() {
        System.out.println("Drive FORD truck");
    }
}

class Mercedes implements Truck {

    @Override
    public void drive() {
        System.out.println("Drive MERCEDES truck");
    }
}

class TruckFactory implements Factory{
    @Override
    public Car createCar(CarBrands carBrands) {
        return null;
    }

    public Truck createTruck(TruckBrands truckBrands) {
        switch (truckBrands) {
            case MERCEDES:
                return new Mercedes();
            case FORD:
                return new Ford();
            default:
                return null;
        }
    }
}

enum TruckBrands {
    MERCEDES, FORD
}

interface Factory {
    Car createCar(CarBrands carBrands);

    Truck createTruck(TruckBrands truckBrands);
}

class AbstractFactory {
    public Factory createFactory(FactoryType factoryType) {
        switch (factoryType) {
            case CAR_FACTORY:
                return new CarFactory();
            case TRUCK_FACTORY:
                return new TruckFactory();
            default:
                return null;
        }
    }
}

enum FactoryType {
    CAR_FACTORY, TRUCK_FACTORY, BOAT_FACTORY
}
