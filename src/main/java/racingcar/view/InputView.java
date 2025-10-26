package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;
import racingcar.validator.InputValidator;

public class InputView {
    private static final String CAR_NAME_INPUT_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String DELIMITER = ",";

    public List<String> readCarNames(){
        System.out.println(CAR_NAME_INPUT_MESSAGE);
        String input = Console.readLine();
        InputValidator.validateCarNamesInput(input);

        List<String> carNames = parseCarNames(input);
        InputValidator.validateCarNames(carNames);
        return carNames;
    }

    public List<String> parseCarNames(String input){
        return Arrays.stream(input.split(DELIMITER))
                .map(String::trim)
                .toList();
    }
}
