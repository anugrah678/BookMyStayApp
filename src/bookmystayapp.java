import java.util.*;

/**
 * ================================================================
 * CLASS - InvalidBookingException
 * ================================================================
 */
class InvalidBookingException extends Exception {

    public InvalidBookingException(String message) {
        super(message);
    }
}

/**
 * ================================================================
 * CLASS - ReservationValidator
 * ================================================================
 */
class ReservationValidator {

    public void validate(String guestName, String roomType)
            throws InvalidBookingException {

        // Validate name
        if (guestName == null || guestName.trim().isEmpty()) {
            throw new InvalidBookingException("Guest name cannot be empty");
        }

        // Validate room type
        if (!(roomType.equalsIgnoreCase("Single") ||
              roomType.equalsIgnoreCase("Double") ||
              roomType.equalsIgnoreCase("Suite"))) {

            throw new InvalidBookingException("Invalid room type selected");
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

        System.out.println("Booking Validation\n");

        Scanner scanner = new Scanner(System.in);

        try {
            // Input
            System.out.print("Enter guest name: ");
            String name = scanner.nextLine();

            System.out.print("Enter room type (Single/Double/Suite): ");
            String room = scanner.nextLine();

            // Validation
            ReservationValidator validator = new ReservationValidator();
            validator.validate(name, room);

            // Success
            System.out.println("Booking successful!");

        } catch (InvalidBookingException e) {
            // Error handling
            System.out.println("Booking failed: " + e.getMessage());

        } finally {
            scanner.close();
        }
    }
}