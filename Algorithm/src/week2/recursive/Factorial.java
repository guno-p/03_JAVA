package week2.recursive;

public class Factorial {
    public static void main(String[] args) {
        int number = 3;
        System.out.println(factorial(number));
    }
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
