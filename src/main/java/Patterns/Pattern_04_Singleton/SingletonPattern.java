package Patterns.Pattern_04_Singleton;

public class SingletonPattern {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.createObject();
        singleton1.i = 5;
        System.out.println(singleton1.i);
        Singleton singleton2 = Singleton.createObject();
        System.out.println(singleton2.i);
        singleton2.i = 10;
        System.out.println(singleton1.i);
    }
}

class Singleton{
    int i = 0;
    private static Singleton singleton =  new Singleton();
    private Singleton() {}

    public static Singleton createObject() {
        return singleton;
    }
}
