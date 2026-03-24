import java.util.LinkedList;
import java.util.List;

/**
 * MAIN CLASS - UseCase4TrainConsistMgmnt
 * * Use Case 4: Maintain Ordered Bogie Consist
 * * Description:
 * This class models the physical chaining of train bogies
 * using LinkedList for ordered operations.
 *
 * At this stage, the application:
 * - Adds bogies in sequence
 * - Inserts bogies at specific positions
 * - Removes bogies from front and rear
 * - Displays updated train structure
 *
 * This maps positional operations using LinkedList.
 *
 * @author Developer
 * @version 4.0
 */
public class UseCase4TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC4 - Maintain Ordered Bogie Consist ");
        System.out.println("==========================================\n");

        // 1. Create a LinkedList
        // We cast to LinkedList specifically to access addFirst/removeLast methods
        LinkedList<String> trainConsist = new LinkedList<>();

        // 2. Initial sequence addition
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist + "\n");

        // 3. INSERT: Insert 'Pantry Car' at position 2 (Index 2)
        // LinkedList handles the pointer updates automatically
        trainConsist.add(2, "Pantry Car");

        System.out.println("After Inserting 'Pantry Car' at position 2:");
        System.out.println(trainConsist + "\n");

        // 4. DELETE: Remove First (Engine) and Last (Guard) bogies
        // This simulates uncoupling the locomotive and the rear van
        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("After Removing First and Last Bogie:");
        System.out.println(trainConsist + "\n");

        System.out.println("UC4 ordered consist operations completed ...");
    }
}