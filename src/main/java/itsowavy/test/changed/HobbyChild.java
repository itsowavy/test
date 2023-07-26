package itsowavy.test.changed;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HobbyChild extends Parent{

    private String lastName;
    private String hobby;

    public HobbyChild(String firstName, String lastName) {
        super(firstName);
        this.lastName = lastName;
    }
}
