package ch16.exam01;

public class Person {
    // 매개변수로 Workable 인터페이스를 구현한 객체를 전달받아야 한다.
    public void action(Workable w) {
        w.work();
    }
}
