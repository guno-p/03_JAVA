package template;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay display = new CharDisplay('a');

        display.display();

        System.out.println();
        AbstractDisplay display2 = new StringDisplay("xxxxx");
        display2.display();
    }
}
