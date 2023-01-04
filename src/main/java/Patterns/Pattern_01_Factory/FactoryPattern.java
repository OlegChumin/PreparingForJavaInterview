package Patterns.Pattern_01_Factory;

public class FactoryPattern {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Car toyota = factory.create("Toyota");
        toyota.drive();
        Car audi = factory.create("Audi");
        audi.drive();
        System.out.println("----------------------------");

        Toyota newToyota = (Toyota) factory.create("Toyota");

        FactoryUseCarBrands factoryUseCarBrands =  new FactoryUseCarBrands();
        Car toyotaEnum = factoryUseCarBrands.create(CarBrand.TOYOTA);
        toyotaEnum.drive();
        Car audiEnum = factoryUseCarBrands.create(CarBrand.AUDI);
        audiEnum.drive();
    }
}

interface Car{
    void drive();
}

class Toyota implements Car{
    @Override
    public void drive() {
        System.out.println("Drive Toyota");
    }
}

class Audi implements Car{
    @Override
    public void drive() {
        System.out.println("Drive Audi");
    }
}

class Factory{
    public Car create(String typeOfCar) {
        switch (typeOfCar){
            case("Toyota"): return new Toyota();
            case("Audi"): return new Audi();
            default: return null;
        }
    }
}

class FactoryUseCarBrands{
    public Car create(CarBrand carBrand) {
        switch (carBrand){
            case TOYOTA: return new Toyota();
            case AUDI: return new Audi();
            default: return null;
        }
    }
}

enum CarBrand{
    MERCEDES, AUDI, TOYOTA, FORD
}
