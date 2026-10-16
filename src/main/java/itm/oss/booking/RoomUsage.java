package itm.oss.booking;

import java.math.BigDecimal;

public class RoomUsage {
    private final int bookingCount;
    private final long bookedMinutes;
    private final BigDecimal utilizationPercent;

    public RoomUsage(
            int bookingCount,
            long bookedMinutes,
            BigDecimal utilizationPercent) {

        this.bookingCount = bookingCount;
        this.bookedMinutes = bookedMinutes;
        this.utilizationPercent = utilizationPercent;
    }

    public int getBookingCount() {
        return bookingCount;
    }

    public long getBookedMinutes() {
        return bookedMinutes;
    }

    public BigDecimal getUtilizationPercent() {
        return utilizationPercent;
    }
}
