package itm.oss.booking;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public final class RoomUtilizationService {

    private RoomUtilizationService() {
    }

    /**
     * Issue 7.
     */
    public static RoomUsage summarize(
            List<Booking> bookings,
            String roomId,
            LocalDate date,
            LocalTime openTime,
            LocalTime closeTime) {

        throw new UnsupportedOperationException(
                "Issue 7: RoomUtilizationService.summarize() is not implemented yet");
    }
}
