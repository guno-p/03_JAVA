package builder.builder3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private String email;
    private String password;
    private String phone;
    private String address;
    private int age;
}
