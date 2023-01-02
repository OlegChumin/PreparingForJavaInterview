package Lambda.Part_02;

public class LambdaSample_01 {
    public static void main(String[] args) {
        def(new I() {
            @Override
            public int methodI() {
                return 18;
            }
        });

        def(() -> 18);
        def(() -> "Hallo");
        def((A) a -> a);
        def(a -> a);
//        boolean x;
        def((int x) -> 19);

    }

    static void def(I i) {
        System.out.println(i.methodI());
    }

    static void def(J j) {
        System.out.println(j.methodJ());
    }

    static void def(A a) {
        System.out.println(a.abc(18));
    }
}

@FunctionalInterface
interface I {
    int methodI();
}

@FunctionalInterface
interface J {
    String methodJ();
}

interface A {
    int abc(int x);
}