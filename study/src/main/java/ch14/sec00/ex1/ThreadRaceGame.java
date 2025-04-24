package ch14.sec00.ex1;

public class ThreadRaceGame {
    public static final int RACE_DISTANCE = 20;
    public static boolean gameFinished = false;

    public static void main(String[] args) {
        System.out.println("경주 시작 💨");

        Thread racer1 = new Thread(new Racer("토끼"), "[토끼 스레드]");
        Thread racer2 = new Thread(new Racer("거북이"), "[거북이 스레드]");
        Thread racer3 = new Thread(new Racer("사자"), "[사자 스레드]");
        racer1.start();
        racer2.start();
        racer3.start();
        try {
            racer1.join();
            racer2.join();
            racer3.join();
            System.out.println("--- 경주 종료 ---");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    // 경주 진행 상황 시각화
    public static synchronized void printRaceProgress(String name, int position) {
        int adjustedPosition = Math.min(position, RACE_DISTANCE);
        System.out.print(name + ": ");

        String icon = null;
        switch (name){
            case "[사자 스레드]" : icon = "🦁"; break;
            case "[토끼 스레드]" : icon = "🐰"; break;
            case "[거북이 스레드]" : icon = "🐢"; break;
        }

        for (int i = 0; i < RACE_DISTANCE; i++) {
            if (i <= adjustedPosition) {
                System.out.print(icon);  // 이동한 거리
            } else {
                System.out.print("⬜");  // 남은 거리
            }
        }

        System.out.println(" " + adjustedPosition + "/" + RACE_DISTANCE);
    }
}
