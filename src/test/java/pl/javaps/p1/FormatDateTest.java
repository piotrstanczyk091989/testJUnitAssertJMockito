package pl.javaps.p1;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class FormatDateTest {

    @Test
    void shouldFormatDateToYearMonthString() {
        // given
        LocalDate date = LocalDate.of(2019, 12, 1);
        // when
        String dateSrt = FormatDate.formatDate(date);
        // then
        assertEquals("2019-12", dateSrt);
    }
}