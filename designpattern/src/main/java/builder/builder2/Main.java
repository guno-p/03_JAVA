package builder.builder2;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .age(13)
                .address("25-1")
                .email("sample@gmail.com")
                .sex(true)
                .name("홍길동")
                .phone("010-1111-2222")
                .password("qwer1234")
                .build();

        System.out.println(user.toString());
    }
}
