package itm.oss.booking;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Room {
    private final String id;
    private final String name;
    private final int capacity;
    private final Set<String> equipment;

    public Room(String id, String name, int capacity, Set<String> equipment) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.equipment = new HashSet<>(equipment == null ? Set.of() : equipment);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public Set<String> getEquipment() {
        return Collections.unmodifiableSet(equipment);
    }

    @Override
    public String toString() {
        return id + " - " + name + " (capacity " + capacity + ")";
    }
}
