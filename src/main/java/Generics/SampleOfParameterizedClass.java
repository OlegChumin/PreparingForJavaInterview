package Generics;

public class SampleOfParameterizedClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("Hallo");
        System.out.println(info1);
        String str = info1.getNewVariable();
        System.out.println(str);

        Info<Integer> info2 = new Info<>(new Integer(123));
        System.out.println(info2);
        System.out.println(info2.getNewVariable());

    }
}

class Info <T>{  //Object  T -> typerPlaceHolder
    private T newVariable; // cannot be static

    public Info(T newVariable) {
        this.newVariable = newVariable;
    }

    public T getNewVariable() {
        return newVariable;
    }

    @Override
    public String toString() {
        return "Info{" +
                " newVariable = " + newVariable +
                '}';
    }
}
