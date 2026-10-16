package itm.oss.booking;

public class App {

    public static void main(String[] args) {
        System.out.println("Campus Room Booking");
        System.out.println();

        System.out.println("Rooms");
        for (Room room : SampleData.rooms()) {
            System.out.println("- " + room);
        }

        System.out.println();
        System.out.println("Sample bookings");
        for (Booking booking : SampleData.bookings()) {
            System.out.println("- " + booking);
        }
    }
}
