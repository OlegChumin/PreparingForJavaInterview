package Lambda.Part_04;

public class LambdaSample3 {
    public static void main(String[] args) {
        lambdaMethod(h -> h.length());
        lambdaMethod((h) -> h.length());
        lambdaMethod(String::length);
        int i = 10; // effectevely final
//        i = 15;
        lambdaMethod((String str) -> {System.out.println(i); return str.length();});
        final int j = 60;
        lambdaMethod((String str) -> str.length() +  j);
        /**
         * Error: lambdaMethod( x -> {x.length();}) missed return
         * Error: lambdaMEthod( x -> {return x.length()_};) missed _";"
         * Error: lambdaMethod( x, y -> .....)    missed "( , )"
         *
         * */
        int x = 0;
        arithmeticMethod((int k, int y) -> x + y + k);
//        System.out.println(x);
//        System.out.println(y);
    }

    static void lambdaMethod(SomeInterface_H h) {
        System.out.println(h.methodH("Hi"));
    }

    static int arithmeticMethod(Arif arif) {
        System.out.println(arif.method(10, 18));
        return 9;
    }

}


interface SomeInterface_H{
    int methodH(String str);
}

interface Arif {
    int method(int x, int y);
}
