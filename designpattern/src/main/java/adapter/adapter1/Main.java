package adapter.adapter1;

public class Main {
    public static void main(String[] args) {
//        Print p = new PrintBanner("Hello");
//        p.printWeak();
//        p.printStrong();
        print(new PrintBanner("Inner"));
    }
    public static void print(Print p) {
        p.printWeak();
        p.printStrong();
    }
}
