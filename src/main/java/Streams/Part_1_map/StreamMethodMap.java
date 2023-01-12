package Streams.Part_1_map;

import java.util.*;
import java.util.stream.Collectors;

public class StreamMethodMap {
    public static void main(String[] args) {
        List<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Hallo");
        stringArrayList.add(" Leo!");
        stringArrayList.add(" Be ");
        stringArrayList.add("ready for ");
        stringArrayList.add(" Java ");
        stringArrayList.add(" interview!");

        List<String> stringArrayList2 = new ArrayList<>(stringArrayList);

        System.out.println("stringArrayList " + stringArrayList);
        for (int i = 0; i < stringArrayList.size(); i++) {
            stringArrayList.set(i, String.valueOf(stringArrayList.get(i).length()));
        }
        System.out.println("stringArrayList after set method " + stringArrayList);
        System.out.println();

        List<Integer> integerList = stringArrayList2.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println("stringArrayList2 " + stringArrayList2);
        System.out.println("integerList " + integerList);
        System.out.println();

        int[] array = {5, 9, 3, 8, 1};
        System.out.println(Arrays.toString(array));
        array = Arrays.stream(array).map(el -> {
            if(el % 3 == 0) {
                el = el / 3;
            }
            return el;
        }).toArray();
        System.out.println(Arrays.toString(array));
        System.out.println();

        Set<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("Hallo");
        stringTreeSet.add(" Leo!");
        stringTreeSet.add(" Be ");
        stringTreeSet.add("ready for ");
        stringTreeSet.add(" Java ");
        stringTreeSet.add(" interview!");
        stringTreeSet.add(" interview!");
//        stringTreeSet.add(null);

        System.out.println(stringTreeSet);
        Set<Integer> integerSet = stringTreeSet.stream().map(el -> el.length()).collect(Collectors.toSet());
        List<Integer> integerList2 = stringTreeSet.stream().map(el -> el.length()).collect(Collectors.toList());
        System.out.println(integerSet);
        System.out.println(integerList2);
        System.out.println();
    }
}
