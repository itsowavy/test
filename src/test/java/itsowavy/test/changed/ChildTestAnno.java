package itsowavy.test.changed;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ChildTestAnno {

    @Test
    void test() {
        HobbyChild hobbyChild = new HobbyChild("성", "승훈");
        Child child = new Child("김", "코딩");

        List<Parent> children = new ArrayList<>();
        children.add(hobbyChild);
        children.add(child);

        for (Parent ch : children) {
            if (ch instanceof HobbyChild) {
                HobbyChild hch = (HobbyChild) ch;
                hch.setHobby("코딩");
            }
        }

        System.out.println(((HobbyChild) children.get(0)).getHobby());
    }

}