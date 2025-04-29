package week2.recursive;

public class Fibo {
    public static void main(String[] args) {
        System.out.println(fibo(5));
    }
    public static int fibo(int n) {
        if ( n == 1 || n == 2) {
            return 1;
        }
        else {
            return fibo(n-1) + fibo(n-2);
        }
    }
}
