package immutable_class;

/**
 * 1. final
 * 2. private final fields
 * 3. no setters
 * 4. don't return mutable objects
 * 5. deep cloning of Collections fields
 */
public final class ImmutableLesson {
    private final int i;
    Person person;

    public ImmutableLesson(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public Person getPerson() throws CloneNotSupportedException {
        return person.clone();
    }

    //    public void setI(int i) {
//        this.i = i;
//    }
}

class Person implements Cloneable {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }
}
