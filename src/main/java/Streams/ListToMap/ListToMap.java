package Streams.ListToMap;

import java.util.*;

/**
 * Transform List of Strings with numbers to the key and it's
 */

public class ListToMap {
    public static void main(String[] args) {
        List<String> arrayList = getRandomStringList(); // creates random arrayList of Strings
        System.out.println(arrayList);

        Map<String, Integer> treeMap = getMapOfRepeatableItemsFromList(arrayList);
        System.out.println(treeMap);

        treeMap.clear();
        System.out.println(treeMap);
        treeMap = getMapOfRepeatableItemsFromListByStreams(arrayList);
        System.out.println(treeMap);
    }

    static List<String> getRandomStringList() {
        final int RANGE_OF_INT_FOR_STRING = 10;
        List<String> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < RANGE_OF_INT_FOR_STRING; i++) {
            list.add(((Integer) random.nextInt(RANGE_OF_INT_FOR_STRING)).toString());
        }
        return list;
    }

    @MethodDescription
    static Map<String, Integer> getMapOfRepeatableItemsFromList(List<String> stringList) {

        Map<String, Integer> treeMap = new TreeMap<>(); // for auto sorting during adding elements

        for (int i = 0; i < stringList.size(); i++) {
            int entryOfElementsCount = 0; // counter of the equals element entry in list
            String element = stringList.get(i); // get current element from list
            for (int j = 0; j < stringList.size(); j++) {
                if (element.compareToIgnoreCase(stringList.get(i)) == 0) {
                    entryOfElementsCount++;
                }
            }
            treeMap.put(element, entryOfElementsCount);
        }
        return treeMap; // return filled treeMap
    }

    @MethodDescription(name = "resolving by Streams")
    static Map<String, Integer> getMapOfRepeatableItemsFromListByStreams(List<String> stringList) {

        Map<String, Integer> treeMap = new TreeMap<>(); // for auto sorting during adding elements

        stringList.forEach(element -> treeMap.put(element, 1));
        return treeMap; // return filled treeMap
    }

    private int returnEntryOfElements(List<String> list) {
//        list.stream().filter()
        return 0;
    }
}

