package itm.oss.booking;

import java.util.List;

public final class BookingFilter {

    private BookingFilter() {
    }

    /**
     * Issue 5.
     */
    public static List<Booking> filter(
            List<Booking> bookings,
            String userId,
            String roomId,
            BookingStatus status,
            Integer minAttendees) {

        throw new UnsupportedOperationException(
                "Issue 5: BookingFilter.filter() is not implemented yet");
    }
}
