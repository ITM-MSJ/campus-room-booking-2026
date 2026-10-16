package itm.oss.booking;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class SampleData {

    private SampleData() {
    }

    public static ArrayList<Room> rooms() {
        return new ArrayList<>(List.of(
                new Room("R101", "Engineering Study Room 1", 4,
                        Set.of("projector", "whiteboard")),
                new Room("R102", "Engineering Study Room 2", 8,
                        Set.of("whiteboard")),
                new Room("R201", "Collaboration Room", 12,
                        Set.of("projector", "whiteboard", "display")),
                new Room("R202", "Quiet Study Room", 2,
                        Set.of())
        ));
    }

    public static ArrayList<Booking> bookings() {
        return new ArrayList<>(List.of(
                new Booking(
                        1, "s2026001", "R101",
                        LocalDateTime.parse("2026-10-02T10:00"),
                        LocalDateTime.parse("2026-10-02T11:00"),
                        2, "Project meeting", BookingStatus.ACTIVE),
                new Booking(
                        2, "s2026002", "R102",
                        LocalDateTime.parse("2026-10-02T11:00"),
                        LocalDateTime.parse("2026-10-02T12:30"),
                        4, "Study group", BookingStatus.ACTIVE),
                new Booking(
                        3, "s2026001", "R201",
                        LocalDateTime.parse("2026-10-03T14:00"),
                        LocalDateTime.parse("2026-10-03T15:00"),
                        3, "Presentation practice", BookingStatus.CANCELLED)
        ));
    }
}
