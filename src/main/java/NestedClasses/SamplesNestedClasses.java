package NestedClasses;

public class SamplesNestedClasses {
    static class SampleInnerStaticClass {
    }

    class SampleInnerClass {
    }

    void method() {
        class SampleLocalClass {

        }
    }

    {
     class SampleLocalClass {

     }
    }

    public static void main(String[] args) {
        ToDo toDo = new ToDo() {
            @Override
            public int someMethod() {
                return 0;
            }
        };
    }

    @FunctionalInterface
    interface ToDo {
        int someMethod();
    }
}
