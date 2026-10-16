package itm.oss.booking;

import java.nio.file.Path;
import java.util.List;

public final class BookingStore {

    private BookingStore() {
    }

    /**
     * Issue 9.
     */
    public static List<Booking> load(Path path) {
        throw new UnsupportedOperationException(
                "Issue 9: BookingStore.load() is not implemented yet");
    }
}
