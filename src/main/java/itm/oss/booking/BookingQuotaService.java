package itm.oss.booking;

import java.util.List;

public final class BookingQuotaService {

    private BookingQuotaService() {
    }

    /**
     * Issue 8.
     */
    public static QuotaResult checkDailyQuota(
            List<Booking> existing,
            Booking proposed,
            long maxMinutesPerDay) {

        throw new UnsupportedOperationException(
                "Issue 8: BookingQuotaService.checkDailyQuota() is not implemented yet");
    }
}
