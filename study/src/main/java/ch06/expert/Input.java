package ch06.expert;

import java.util.Scanner;

public class Input {
    public static Scanner scanner = new Scanner(System.in);

    public static String read(String title) {
        System.out.print(title);
        return scanner.nextLine();
    }

    public static String read(String title, String defaultValue) {
        System.out.print(title);
        String value = scanner.nextLine();
        if (value.isEmpty()) {
            return defaultValue;
        }
        else {
            return value;
        }
    }

    public static int readInt(String title) {
        System.out.print(title);
//        int input = scanner.nextInt();
//        scanner.nextLine();
        // scanner nextInt() 는 int 만 가져오고 \n 은 안가져온다.
        return Integer.parseInt(scanner.nextLine());
    }

    public static boolean confirm(String title, boolean defaultValue) {
        System.out.print(title);

        if (defaultValue) {
            System.out.print("(Y/n): ");
        }
        else {
            System.out.print("(y/N): ");
        }

        String value = scanner.nextLine();

        if(value.isEmpty()) {
            return defaultValue;
        }
        else if (value.equals("n") || value.equals("N")){
            return false;
        }
        else {
            return true;
        }
    }
    public static boolean confirm(String title) {
        return confirm(title, true);
    }
}
