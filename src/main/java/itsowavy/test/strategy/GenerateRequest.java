package itsowavy.test.strategy;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class GenerateRequest {

    private String text;
    private String delimiter;

}
