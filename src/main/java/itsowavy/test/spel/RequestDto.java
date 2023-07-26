package itsowavy.test.spel;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class RequestDto {

    private String name;
    private String password;

    public String getKey() {
        return name + password;
    }
}
