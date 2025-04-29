package ch13.sec02.exam01;

public class Product<K, M> {
    private K Kind;
    private M model;

    public K getKind() {
        return Kind;
    }

    public void setKind(K kind) {
        Kind = kind;
    }

    public M getModel() {
        return model;
    }

    public void setModel(M model) {
        this.model = model;
    }
}
