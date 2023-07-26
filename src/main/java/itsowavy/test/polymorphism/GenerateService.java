package itsowavy.test.polymorphism;

import itsowavy.test.polymorphism.service.SpeechService;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GenerateService {

    private final List<SpeechService> speechServices;


    public String generate(String request) {
        for (SpeechService speechService : speechServices) {
            if (speechService.can(request)) {
                return speechService.compose(request);
            }
        }
        return "DENYED";
    }
}
