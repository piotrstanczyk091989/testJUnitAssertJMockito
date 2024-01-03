package pl.javaps.p6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
import static pl.javaps.p6.ExceptionsExample.DEFAULT_NUMBER;

class ExceptionsExampleTest {

    private ExceptionsExample exceptionsExample = new ExceptionsExample();

    @Test
    void shouldMethodReturnStringFromNumberIfNumberIsLessThenDefault() {
        // given
        int i = 1;
        // when
        String s = exceptionsExample.doSomething(i);
        // then
        assertThat(s).isEqualTo("1");
    }

    @Test
    void shouldMethodReturnStringFromNumberIfNumberIsEqualDefault() {
        // given
        // when
        String s = exceptionsExample.doSomething(DEFAULT_NUMBER);
        // then
        assertThat(s).isEqualTo("5");
    }

//    @Test
//    void shouldThrowExceptionIfNumberIsGraterDefault1() {
//        // given
//        int i = 10;
//        // when
//        try {
//            exceptionsExample.doSomething(i);
//            fail();
//        } catch (IllegalArgumentException e){
//            assertThat(e).isInstanceOf(IllegalArgumentException.class)
//                    .hasMessage("Parametr jest większy od 5");
//        }
//    }

    //assertJ
    @Test
    void shouldThrowExceptionIfNumberIsGraterDefault() {
        // given
        int i = 10;
        // when
        //JUnit
        assertThrows(IllegalArgumentException.class,
                () ->  exceptionsExample.doSomething(i),
                "Parametr jest większy od 5");
        //assertJ
        assertThatThrownBy(()-> exceptionsExample.doSomething(i))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Parametr jest większy od 5");
    }
}