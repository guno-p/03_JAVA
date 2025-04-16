package ch06.sec14;

public class Car {
//    필드 선언
    private int speed;
    private  boolean stop;

//    private 필드에 대해 getter setter 만들기
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
            return;
        }
        else {
            this.speed = speed;
        }
    }

//    boolean setter 는 is 로 시작
    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
        if (stop) this.speed = 0;
    }
}
