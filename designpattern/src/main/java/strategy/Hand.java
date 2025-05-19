package strategy;

public enum Hand {
    ROCK("바위", 0),
    SCISSORS("가위", 1),
    PAPER("보", 2);

    private String name;
    private int handvalue;

    private Hand(String name, int handvalue) {
        this.name = name;
        this.handvalue = handvalue;
    }

    private static Hand[] hands = {
            ROCK, SCISSORS, PAPER
    };

    public static Hand getHand(int handvalue) {
        return hands[handvalue];
    }

    /**
     *
     * @param h 비교할 다른 손
     * @return 무승부는 0, this가 이기면 1. h가 이기면 -1
     */
    private int fight(Hand h) {
        if(this == h) {
            return 0;// 같은 손이면 무승부
        } else if((this.handvalue + 1) % 3 == h.handvalue) {
            return 1;// 이 손이 이기는 경우
        } else {
            return -1;// 이 손이 지는 경우
        }
    }

    // this가 h보다 강할 때 true 반환
    public boolean isStrongerThan(Hand h) {
        return fight(h) == 1;
    }

    // this가 h보다 약할 때 true 반환
    public boolean isWeakerThan(Hand h) {
        return fight(h) == -1;
    }

    // 가위 바위 보의 문자열 표현
    @Override
    public String toString() {
        return name;
    }
}