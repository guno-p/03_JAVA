package strategy;
/**
 * 가위바위보 게임을 실행하는 메인 클래스
 * - 구성 편집 -> 프로그램 인수에 난수 시드값 2개(정수) 설정 후 실행
 */
public class Main {
    public static void main(String[] args) {

        // 명령행 인수 확인
        if (args.length != 2) {
            System.out.println("Usage: java Main randomseed1 randomseed2");
            System.out.println("Example: java Main 314 15");
            System.exit(0);
        }

        // 난수 시드값 설정
        int seed1 = Integer.parseInt(args[0]);
        int seed2 = Integer.parseInt(args[1]);

        // 플레이어 생성 (각각 다른 전략 사용)
        Player player1 = new Player("KIM", new WinningStrategy(seed1));
        Player player2 = new Player("LEE", new ProbStrategy(seed2));

        // 10000번의 게임 실행
        for (int i = 0; i < 10000; i++) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();

            // 승패 판정 및 결과 출력
            if (nextHand1.isStrongerThan(nextHand2)) {
                System.out.println("Winner: " + player1);
                player1.win();
                player2.lose();
            } else if (nextHand2.isStrongerThan(nextHand1)) {
                System.out.println("Winner: " + player2);
                player1.lose();
                player2.win();
            } else {
                System.out.println("Even...");
                player1.even();
                player2.even();
            }
        }

// 최종 결과 출력
        System.out.println("Total result");
        System.out.println(player1);
        System.out.println(player2);
    }
}
