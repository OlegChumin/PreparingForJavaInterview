package Patterns.Pattern_05_Builder;

public class BuilderPattern {
    public static void main(String[] args) {
        NewPerson newPerson = new NewPersonBuilderImpl().setPersonName("Leo").setPersonAge(40).setPersonSalary(5_000.).build();
        System.out.println(newPerson);
        NewPerson newPerson1 = new NewPersonBuilderImpl().setPersonName("Oleg").build();
        System.out.println(newPerson1);
    }
}

interface NewPersonBuilder{
    NewPersonBuilder setPersonName(String name);
    NewPersonBuilder setPersonAge(int age);
    NewPersonBuilder setPersonSalary(double salary);
    NewPerson build();
}

class NewPersonBuilderImpl implements NewPersonBuilder{

    NewPerson newPerson = new NewPerson();

    @Override
    public NewPersonBuilder setPersonName(String name) {
        newPerson.name = name;
        return this;
    }

    @Override
    public NewPersonBuilder setPersonAge(int age) {
        newPerson.age = age;
        return this;
    }

    @Override
    public NewPersonBuilder setPersonSalary(double salary) {
        newPerson.salary =  salary;
        return this;
    }

    @Override
    public NewPerson build() {
        return newPerson;
    }
}

class NewPerson {
    String name;
    int age;
    double salary;

    @Override
    public String toString() {
        return "NewPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

//    public NewPerson(String name) {
//        this.name = name;
//    }
//
//    public NewPerson(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public NewPerson(int age, double salary) {
//        this.age = age;
//        this.salary = salary;
//    }
//
//    public NewPerson(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
//    }
}
