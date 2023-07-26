package itsowavy.test.polymorphism.service;

import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UVCService extends SpeechService{

    private final String KEY = "UVC";

    @Override
    public String compose(String str) {
        System.out.println("UVC Service: ACCEPT");
        return addString(str);
    }

    @Override
    public boolean can(String str) {
        return str.startsWith(KEY);
    }
}
