package itsowavy.test.strategy;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class TVCRequest extends GenerateRequest{

    private String tvc;

    public TVCRequest(String text, String delimiter, String tvc) {
        super(text, delimiter);
        this.tvc = tvc;
    }
}
