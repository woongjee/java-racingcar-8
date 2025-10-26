package racingcar.view;

import java.util.List;
import racingcar.model.Car;

public class OutputView {
    private static final String RESULT_HEADER = "\n실행 결과";
    private static final String NAME_POSITION_SEPARATOR = " : ";
    private static final String POSITION_MARKER = "-";
    private static final String WINNER_PREFIX = "최종 우승자 : ";
    private static final String WINNER_DELIMITER = ", ";

    public void printReslutHeader(){
        System.out.println(RESULT_HEADER);
    }

    public void printRaceStatus(List<Car> cars){
        for(Car car : cars){
            printCarStatus(car);
        }
    }

    private void printCarStatus(Car car){
        System.out.println(car.getName() + NAME_POSITION_SEPARATOR + POSITION_MARKER.repeat(car.getPosition()));
    }

    public void printWinners(List<String> winners){
        if(winners.isEmpty()){
            return;
        }
        System.out.println(WINNER_PREFIX + String.join(WINNER_DELIMITER, winners));
    }
}
