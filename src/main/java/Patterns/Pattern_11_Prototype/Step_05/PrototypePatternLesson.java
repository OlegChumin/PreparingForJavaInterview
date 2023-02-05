package Patterns.Pattern_11_Prototype.Step_05;

public class PrototypePatternLesson {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person("Leo", 25, new Address("Street", 23));
//        Person person2 = person.copy(person);
//        Person person2 = person.clone();
        Person person2 = new Person(person);
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
        System.out.println("Some code in constructor");
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public Address(Address address) {
        this.street = address.street;
        this.houseNumber = address.houseNumber;
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

}

class Person {
    String name;
    int age;
    final Address address; // <-- final

    public Person(String name, int age, Address address) {
        System.out.println("Constructor with name, age, address");
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person(Person person) {
        System.out.println("Constructor with person");
        this.name = person.name;
        this.age = person.age;
        this.address = new Address(person.address);
    }

    //    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

//    @Override
//    protected Person clone() throws CloneNotSupportedException {
//        Person person = (Person) super.clone();
//        person.address = this.address.clone();
//        return person;
//    }

    //    public Person copy(Person person) {
//        return new Person(person.name, person.age);
//    }
}


