package itsowavy.test.spel;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestAspect {

    @Before("@annotation(testAnno)")
    public void proceed(testAnno testAnno) {
        String value = testAnno.value();
        System.out.println("value = " + value);
    }
}
