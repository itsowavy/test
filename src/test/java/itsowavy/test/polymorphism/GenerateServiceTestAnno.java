package itsowavy.test.polymorphism;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GenerateServiceTestAnno {

    @Autowired
    GenerateService generateService;

    @Test
    void generateTest() {
        String response = generateService.generate("UVC 하이요");
        System.out.println(response);
    }

}