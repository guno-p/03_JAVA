package ch15.sec06.exam01;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackExample {
    public static void main(String[] args) {
        Deque<Coin> stack = new ArrayDeque<>();
        stack.push(new Coin(100));
        stack.push(new Coin(50));
        stack.push(new Coin(500));
        stack.push(new Coin(10));

        while (!stack.isEmpty()) {
            Coin coin = stack.pop();
            System.out.println("꺼내온 동전 : " + coin.getValue());
        }
    }
}
