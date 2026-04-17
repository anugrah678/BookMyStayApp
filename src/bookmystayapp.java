import java.util.*;

/**
 * ================================================================
 * CLASS - RoomInventory (Shared Resource)
 * ================================================================
 */
class RoomInventory {

    private Map<String, Integer> rooms;

    public RoomInventory() {
        rooms = new HashMap<>();
        rooms.put("Single", 2);
        rooms.put("Double", 2);
        rooms.put("Suite", 1);
    }

    // synchronized → prevents race condition
    public synchronized boolean bookRoom(String type) {

        if (rooms.get(type) > 0) {
            rooms.put(type, rooms.get(type) - 1);
            return true;
        }
        return false;
    }

    public void display() {
        System.out.println("\nRemaining Inventory: " + rooms);
    }
}

/**
 * ================================================================
 * CLASS - BookingTask (Thread)
 * ================================================================
 */
class BookingTask implements Runnable {

    private RoomInventory inventory;
    private String guestName;
    private String roomType;

    public BookingTask(RoomInventory inventory, String guestName, String roomType) {
        this.inventory = inventory;
        this.guestName = guestName;
        this.roomType = roomType;
    }

    @Override
    public void run() {

        boolean success = inventory.bookRoom(roomType);

        if (success) {
            System.out.println("Booking confirmed for " + guestName +
                    ", Room: " + roomType);
        } else {
            System.out.println("Booking failed for " + guestName +
                    ", Room not available");
        }
    }
}

/**
 * ================================================================
 * MAIN CLASS
 * ================================================================
 */
public class bookmystayapp {

    public static void main(String[] args) {

        System.out.println("Concurrent Booking Simulation\n");

        RoomInventory inventory = new RoomInventory();

        // Create threads (simulating multiple users)
        Thread t1 = new Thread(new BookingTask(inventory, "Adhi", "Single"));
        Thread t2 = new Thread(new BookingTask(inventory, "Rahul", "Single"));
        Thread t3 = new Thread(new BookingTask(inventory, "Vanshith", "Single"));

        Thread t4 = new Thread(new BookingTask(inventory, "John", "Suite"));
        Thread t5 = new Thread(new BookingTask(inventory, "Alex", "Suite"));

        // Start threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        // Wait for all threads
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Final inventory
        inventory.display();
    }
}