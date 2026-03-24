import java.util.ArrayList;
import java.util.List;

/**
 * MAIN CLASS - UseCase2TrainConsistMgmnt
 * * Use Case 2: Add Passenger Bogies to Train
 * * Description:
 * This class demonstrates how passenger bogies can be
 * managed dynamically using ArrayList operations.
 * * At this stage, the application:
 * - Adds new bogies to the train
 * - Removes existing bogies
 * - Checks for bogie availability
 * - Displays the final consist
 * * This maps CRUD operations using ArrayList.
 * * @author Developer
 * @version 2.0
 */
public class UseCase2TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC2 - Add Passenger Bogies to Train ");
        System.out.println("==========================================\n");

        // 1. CREATE: Initialize the ArrayList to hold passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // 2. ADD: Attach new bogies to the train
        // ArrayList maintains insertion order, simulating the order of attachment
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies + "\n");

        // 3. DELETE: Remove a specific bogie
        // remove() shifts subsequent elements to the left to fill the gap
        passengerBogies.remove("AC Chair");

        System.out.println("After Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + passengerBogies + "\n");

        // 4. READ/SEARCH: Check for bogie existence
        // contains() returns a boolean indicating if the element is present
        System.out.println("Checking if \"Sleeper\" exists:");
        boolean hasSleeper = passengerBogies.contains("Sleeper");
        System.out.println("Contains Sleeper? : " + hasSleeper + "\n");

        // 5. Final Consist Summary
        System.out.println("Final Train Passenger Consist:");
        System.out.println(passengerBogies);

        System.out.println("\nUC2 operations completed successfully ...");
    }
}