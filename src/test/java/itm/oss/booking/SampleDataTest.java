package itm.oss.booking;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class SampleDataTest {

    @Test
    void starterContainsRoomsAndBookings() {
        assertFalse(SampleData.rooms().isEmpty());
        assertFalse(SampleData.bookings().isEmpty());
        assertEquals("R101", SampleData.rooms().get(0).getId());
    }
}
