package racingcar.service;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import racingcar.model.Car;

public class RaceServiceTest {
    @Test
    void findSingleWinner(){
        RaceService raceService = new RaceService();
        Car car1 = new Car("pobi");
        Car car2 = new Car("woni");

        car1.move(4);
        car1.move(4);
        car2.move(4);

        List<Car> cars = Arrays.asList(car1, car2);
        List<String> winners = raceService.findWinners(cars);

        assertThat(winners).containsExactly("pobi");
    }

    @Test
    void findMultipleWinners(){
        RaceService raceService = new RaceService();
        Car car1 = new Car("pobi");
        Car car2 = new Car("woni");
        Car car3 = new Car("jun");

        car1.move(4);
        car1.move(4);
        car2.move(4);
        car2.move(4);
        car3.move(4);

        List<Car> cars = Arrays.asList(car1, car2, car3);
        List<String> winners = raceService.findWinners(cars);
        assertThat(winners).containsExactlyInAnyOrder("pobi", "woni");
    }
}
