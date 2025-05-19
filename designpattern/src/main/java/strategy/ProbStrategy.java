package strategy;

import java.util.Random;

public class ProbStrategy implements Strategy {
    private Random random;
    private int prevHandValue = 0;
    private int currentHandValue = 0;
    private int [][] history = {
            { 1, 1, 1},
            { 1, 1, 1},
            { 1, 1, 1},
    };
    // int [이전 hand] [가위? 바위? 보?]

    public ProbStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        // 현재 손을 기반으로 다음 손의 확률 계산
        int bet = random.nextInt(getSum(currentHandValue));
        int handvalue = 0;

        // 가중치를 기반으로 다음 손 결정
        if(bet < history[currentHandValue][0]) {
            handvalue = 0;// 바위
        } else if(bet < history[currentHandValue][0] + history[currentHandValue][1]) {
            handvalue = 1;// 가위
        } else {
            handvalue = 2;// 보
        }

        // 현재 손을 이전 손으로, 새로 결정한 손을 현재 손으로 업데이트
        prevHandValue = currentHandValue;
        currentHandValue = handvalue;

        return Hand.getHand(handvalue);
    }

    // 특정 손 다음에 각 손을 낼 확률의 총합 계산
    private int getSum(int handvalue) {
        int sum = 0;
        for(int i = 0; i < 3; i++) {
            sum += history[handvalue][i];
        }
        return sum;
    }

    @Override
    public void study(boolean win) {
        if(win) {
            // 이긴 경우: 이전 손에서 현재 손으로의 가중치 증가
            history[prevHandValue][currentHandValue]++;
        } else {
            // 진 경우: 이전 손에서 다른 두 손으로의 가중치 증가
            history[prevHandValue][(currentHandValue + 1) % 3]++;
            history[prevHandValue][(currentHandValue + 2) % 3]++;
        }
    }
}
