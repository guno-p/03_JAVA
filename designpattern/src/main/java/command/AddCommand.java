package command;

import java.util.Scanner;

public class AddCommand implements Command {
    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        System.out.printf("%d + %d  = %d\n", a, b, a+b);
    }
}
