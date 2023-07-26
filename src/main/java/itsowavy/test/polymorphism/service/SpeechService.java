package itsowavy.test.polymorphism.service;

import java.util.Optional;

public abstract class SpeechService {

    public abstract String compose(String str);

    public abstract boolean can(String str);

    protected String addString(String str) {
        return str + "_Done";
    }
}
