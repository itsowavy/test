package itsowavy.test.changed;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class IterChangeTest {

    @Test
    void interChange() {
        List<String> stringList = new ArrayList<>();
        stringList.add("안녕하세요");
        stringList.add("사랑합니다");
        stringList.add("반가워요");

        for (String str : stringList) {
            if (str.equals("사랑합니다")) {
            }
        }
        System.out.println(stringList);

    }
}
