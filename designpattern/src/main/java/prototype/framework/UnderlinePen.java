package prototype.framework;

public class UnderlinePen implements Product{
    private String message;

    @Override
    public void use(String s) {
        this.message = s;
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
