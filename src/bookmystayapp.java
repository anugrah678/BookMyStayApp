/**
 * ================================================================
 * MAIN CLASS - UseCase1HotelBookingApp
 * ================================================================
 *
 * Use Case 1: Application Entry & Welcome Message
 *
 * Description:
 * This class represents the entry point of the
 * Hotel Booking Management System.
 *
 * At this stage, the application:
 * - Starts execution from the main() method
 * - Displays a welcome message
 * - Shows application name
 * - Shows application version
 *
 * No business logic or data structures are implemented yet.
 *
 * The goal is to establish a clear startup flow.
 *
 * @author Sankalp Kumar
 * @version 1.0
 */

public class bookmystayapp {

    /**
     * Application entry point.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Application name
        String appName = "Book My Stay App";

        // Application version
        String version = "Version 1.0";

        // Welcome message
        System.out.println("==========================================");
        System.out.println(" Welcome to " + appName);
        System.out.println("==========================================");

        // Application details
        System.out.println("Application Name : " + appName);
        System.out.println("Version : " + version);

        System.out.println("System initialized successfully.");
        System.out.println("Ready to accept booking operations.");
    }
}