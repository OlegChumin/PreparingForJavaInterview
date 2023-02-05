package Patterns.Pattern_11_Prototype.Step_01;

public class PrototypePatternLesson {
    public static void main(String[] args) {
        Person person = new Person("Leo", 25);
        Person person2 = person.copy(person);

//        person.clone();
//        Object
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person copy(Person person) {
        return new Person(person.name, person.age);
    }
}


