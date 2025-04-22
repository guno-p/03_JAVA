package adapter.adapter2;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();

        print(new PrintBanner(new Banner("Banner")));
    }

    public static void print(Print p) {
        p.printWeak();
        p.printStrong();
    }
}
