package itm.oss.booking;

import java.util.List;

public final class ConflictService {

    private ConflictService() {
    }

    /**
     * Issue 2.
     */
    public static boolean hasConflict(
            List<Booking> existing,
            Booking proposed) {

        throw new UnsupportedOperationException(
                "Issue 2: ConflictService.hasConflict() is not implemented yet");
    }
}
