import java.util.HashMap;
import java.util.Map;

/**
 * MAIN CLASS - UseCase6TrainConsistMgmnt
 * * Use Case 6: Map Bogie to Capacity (HashMap)
 * * Description:
 * This class associates each bogie with its seating or
 * load capacity using a key-value mapping structure.
 * * At this stage, the application:
 * - Creates a HashMap for bogie-capacity mapping
 * - Inserts capacity values for each bogie
 * - Iterates through map entries
 * - Displays bogie and capacity information
 * * This maps Lookup-based access using HashMap.
 * * @author Developer
 * @version 6.0
 */
public class UseCase6TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("============================================");
        System.out.println(" UC6 - Map Bogie to Capacity (HashMap) ");
        System.out.println("============================================\n");

        // 1. Create a HashMap for bogie-capacity mapping
        // Key: Bogie Type (String), Value: Capacity (Integer)
        Map<String, Integer> capacityMap = new HashMap<>();

        // 2. Insert capacity values (Key -> Value)
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 56);
        capacityMap.put("First Class", 24);
        capacityMap.put("Cargo", 120);

        // 3. Display bogie and capacity information
        System.out.println("Bogie Capacity Details:");
        
        // Iterating through the map entries
        for (Map.Entry<String, Integer> entry : capacityMap.size() > 0 ? capacityMap.entrySet() : null) {
             if(entry != null) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
             }
        }

        System.out.println("\nUC6 bogie-capacity mapping completed ...");
    }
}