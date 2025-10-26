package racingcar.validator;

public class InputValidator {
    private static final String EMPTY_INPUT_ERROR = "입력값이 비어있습니다.";

    public static void validateCarNamesInput(String input) {
        if(input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException(EMPTY_INPUT_ERROR);
        }
    }
}
