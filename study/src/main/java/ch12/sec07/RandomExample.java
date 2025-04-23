package ch12.sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random rand = new Random(System.currentTimeMillis());

        int[] select = new int[6];

        System.out.print("선택 번호 : ");
        for (int i = 0; i < 6; i++) {
            select[i] = rand.nextInt(45) + 1;
            System.out.print(select[i] + " ");
        }
        System.out.println();

        int[] win = new int[6];

        System.out.print("당첨 번호 : ");
        for (int i = 0; i < 6; i++) {
            win[i] = rand.nextInt(45) + 1;
            System.out.print(win[i] + " ");
        }
        System.out.println();

        Arrays.sort(select);
        Arrays.sort(win);
        boolean result = Arrays.equals(select, win);

        System.out.print("당첨 여부 : ");
        if (result) {
            System.out.println("1등 당첨");
        } else {
            System.out.println("당첨 되지 않았습니다.");
        }
    }
}
