package ch12.sec04;

public class MeasureRunTimeExample {
    public static void main(String[] args) {

        long start = System.nanoTime();

        int sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }

        long end = System.nanoTime();
        System.out.println("Sum: " + sum);
        System.out.println("걸린 시간 : " + (end - start) + " ns");
    }
}
