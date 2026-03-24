import java.util.ArrayList;
import java.util.List;

/**
 * MAIN CLASS - UseCase1TrainConsistMgmnt
 * * Use Case 1: Initialize Train and Display Consist Summary
 * * Description:
 * This class represents the entry point of the Train Consist
 * Management Application.
 * * At this stage, the application:
 * - Creates an empty train consist
 * - Uses a dynamic List to store bogies
 * - Displays initial bogie count
 * - Prints the current state of the train
 * * @author Developer
 * @version 1.0
 */
public class UseCase1TrainConsistMgmnt {

    public static void main(String[] args) {
        
        // 1. Display welcome banner
        System.out.println("========================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("========================================\n");

        // 2. Initialize an empty List using ArrayList
        // We use the List interface for abstraction and ArrayList for dynamic resizing
        List<String> trainConsist = new ArrayList<>();

        // 3. Display initial consist information
        System.out.println("Train initialized successfully ... ");
        
        // Display initial bogie count using size()
        System.out.println("Initial Bogie Count : " + trainConsist.size());
        
        // Display the current state of the list
        System.out.println("Current Train Consist : " + trainConsist);

        System.out.println("\nSystem ready for operations.");
    }
}