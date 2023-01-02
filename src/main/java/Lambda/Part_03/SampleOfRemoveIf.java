package Lambda.Part_03;

import java.util.ArrayList;
import java.util.function.Predicate;

public class SampleOfRemoveIf {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Hallo");
        stringArrayList.add(" Leo");
        stringArrayList.add(" Be ");
        stringArrayList.add("ready to ");
        stringArrayList.add(" Java ");
        stringArrayList.add(" interview!");
        stringArrayList.add(" interview!");

        System.out.println(stringArrayList);
        System.out.println();
        stringArrayList.removeIf(element -> element.length() < 5);
//        stringArrayList.removeIf(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {//                return s.length() < 5;
//            }
//        });
//        Predicate<String> predicate = element -> {
//            return element.length() < 5;
//        };
//        stringArrayList.removeIf(predicate);
//
        System.out.println(stringArrayList);
    }
}
