package racingcar.service;

import java.util.List;
import racingcar.model.Car;

public class RaceService {
    private static final int MIN_RANDOM_VALUE = 0;
    private static final int MAX_RANDOM_VALUE = 9;

    public List<String> findWinners(List<Car> cars) {
        int maxPosition = findMaxPosition(cars);
        return extractWinnerNames(cars, maxPosition);
    }

    private int findMaxPosition(List<Car> cars) {
        return cars.stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElse(0);
    }

    private List<String> extractWinnerNames(List<Car> cars, int maxPosition) {
        return cars.stream()
                .filter(car -> car.getPosition() == maxPosition)
                .map(Car::getName)
                .toList();
    }
}
