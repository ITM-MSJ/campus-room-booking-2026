package itm.oss.booking;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class TimeApiExampleTest {

    @Test
    void durationBetweenTwoTimesIsMeasuredInMinutes() {
        LocalDateTime start = LocalDateTime.parse("2026-10-02T10:00");
        LocalDateTime end = LocalDateTime.parse("2026-10-02T11:30");

        assertEquals(90, Duration.between(start, end).toMinutes());
    }
}
