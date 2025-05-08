package ch17.sec6.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapExample {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};

        IntStream stream = Arrays.stream(intArray);
        stream.asDoubleStream().forEach(System.out::println);
        System.out.println();

        stream = Arrays.stream(intArray);
        stream.boxed().forEach(obj -> System.out.println(obj.intValue()));
    }
}
