package itm.oss.booking;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class BookingTest {

    private Booking sample() {
        return new Booking(
                10,
                "s1",
                "R101",
                LocalDateTime.parse("2026-10-02T10:00"),
                LocalDateTime.parse("2026-10-02T11:00"),
                2,
                "Study",
                BookingStatus.ACTIVE);
    }

    @Test
    void withIdChangesOnlyId() {
        Booking original = sample();
        Booking changed = original.withId(20);

        assertEquals(20, changed.getId());
        assertEquals(original.getUserId(), changed.getUserId());
        assertEquals(original.getRoomId(), changed.getRoomId());
        assertEquals(original.getStart(), changed.getStart());
        assertEquals(original.getEnd(), changed.getEnd());
        assertEquals(original.getStatus(), changed.getStatus());
    }

    @Test
    void withStatusChangesOnlyStatus() {
        Booking changed = sample().withStatus(BookingStatus.CANCELLED);

        assertEquals(BookingStatus.CANCELLED, changed.getStatus());
        assertEquals(10, changed.getId());
        assertEquals("R101", changed.getRoomId());
    }
}
