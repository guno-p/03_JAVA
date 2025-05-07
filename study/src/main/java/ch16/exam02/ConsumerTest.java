package ch16.exam02;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        // Consumer 계열 : 매개 변수 0, 반환형 X
        // - 매개 변수를 전부 소비한다.

        // 익명 클래스 형식
        Consumer<String> printString = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("s = " + s);
            }
        };
        printString.accept("익명 클래스로 Consumer의 accept 구현");

        // 람다 형식
        Consumer<String> printString2 = (s) -> {
            System.out.println("s = " + s);
        };
        printString2.accept("람다식 구현은 시그니처 동일");

        // BiConsumer<T, U> : 매개변수 T, U 두개 소비
        BiConsumer<String, Integer> printNameAge =
                (s, age) -> System.out.println("s = " + s + " age = " + age);
        printNameAge.accept("홍길동", 21);
    }
;}
