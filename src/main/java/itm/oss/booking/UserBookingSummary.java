package itm.oss.booking;

public class UserBookingSummary {
    private final int bookingCount;
    private final long totalMinutes;
    private final int distinctRooms;
    private final double averageMinutes;

    public UserBookingSummary(
            int bookingCount,
            long totalMinutes,
            int distinctRooms,
            double averageMinutes) {

        this.bookingCount = bookingCount;
        this.totalMinutes = totalMinutes;
        this.distinctRooms = distinctRooms;
        this.averageMinutes = averageMinutes;
    }

    public int getBookingCount() {
        return bookingCount;
    }

    public long getTotalMinutes() {
        return totalMinutes;
    }

    public int getDistinctRooms() {
        return distinctRooms;
    }

    public double getAverageMinutes() {
        return averageMinutes;
    }
}
