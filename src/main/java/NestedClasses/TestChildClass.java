package NestedClasses;

public class TestChildClass {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "Donald";
        Duck duck = new Duck();
        duck.name = "Duck";

    }
}

class Animal {
    protected String name;
}

class Duck extends Animal{
}
