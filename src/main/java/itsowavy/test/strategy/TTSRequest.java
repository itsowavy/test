package itsowavy.test.strategy;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class TTSRequest extends GenerateRequest{

    private String tts;

    public TTSRequest(String text, String delimiter, String tts) {
        super(text, delimiter);
        this.tts = tts;
    }
}
