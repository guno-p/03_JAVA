package ch16.exam03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodRefTest {
    public static void main(String[] args) {
        // 1. static 메서드 참조
        // Function<T, R> : T를 받으면 R 을 반환

        // 1-1 익명 구현 객체
        Function<Integer, Integer> abs1 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return Math.abs(integer);
            }
        };
        System.out.println(abs1.apply(-1));

        // 1-2 람다식
        Function<Integer, Integer> abs2 = i -> Math.abs(i);
        System.out.println(abs2.apply(-2));

        // 1-3 정적 메서드 참조
        Function<Integer, Integer> abs3 = Math::abs;
        System.out.println(abs3.apply(-3));
        
        // 2. 인스턴스 메서드 참조
        // - 문자열 소문자로 변경하기

        // 2-1 익명 구현 객체
        String str = "Hello Guno!";

        Supplier<String> supplier1 = new Supplier<String>() {
            @Override
            public String get() {
                return str.toLowerCase();
            }
        };

        // 2-2 람다식으로 변경
        Supplier<String> supplier2 = () -> str.toLowerCase();

        // 2-3 람다식으로 변경
        Supplier<String> supplier3 = str::toLowerCase;

        System.out.println(supplier1.get());
        System.out.println(supplier2.get());
        System.out.println(supplier3.get());

        // 3. 특정 타입의 인스턴스 메서드 참조
        // - 문자열 길이 반환
        // 람다식: (String s) -> {return s.length();}
        // 중복을 제거하는 메서드 참조에서는 s가 겹치니까! s를 없앤다고 생각한다.
        Function<String, Integer> strLength1 = s -> s.length();
        System.out.println(strLength1.apply(str));
        // 인스턴스 고정 X
        // 타입이 맞는 매개변수가 전달되어 오면
        // 해당 타입의 공통된 메서드 length 를 참조하여 수행
        Function<String, Integer> strLength2 = String::length;
        System.out.println(strLength2.apply(str));

        // List 순차 접근 후 출력
        List<String> nameList = new ArrayList<>();
        nameList.add("Guno");
        nameList.add("Jane");
        nameList.add("Bob");
        nameList.add("Mary");

        nameList.forEach( name -> System.out.println(name));
        System.out.println("=====");
        nameList.forEach(System.out::println);
        // nameList 의 모든 요소를 순차 접근 (Consumer)
        // 각 요소를 System.out의 println 의 매개변수로 전달
        // 수행 (Consume)


        // 4. 매개변수 메서드 참조
        // 4-1 람다식
        BinaryOperator<Integer> operator1 = (a, b) -> a + b;
        System.out.println("sum1: " + sumTwoNumbers(operator1, 10, 20));
        System.out.println("sum2: " + sumTwoNumbers((a,b)-> a+b, 10,20));

        // 내가 만든 정적메서드 참조
        System.out.println("sum3: " + sumTwoNumbers(MethodRefTest::sum, 10, 20));

        System.out.println("sum4: " + sumTwoNumbers(Integer::sum, 10, 20));
    }

    // BinaryOperator<T> : T 매개변수 2개 -> T 1개로 반환
    public static int sumTwoNumbers(BinaryOperator<Integer> op, int a, int b) {
        return op.apply(a, b);
    }
    // 내가 만든 더하기 메서드 (int 매개변수 2개 -> int 1개로 반환)
    public static int sum(int a, int b) {
        return a+b;
    }
}
