package racingcar.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    void moveForward(){
        Car car = new Car("test");

        car.move(4);

        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    void stop(){
        Car car = new Car("test");

        car.move(3);

        assertThat(car.getPosition()).isEqualTo(0);
    }
}
