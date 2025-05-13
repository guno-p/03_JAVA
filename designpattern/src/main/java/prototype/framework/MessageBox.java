package prototype.framework;

public class MessageBox implements Product{
    private char symbol;
    public MessageBox(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public void use(String s) {
        int decolen = 1 + s.length() + 1;
        for(int i = 0; i < decolen; i++) {
            System.out.print(decolen);
        }
        System.out.println();
        System.out.println(decolen + s + decolen);

        for(int i = 0; i < decolen; i++) {
            System.out.print(decolen);
        }
        System.out.println();
    }

    @Override
    public Product createCopy() {
        Product p = null;

        try {
            // Object object.clone()
            // 반환이 Object이기 때문에 반드시 다운캐스팅
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            // Cloneable 인터페이스를 구현 안한 객체는 이 예외를 발생시킨다.
            e.printStackTrace();
        }

        return p;
    }
}
