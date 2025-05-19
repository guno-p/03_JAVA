package strategy;

/**
 * 전략을 사용하여 가위바위보를 하는 플레이어 클래스
 */

public class Player {
    private String name;// 플레이어 이름
    private Strategy strategy;// 사용할 전략
    private int wincount;// 승리 횟수
    private int losecount;// 패배 횟수
    private int gamecount;// 총 게임 횟수

    // 생성자: 이름과 사용할 전략을 받음
    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    // 전략에 따라 다음 손을 결정
    public Hand nextHand() {
        return strategy.nextHand();
    }

    // 승리 처리
    public void win() {
        strategy.study(true);// 전략에게 승리 학습 지시
        wincount++;
        gamecount++;
    }

    // 패배 처리
    public void lose() {
        strategy.study(false);// 전략에게 패배 학습 지시
        losecount++;
        gamecount++;
    }

    // 무승부 처리
    public void even() {
        gamecount++;
    }

    // 플레이어 정보 문자열 반환
    @Override
    public String toString() {
        return "[" +
                name + ":" +
                gamecount + " games, " +
                wincount + " win, " +
                losecount + " lose" +
                "]";
    }
}
