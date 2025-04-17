package ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();

        parent.field1 = "data1";
        parent.method1();
        parent.method2();

//      parent.field2 = "data2";
//      parent.method3();
//      Parent 에서 정의된 필드와 메소드만 사용 가능


//      Child 타입으로 강제 타입 변환
        Child child = (Child) parent;
        child.field2 = "data2";
        child.method3();
    }
}
