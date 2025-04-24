package ch14.sec00.ex0;

import lombok.Data;

import java.util.Random;

@Data
public class Player implements Runnable {
    private String name;

    private final Random random = new Random();

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            int curr = Main.count;

            Thread.sleep(random.nextInt(5) * 200);

            // 슬립 전 후 숫자 비교 - 달라졌다면 - 다른 player가 Main.count 증가시킨 것
            while (curr != Main.count) {
                Thread.sleep(random.nextInt(5) * 200);
                curr = Main.count;
            }
            synchronized (Main.class) {
                int callNum = ++Main.count;
                System.out.printf("%-10s : %2d \n", name, callNum);
                if (callNum == Main.finalNumber) {
                    System.out.println(name + "벌칙 당첨!");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
