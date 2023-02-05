package Streams.Part_10_ParallelStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SampleOfParallelStream {
    public static void main(String[] args) {
        // 1. 2. .3 ... 1_000_000
        //

        final int RANGE_NUMBER = 1_000_000;
//        List<Integer> arrayList = new ArrayList<>();
        List<Integer> arrayList = new ArrayList<>(RANGE_NUMBER);
        int[] array = new int[10];
        int temperature;
        //-> 1.2, 1.22, ..... 10000

        for (int i = 1; i <= arrayList.size(); i++) { // [1...0]   arrayList.size() == 0
            arrayList.add(i);
        }
        System.out.println(arrayList);

        for (int i = 1; i <= RANGE_NUMBER ; i++) {
            arrayList.add(i);
        }
//        System.out.println(arrayList);

        //sum
        long startTime = System.currentTimeMillis();
        long result = arrayList.stream().reduce((accumulator, element) -> accumulator + element).get();
        long endTime = System.currentTimeMillis();
        System.out.println("result of serial stream " + result + " processing time " + (endTime - startTime));

        //Processor1  1...250_0000 -> Result1
        //Processor2  250_0000...500_000 -> Result2
        //Processor3  500_0000...750_000 -> Result3
        //Processor4  750_0000...1_000_000 -> -> Result2
        //Result = Result1 + Result2 + Result3 + Result4

        long startTime2 = System.currentTimeMillis();
        long result2 = arrayList.parallelStream().reduce((accumulator, element) -> accumulator + element).get();
        long endTime2 = System.currentTimeMillis();
        System.out.println("result of parallel stream " + result2 + " processing time " + (endTime2 - startTime2));

        IntStream str = IntStream.range(20, 30);
        str.forEach(System.out::println);
    }
}
