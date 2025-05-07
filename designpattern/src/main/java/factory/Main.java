package factory;

import factory.framework.Factory;
import factory.framework.Product;
import factory.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        // 카드가 ID 카드인 것을 아는 방법은 IDCardFactory 라는 점 뿐이다.
        // OCP 의 핵심은 사용자 측의 코드 변경은 없다는 것
        Product card1 = factory.create("Kim");
        Product card2 = factory.create("Son");
        Product card3 = factory.create("Park");

        System.out.println();

        // 표준 사용법
        card1.use();
        card2.use();
        card3.use();
    }
}
