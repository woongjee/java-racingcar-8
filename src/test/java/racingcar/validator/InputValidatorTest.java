package racingcar.validator;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

public class InputValidatorTest {
    @Test
    void emptyInput(){
        assertThatThrownBy(() -> InputValidator.validateCarNamesInput(""))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("입력값이 비어있습니다.");
    }
}
