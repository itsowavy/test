package itsowavy.test.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenerateRequestTest {

    @Test
    void typeTest() {
        GenerateRequest request = new TTSRequest("text", "delimiter", "tts");
        System.out.println(request.getDelimiter());

        System.out.println(request instanceof TTSRequest);
        System.out.println(request instanceof TVCRequest);
        System.out.println(request instanceof GenerateRequest);
    }

}