package itsowavy.test.changed;

import org.junit.jupiter.api.Test;

public class FinalTest {

    @Test
    void finalTest() {
        final Car car = new Car("Genesis");
        car.setName("Sonata");

        System.out.println(car.getName());
    }


    class Car {
        private String name;

        public Car(String name) {
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
