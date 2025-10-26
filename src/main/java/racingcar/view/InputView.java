package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;
import racingcar.validator.InputValidator;

public class InputView {
    private static final String CAR_NAME_INPUT_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String DELIMITER = ",";
    private static final String TRY_COUNT_INPUT_MESSAGE = "시도할 횟수는 몇 회인가요?";

    public List<String> readCarNames(){
        System.out.println(CAR_NAME_INPUT_MESSAGE);
        String input = Console.readLine();
        InputValidator.validateCarNamesInput(input);

        List<String> carNames = parseCarNames(input);
        InputValidator.validateCarNames(carNames);
        return carNames;
    }

    public int readTryCount(){
        System.out.println(TRY_COUNT_INPUT_MESSAGE);
        String input = Console.readLine();
        InputValidator.validateTryCountInput(input);
        return Integer.parseInt(input);
    }

    public List<String> parseCarNames(String input){
        return Arrays.stream(input.split(DELIMITER))
                .map(String::trim)
                .toList();
    }
}
