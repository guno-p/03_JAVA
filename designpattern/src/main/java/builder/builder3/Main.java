package builder.builder3;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .phone("010-2309-1234")
                .name("홍길동")
                .build();

        System.out.println(user.toString());
    }
}
