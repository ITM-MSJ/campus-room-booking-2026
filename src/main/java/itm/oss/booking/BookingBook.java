package itm.oss.booking;

import java.util.ArrayList;
import java.util.List;

public class BookingBook {
    private final ArrayList<Booking> bookings;

    public BookingBook(List<Booking> initialBookings) {
        this.bookings = new ArrayList<>(
                initialBookings == null ? List.of() : initialBookings);
    }

    public List<Booking> all() {
        return new ArrayList<>(bookings);
    }

    /**
     * Issue 4.
     */
    public Booking update(int id, Booking replacement) {
        throw new UnsupportedOperationException(
                "Issue 4: BookingBook.update() is not implemented yet");
    }

    /**
     * Issue 4.
     */
    public Booking cancel(int id) {
        throw new UnsupportedOperationException(
                "Issue 4: BookingBook.cancel() is not implemented yet");
    }
}
