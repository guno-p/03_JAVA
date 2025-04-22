package ch09.sec05.exam02;

public class Button2Example {
    public static void main(String[] args) {
        Button2 btnOk = new Button2();

        btnOk.setClickListener(new Button2.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Ok 버튼을 클릭했습니다.");
            }
        });

        btnOk.click();
    }
}
