package racingcar.controller;

import java.util.List;
import racingcar.model.Car;
import racingcar.model.CarFactory;
import racingcar.service.RaceService;

public class RaceController {
    private final RaceService raceService;
    private List<Car> cars;

    public RaceController() {
        this.raceService = new RaceService();
    }

    public void initializeCars(List<String> carNames) {
        this.cars = CarFactory.createCars(carNames);
    }

    public void race() {
        raceService.race(cars);
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<String> getWinners() {
        return raceService.findWinners(cars);
    }
}
