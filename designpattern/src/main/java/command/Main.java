package command;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileService fs = new FileService();

        Command[] commands = {
//                new AddCommand(),
                () -> System.out.println("Add Command"),
//                new OpenCommand(),
                fs::open, // () -> fs.open()
                // 메서드의 시그니처가 맞다면 메서드 참조로 사용
//                new PrintCommand(),
                fs::print, // () -> fs.print()
//                new ExitCommand(),
                Main::exit // Main.exit()
        };

        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1: Add, 2: Open, 3: Print, 4: Exit");
            System.out.print("Enter command: ");
            int select = sc.nextInt();

            /*
            * 다중 If 문 없이
            * 무엇을 실행하더라도 같은 코드로서 실행이 되도록 구현하는것이
            * Command 패턴의 핵심!!!
            * 실행코드에는 변화가 없어야 하는것이 핵심이다.
            * */
            commands[select-1].execute();
//          이 execute 는 변화가 없어야함.
        }
    }

    public static void exit() {
        // 매개변수가 없고 리턴도 보이드이기 때문에
        // Command 인터페이스 람다 가능
        Scanner sc = new Scanner(System.in);
        System.out.println("종료할까요?(Y/n)");
        String answer = sc.nextLine();

        sc.close();

        if(answer.isEmpty() || answer.equalsIgnoreCase("Y")) {
            System.exit(0);
        }
    }
}
