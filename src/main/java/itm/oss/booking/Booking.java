package itm.oss.booking;

import java.time.LocalDateTime;

public class Booking {
    private final int id;
    private final String userId;
    private final String roomId;
    private final LocalDateTime start;
    private final LocalDateTime end;
    private final int attendees;
    private final String purpose;
    private final BookingStatus status;

    public Booking(
            int id,
            String userId,
            String roomId,
            LocalDateTime start,
            LocalDateTime end,
            int attendees,
            String purpose,
            BookingStatus status) {

        this.id = id;
        this.userId = userId;
        this.roomId = roomId;
        this.start = start;
        this.end = end;
        this.attendees = attendees;
        this.purpose = purpose;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getRoomId() {
        return roomId;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public int getAttendees() {
        return attendees;
    }

    public String getPurpose() {
        return purpose;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public Booking withId(int newId) {
        return new Booking(
                newId, userId, roomId, start, end, attendees, purpose, status);
    }

    public Booking withStatus(BookingStatus newStatus) {
        return new Booking(
                id, userId, roomId, start, end, attendees, purpose, newStatus);
    }

    @Override
    public String toString() {
        return "Booking " + id + ": " + userId + " -> " + roomId
                + " [" + start + " to " + end + "] " + status;
    }
}
