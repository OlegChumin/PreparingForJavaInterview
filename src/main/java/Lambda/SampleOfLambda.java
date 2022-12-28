package Lambda;

import java.util.function.Predicate;

public class SampleOfLambda {

    static void printResultOfStringProcess(SampleInterface objectOfSampleInterface) {
        System.out.println(objectOfSampleInterface.processString("Hallo Leo")); // literal
    }

    static void sampleOfPredicateUse(Predicate<Stuff> predicate) {

    }

    public static void main(String[] args) {
        int a = 10;  // effectively final
//        a = 15;
        final int b = 20;

        printResultOfStringProcess(new SampleInterface() {
            @Override
            public int processString(String str) {
                return str.length();
            }
        });

        printResultOfStringProcess((String str) -> {return str.length();});
        printResultOfStringProcess(str ->  str.length());

        printResultOfStringProcess((String str) -> {
            System.out.println(a); return str.length();});

        printResultOfStringProcess(String :: length);
    }
}

interface SampleInterface{
    int processString(String str);
}

interface StuffCheck {
    boolean check(Stuff stuff);
}

class Stuff {

}

