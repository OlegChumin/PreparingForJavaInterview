package Generics;

import java.util.ArrayList;

public class SampleOfParameterizedMethod {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);

        ArrayList<String> strAl = new ArrayList<>();
        strAl.add("Hallo");
        strAl.add("OK");
        strAl.add("Bye");

        System.out.println(GetMethod.getSecondElementFromCollection(al));
        System.out.println(GetMethod.getSecondElementFromCollection(strAl));
        //Ctrl + Alt + T
    }
}

class GetMethod {
    //    public static Integer getSecondElementFromCollection(ArrayList<Integer> al) {
//        return al.get(1);
//    }
//
//    public static String getSecondElementFromCollectionString(ArrayList<String> al) {
//        return al.get(1);
//    }

    public static <T> T getSecondElementFromCollection(ArrayList<T> al) {
        return al.get(1);
    }
}
