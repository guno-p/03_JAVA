package prototype.framework;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

//        UnderlinePen upen = new UnderlinePen('-');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');

//        manager.register("strong message", upen);

        Product p1 = manager.create("strong message");
        p1.use("Hello, woreld!");
    }
}
