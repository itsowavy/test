package itsowavy.test.spel;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpelRequestTestAnno {

    @Autowired
    SpelRequest spelRequest;

    @Test
    void test() {
        RequestDto requestDto = new RequestDto("hongKilDong", "1234");
        spelRequest.giveRequest(requestDto);
    }

}