package itm.oss.booking;

import java.time.LocalDateTime;
import java.util.List;

public final class AvailabilityService {

    private AvailabilityService() {
    }

    /**
     * Issue 3.
     */
    public static List<Room> findAvailableRooms(
            List<Room> rooms,
            List<Booking> bookings,
            LocalDateTime start,
            LocalDateTime end,
            int minCapacity) {

        throw new UnsupportedOperationException(
                "Issue 3: AvailabilityService.findAvailableRooms() is not implemented yet");
    }
}
