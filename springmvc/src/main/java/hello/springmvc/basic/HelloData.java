package hello.springmvc.basic;

import lombok.Data;

@Data // @Setter, @Getter, @ToString, @EqualsAndHashCode, @RequiredArgsConstructor 포함
public class HelloData {
    private String username;
    private int age;
}
