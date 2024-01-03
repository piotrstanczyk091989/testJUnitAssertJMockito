package pl.javaps.p7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class EmptyStringTest {



    @ParameterizedTest(name = "Param: `{0}`")
    @ValueSource(strings = {" ", "   ","a", " a", "   abc", "  a   "})
     void shouldCheckIfStringIsNotEmpty(String s) {
        // given
        // when
        boolean result = EmptyString.checkIfNotEmpty(s);
        // then
        assertThat(result).isTrue();
    }
}