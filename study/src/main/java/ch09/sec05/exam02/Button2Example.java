package ch09.sec05.exam02;

public class Button2Example {
    public static void main(String[] args) {
//        Button2 btnOk = new Button2();

//        btnOk.setClickListener(new Button2.ClickListener() {
//            @Override
//            public void onClick() {
//                System.out.println("Ok 버튼을 클릭했습니다.");
//            }
//        });

//        btnOk.click();

//      static 을 사용한 인터페이스는 왜 정의할까?
//      내부 인터페이스인 클릭 리스너는 어차피 버튼이라면 다 가지고 있어야 하는 객체
//      버튼을 실제로 인스턴스화 하지 않고도 일단은 그 클릭 리스너를 구현 먼저 할수 있게 해주고
//      나중에 버튼을 인스턴스화 하면 버튼의 Set 에 매개변수로 넣게 편의를 봐주고자... static 사용
        
        Button2.ClickListener okListener = new Button2.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("OK");
            }
        };
        okListener.onClick();
        
    }
}
