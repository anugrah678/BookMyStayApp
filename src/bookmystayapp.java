import java.io.*;
import java.util.*;

/**
 * ================================================================
 * CLASS - RoomInventory
 * ================================================================
 */
class RoomInventory {

    Map<String, Integer> rooms;

    public RoomInventory() {
        rooms = new HashMap<>();
        rooms.put("Single", 5);
        rooms.put("Double", 3);
        rooms.put("Suite", 2);
    }

    public void display() {
        System.out.println("\nCurrent Inventory:");
        for (String key : rooms.keySet()) {
            System.out.println(key + ": " + rooms.get(key));
        }
    }
}

/**
 * ================================================================
 * CLASS - FilePersistenceService
 * ================================================================
 */
class FilePersistenceService {

    // Save inventory to file
    public void save(RoomInventory inventory, String fileName) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

            for (Map.Entry<String, Integer> entry : inventory.rooms.entrySet()) {
                writer.write(entry.getKey() + "," + entry.getValue());
                writer.newLine();
            }

            System.out.println("Inventory saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving data.");
        }
    }

    // Load inventory from file
    public void load(RoomInventory inventory, String fileName) {

        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("No existing data found. Starting fresh.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            inventory.rooms.clear();

            String line;
            while ((line = reader.readLine()) != null) {

                String[] parts = line.split(",");
                inventory.rooms.put(parts[0], Integer.parseInt(parts[1]));
            }

            System.out.println("Inventory loaded successfully.");

        } catch (IOException e) {
            System.out.println("Error loading data.");
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

        String fileName = "inventory.txt";

        RoomInventory inventory = new RoomInventory();
        FilePersistenceService service = new FilePersistenceService();

        // Load previous state
        service.load(inventory, fileName);

        // Show inventory
        inventory.display();

        // Save current state
        service.save(inventory, fileName);
    }
}