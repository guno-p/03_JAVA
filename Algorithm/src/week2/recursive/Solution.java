package week2.recursive;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

class Solution {
    static int totalCoin = 0;

    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{1}, 1));

    }

    public static int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int remain = amount;

        for (int i= (coins.length-1); i>=0; i--) {
            int coin = coins[i];
            remain = recursive(coin, remain);
        }

        if (remain == 0) {
            return totalCoin;
        }
        else {
            return -1;
        }
    }

    public static int recursive(int coin, int remain) {
        if (remain - coin >= 0) {
            totalCoin++;
            return recursive(coin, remain - coin);
        }
        else {
            return remain;
        }
    }
}