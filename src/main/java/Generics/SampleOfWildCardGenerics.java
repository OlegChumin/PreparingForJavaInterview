package Generics;

import java.util.ArrayList;
import java.util.List;

public class SampleOfWildCardGenerics {
    public static void main(String[] args) {
//        List<Number> listNumber = new ArrayList<Integer>();
//        List<Object> listObject = new ArrayList<Integer>();
        List<?> list = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();

        List<? extends Number> list3 = new ArrayList<Integer>();

        List<Double> listDouble = new ArrayList<>();
        listDouble.add(3.14);
        listDouble.add(3.15);
        listDouble.add(3.16);
        showListInfo(listDouble);
        summ((ArrayList<? extends Number>) listDouble);

        List<String> stringList = new ArrayList<>();
        stringList.add("Hallo");
        stringList.add("OK");
        stringList.add("Bye");
        showListInfo(stringList);
//        summ(stringList);

        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(10);
        listInteger.add(20);
        listInteger.add(30);
        showListInfo(listInteger);
        summ((ArrayList<? extends Number>) listInteger);
    }

    static void showListInfo(List list) { // не нужен <?>
        System.out.println(list);
    }

    static double summ(ArrayList<? extends Number> al) { // <? super  Number?>
        double summ = 0;
        for (Number element: al) {
            summ += element.doubleValue();
        }
        return summ;
    }


}
