package ch07.sec07.exam01;

public class PromotionExample {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = c;

        B b1 = d;
        C c1 = e;

//        B b3 = e;
//        C c2 = d;
//      상속관계에 있지 않은 클래스
//      -> 자동 타입 변환 불가
//      -> 컴파일 에러
    }
}
