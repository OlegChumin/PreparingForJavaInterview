package Patterns.Pattern_11_Prototype.Step_03;

public class PrototypePatternLesson {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person("Leo", 25, new Address("Street", 23));
//        Person person2 = person.copy(person);
        Person person2 = person.clone();
        System.out.println("person2 != person : " + (person2 != person));
        System.out.println("person = " + person);
        System.out.println("person2 = " + person2);
        System.out.println("person2.name.equals(person.name) :" + person2.name.equals(person.name));
        System.out.println("person2.age == person.age :" + (person2.age == person.age));
        System.out.println("------------------------------------------------------");
        System.out.println(person2.address.street.equals(person.address.street));
        System.out.println("------------------------------------------------------");
        person.name = "Ilia";
        System.out.println("person.name" + person.name);
        System.out.println("person2.name" + person2.name);
        System.out.println("------------------------------------------------------");
        person.address.street = "SomeNewStreet";
        System.out.println(person2.address.street.equals(person.address.street));
        System.out.println(person.address.street);
        System.out.println(person2.address.street);

//        person.clone();
//        Object
    }
}

class Address {
    String street;
    int houseNumber;

    public Address(String street, int houseNumber) {
        this.street = street;
        this.houseNumber = houseNumber;
    }
}

class Person implements Cloneable{
    String name;
    int age;
    Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }

    //    public Person copy(Person person) {
//        return new Person(person.name, person.age);
//    }
}


