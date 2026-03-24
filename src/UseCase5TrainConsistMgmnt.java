import java.util.LinkedHashSet;
import java.util.Set;

/**
 * MAIN CLASS - UseCase5TrainConsistMgmnt
 * * Use Case 5: Preserve Insertion Order of Bogies
 * * Description:
 * This class maintains the exact attachment order of bogies
 * while also preventing duplicate entries using LinkedHashSet.
 *
 * At this stage, the application:
 * - Attaches bogies in order
 * - Preserves insertion sequence
 * - Avoids duplicate bogies
 * - Displays final train formation
 *
 * This maps ordered uniqueness using LinkedHashSet.
 *
 * @author Developer
 * @version 5.0
 */
public class UseCase5TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("============================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("============================================\n");

        // 1. Initialize LinkedHashSet
        // It uses a Hash Table for uniqueness and a Linked List for order
        Set<String> formation = new LinkedHashSet<>();

        // 2. Add bogies in a specific sequence
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // 3. Attempt to add duplicates (These will be ignored)
        formation.add("Engine");  // Duplicate ignored
        formation.add("Sleeper"); // Duplicate ignored

        // 4. Display final formation
        System.out.println("Final Train Formation:");
        System.out.println(formation);

        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

        System.out.println("\nUC5 formation setup completed ...");
    }
}