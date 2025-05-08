package ch17.ex1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DelayOperation {
    public static void main(String[] args) throws InterruptedException {

        /*
        * 지연 연산
        * 최종연산이 수행되기 전까지 중간 연산은 실행되지 않음
        * */
        List<String> names = Arrays.asList("신짱구", "훈이", "유리", "철수");

        Stream<String> stream = names.stream()
                .filter(name -> {
                    System.out.println("filter: " + name);
                    return name.length() > 2;
                })
                .map(name -> {
                    System.out.println("map: " + name);
                    return name + "님";
                });


        // 필터를 먼저 모두 통과하고 최종 결과 코드를 사용해야 변함을 확인 가능
    Thread.sleep(3000);
    stream.forEach(System.out::println);
    }
}
