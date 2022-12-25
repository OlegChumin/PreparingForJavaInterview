package Generics;

import java.util.ArrayList;
import java.util.List;

public class SampleOfGenerics {
    public static void main(String[] args) {
        List list = new ArrayList(); // raw type -> Object
        list.add(new Object());
        list.add("OK");
        list.add('H');
        list.add(true);
        list.add(new String("----"));
        list.add(new StringBuffer("Bye")); //thread safe,
        list.add(new StringBuilder("No")); //no thread safe, faster work

        for (Object element : list) {
            System.out.println(element);
        }

        List<String> stringList = new ArrayList<>(); // raw type
        stringList.add("Hallo");
        stringList.add("OK");
        stringList.add("GoodBye");
//        stringList.add(new StringBuffer("-----"));
        for (String element : stringList) {
            System.out.println(element + " length = " + element.length());
        }

        for (Object element : stringList) {
            System.out.println(element + " length = " + ((String) element).length());
        }


    }
}
