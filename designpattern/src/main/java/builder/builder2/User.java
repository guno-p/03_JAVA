package builder.builder2;

public class User {
    private String name;
    private String email;
    private String password;
    private String phone;
    private String address;
    private boolean sex;
    private int age;

    public User() {
    }

    @Override
    public String toString() {
        return name + " " + email + " " + password + " " + phone + " " + address + " " + sex + " " + age;
    }

    private User(String name, String email, String password, String phone, String address, boolean sex, int age) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.sex = sex;
        this.age = age;
    }

    // 반드시 static
    // static이 없다면? 외부클래스의 인스턴스가 반드시 있어야함
    public static class Builder {
        private String name;
        private String email;
        private String password;
        private String phone;
        private String address;
        private boolean sex;
        private int age;

        private Builder() {}

        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder email(String email) {
            this.email = email;
            return this;
        }
        public Builder password(String password) {
            this.password = password;
            return this;
        }
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }
        public Builder address(String address) {
            this.address = address;
            return this;
        }
        public Builder sex(boolean sex) {
            this.sex = sex;
            return this;
        }
        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(name, email, password, phone, address, sex, age);
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}
