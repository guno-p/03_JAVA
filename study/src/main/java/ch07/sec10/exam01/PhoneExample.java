package ch07.sec10.exam01;

public class PhoneExample {
    public static void main(String[] args) {
//        Phone phone = new Phone();
//        추상클래스는 new 연산자를 통해 객체를 만들지 못한다.
//        오직 상속을 통한 자식 클래스만 만들 수 있다.

        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
