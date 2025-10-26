package racingcar.validator;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InputValidator {
    private static final String EMPTY_INPUT_ERROR = "입력값이 비어있습니다.";
    private static final int MAX_CAR_NAME_LENGTH = 5;
    private static final String INVALID_CAR_NAME_LENGTH_ERROR = "자동차 이름은 5자 이하여야 합니다.";
    private static final String EMPTY_CAR_NAME_ERROR = "자동차 이름이 비어있습니다.";
    private static final String DUPLICATE_CAR_NAME_ERROR = "자동차 이름은 중복될 수 없습니다.";
    private static final String INVALID_TRY_COUNT_ERROR = "시도 횟수는 양의 정수여야 합니다.";

    public static void validateCarNamesInput(String input) {
        if(input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException(EMPTY_INPUT_ERROR);
        }
    }

    public static void validateCarNames(List<String> carNames) {
        validateCarNameLength(carNames);
        validateCarNamesNotEmpty(carNames);
        validateNoDuplicateNames(carNames);
    }

    private static void validateCarNameLength(List<String> carNames) {
        if(carNames.stream().anyMatch(name -> name.length() > MAX_CAR_NAME_LENGTH)) {
            throw new IllegalArgumentException(INVALID_CAR_NAME_LENGTH_ERROR);
        }
    }

    private static void validateCarNamesNotEmpty(List<String> carNames) {
        if(carNames.stream().anyMatch(String::isEmpty)) {
            throw new IllegalArgumentException(EMPTY_CAR_NAME_ERROR);
        }
    }

    private static void validateNoDuplicateNames(List<String> carNames) {
        Set<String> uniqueNames = new HashSet<>(carNames);
        if(uniqueNames.size() != carNames.size()) {
            throw new IllegalArgumentException(DUPLICATE_CAR_NAME_ERROR);
        }
    }

    public static void validateTryCountInput(String input) {
        try{
            Integer.parseInt(input.trim());
        } catch(NumberFormatException e) {
            throw new IllegalArgumentException(INVALID_TRY_COUNT_ERROR);
        }
    }
}
