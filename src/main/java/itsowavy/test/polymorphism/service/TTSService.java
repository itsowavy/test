package itsowavy.test.polymorphism.service;

import org.springframework.stereotype.Component;

@Component
public class TTSService extends SpeechService {

    private final String KEY = "TTS";

    @Override
    public String compose(String str) {
        System.out.println("TTS Service: ACCEPT");
        return addString(str);
    }

    @Override
    public boolean can(String str) {
        return str.startsWith(KEY);
    }
}
