package ch09.sec05.exam02;

public class Button2 {
    public static interface ClickListener {
        void onClick();
    }

    private ClickListener clickListener;
    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click() {
        this.clickListener.onClick();
    }
}
