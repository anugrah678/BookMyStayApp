import java.util.HashMap;
import java.util.Map;

/**
 * ================================================================
 * CLASS - RoomInventory
 * ================================================================
 *
 * Use Case 3: Centralized Room Inventory Management
 *
 * Description:
 * This class acts as the single source of truth
 * for room availability using a HashMap.
 *
 * @version 3.1
 */

class RoomInventory {

    // HashMap to store room availability
    private Map<String, Integer> roomAvailability;

    /**
     * Constructor initializes inventory
     */
    public RoomInventory() {
        roomAvailability = new HashMap<>();
        initializeInventory();
    }

    /**
     * Initialize default room availability
     */
    private void initializeInventory() {
        roomAvailability.put("Single Room", 5);
        roomAvailability.put("Double Room", 3);
        roomAvailability.put("Suite Room", 2);
    }

    /**
     * Get full availability map
     */
    public Map<String, Integer> getRoomAvailability() {
        return roomAvailability;
    }

    /**
     * Update availability
     */
    public void updateAvailability(String roomType, int count) {
        roomAvailability.put(roomType, count);
    }
}

/**
 * ================================================================
 * MAIN CLASS - UseCase3InventorySetup
 * ================================================================
 */

public class bookmystayapp {

    public static void main(String[] args) {

        System.out.println("Centralized Room Inventory\n");

        // Create inventory object
        RoomInventory inventory = new RoomInventory();

        // Display current availability
        System.out.println("Current Availability:");
        for (Map.Entry<String, Integer> entry : inventory.getRoomAvailability().entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Update example
        System.out.println("\nUpdating availability...\n");
        inventory.updateAvailability("Single Room", 4);

        // Display updated availability
        System.out.println("Updated Availability:");
        for (Map.Entry<String, Integer> entry : inventory.getRoomAvailability().entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}