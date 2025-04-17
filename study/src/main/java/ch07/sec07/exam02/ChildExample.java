package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child;
        parent.method1();
        parent.method2();
//        parent.method3();
//      parent 는 Parent 타입이기 때문에
//      Child 에 정의된 method3() 실행 불가
//      컴파일러가 Parent 클래스에 정의된 메서드만 사용가능하도록 판단

//      Child가 method2를 오버라이딩 했으면
//      method2는 부모에서 정의한 메소드이기 때문에 사용 가능한 것으로 컴파일러가 판단
//      실제 실행은 동적 바인딩으로 Child 인스턴스에서 정의된 method2 실행
    }
}
