package racingcar.validator;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class InputValidatorTest {
    @Test
    void emptyInput(){
        assertThatThrownBy(() -> InputValidator.validateCarNamesInput(""))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("입력값이 비어있습니다.");
    }

    @Test
    void carNameLengthExceedsLimit(){
        List<String> carNames = Arrays.asList("pobi", "woniii");

        assertThatThrownBy(() -> InputValidator.validateCarNames(carNames))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("자동차 이름은 5자 이하여야 합니다.");
    }
}
