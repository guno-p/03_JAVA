package ch16.exam01;

public class LambdaExample {
    public static void main(String[] args) {
        Person p = new Person();

        // 익명구현체

/*
        p.action(new Workable() {
            @Override
            public void work() {
                System.out.println("익명구현체 Work");
            }
        });
*/
        p.action(() -> {
            System.out.println("Lambda 구현");
            System.out.println("일을 해야합니다.");
        });
    }
}
