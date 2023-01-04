package Patterns.Pattern_03_FactoryMethod;

public class FactoryMethodPattern {
    public static void main(String[] args) {
        Person person = Person.create();
//        Person person2 = new Person();
    }
}

class Person{
    private Person() {}

    static Person create() {
        return new Person();
    }
}

