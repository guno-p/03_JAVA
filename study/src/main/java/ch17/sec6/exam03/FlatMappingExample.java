package ch17.sec6.exam03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("this is java");
        list1.add("i am a best developer");

        list1.stream()
                .flatMap(str -> Arrays.stream(str.split(" ")))
                .forEach(word -> System.out.println(word));
        System.out.println();

        List<String> list2 = Arrays.asList("10, 20, 30", "40, 50");
        list2.stream()
                .flatMapToInt(data -> {
                    String[] words = data.split(",");
                    int[] arr = new int[words.length];
                    for (int i = 0; i < words.length; i++) {
                        arr[i] = Integer.parseInt(words[i].trim());
                    }
                    return Arrays.stream(arr);
                })
                .forEach(i -> System.out.println(i));
    }
}
