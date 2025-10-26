package racingcar.controller;

import java.util.List;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingGameController {
    private final InputView inputView;
    private final OutputView outputView;
    private final RaceController raceController;

    public RacingGameController(){
        inputView = new InputView();
        outputView = new OutputView();
        raceController = new RaceController();
    }

    public void run(){
        try{
            List<String> carNames = inputView.readCarNames();
            int tryCount = inputView.readTryCount();

            raceController.initializeCars(carNames);
            outputView.printReslutHeader();

            executeRace(tryCount);

            List<String> winners = raceController.getWinners();
            outputView.printWinners(winners);
        } catch(IllegalArgumentException e){
            outputView.printError(e.getMessage());
            throw e;
        }
    }

    private void executeRace(int tryCount){
        for(int i = 0; i < tryCount; i++){
            raceController.race();
            outputView.printRaceStatus(raceController.getCars());
            outputView.printNewLine();
        }
    }
}
