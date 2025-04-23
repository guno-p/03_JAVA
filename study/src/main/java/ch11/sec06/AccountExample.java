package ch11.sec06;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);
        System.out.println("입금 후 잔고 : " + account.getBalance());
        try {
            account.withdraw(5000);
            System.out.println("출금 후 잔고 : " + account.getBalance());
            account.withdraw(7000);
            System.out.println("출금 후 잔고 : " + account.getBalance());
        } catch (InsufficientException e) {
            System.out.println(e.getMessage());
        }
    }
}
