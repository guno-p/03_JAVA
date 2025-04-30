package command;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Command[] commands = {
                new AddCommand(),
                new OpenCommand(),
                new PrintCommand(),
                new ExitCommand()
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
//          이 execute는 변화가 없어야함.
        }
    }
}
