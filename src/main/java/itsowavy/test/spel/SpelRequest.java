package itsowavy.test.spel;

import org.springframework.stereotype.Component;

@Component
public class SpelRequest {

    @testAnno(value = "#{requestDto.name}")
    public String giveRequest(RequestDto requestDto) {
        String key = requestDto.getKey();
        return key;
    }
}
