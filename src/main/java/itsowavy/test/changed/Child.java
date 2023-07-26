package itsowavy.test.changed;

public class Child extends Parent{

    private String lastName;
    public Child(String firstName, String lastName) {
        super(firstName);
        this.lastName = lastName;
    }
}
