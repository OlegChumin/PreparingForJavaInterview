package NestedClasses;

public class SampleAnonymousClass {
    public static void main(String[] args) {
//        Sub sub =  new Sub();
//        sub.doSomeOperation(5, 6);
        MathOperations sub = (a, b) -> {b = a - b; return b + a;};
        MathOperations sum = (a, b) -> a + b;
        System.out.println(sub.doSomeOperation(10 , 5));
        System.out.println(sum.doSomeOperation(10, 5));
    }

//    static class Sub implements MathOperations {
//        @Override
//        public int doSomeOperation(int a, int b) {
//            return  a - b;
//        }
//    }
        class Sum implements MathOperations {
            @Override
            public int doSomeOperation(int a, int b) {
                return  a + b;
            }

//            @Override
//            public int doSecondOperation(int a, int b, int c) {
//                return 0;
//            }
        }

        MathOperations restOfDivision =  new MathOperations() {
            @Override
            public int doSomeOperation(int a, int b) {
                return a % b;
            }

//            @Override
//            public int doSecondOperation(int a, int b, int c) {
//                return 0;
//            }
        };

}

@FunctionalInterface
interface MathOperations {
    int doSomeOperation(int a, int b);
//    int doSecondOperation (int a, int b, int c);
}
