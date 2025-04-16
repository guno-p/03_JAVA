package ch06.sec08.exam02;

public class Computer {
    int sum (int ...values) {
        int result = 0;
        for (int value : values) {
            result += value;
        }
        return result;
    }
}
