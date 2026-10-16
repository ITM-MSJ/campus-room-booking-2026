package itm.oss.booking;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;

import org.junit.jupiter.api.Test;

class RoomTest {

    @Test
    void roomStoresBasicInformation() {
        Room room = new Room(
                "R101",
                "Engineering Study Room 1",
                4,
                Set.of("projector", "whiteboard"));

        assertEquals("R101", room.getId());
        assertEquals(4, room.getCapacity());
        assertTrue(room.getEquipment().contains("projector"));
    }
}
