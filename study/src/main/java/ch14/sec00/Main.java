package ch14.sec00;

public class Main {
    public static void main(String[] args) {
        System.out.println("simulator");

        Bridge bridge = new Bridge();
        new Knight(bridge, "박건호", "박달").start();
        new Knight(bridge, "임꺽정", "임실").start();
        new Knight(bridge, "홍길동", "홍천").start();
    }
}
