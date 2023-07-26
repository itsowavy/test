package itsowavy.test.polymorphism.service;

import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class TVCService extends SpeechService{

    private final String KEY = "TVC";

    @Override
    public String compose(String str) {
        System.out.println("TVC Service: ACCEPT");
        return addString(str);
    }

    @Override
    public boolean can(String str) {
        return str.startsWith(KEY);
    }
}
