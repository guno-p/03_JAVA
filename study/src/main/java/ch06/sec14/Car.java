package ch06.sec14;

public class Car {
//    필드 선언
    private int speed;
    private  boolean stop;

//    생성자는 기본 생성자와 모든 필드를 받는 생성자 습관적으로 만들기
    public Car() {
    }
    public Car(int speed, boolean stop) {
        this.speed = speed;
        this.stop = stop;
    }

//    private 필드에 대해 getter setter 만들기
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

//    boolean setter 는 is 로 시작하는 모오습
    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }
}
