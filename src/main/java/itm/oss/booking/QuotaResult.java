package itm.oss.booking;

public class QuotaResult {
    private final boolean allowed;
    private final long minutesAfterBooking;

    public QuotaResult(boolean allowed, long minutesAfterBooking) {
        this.allowed = allowed;
        this.minutesAfterBooking = minutesAfterBooking;
    }

    public boolean isAllowed() {
        return allowed;
    }

    public long getMinutesAfterBooking() {
        return minutesAfterBooking;
    }
}
