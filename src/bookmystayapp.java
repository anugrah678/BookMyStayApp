import java.util.*;

/**
 * ================================================================
 * CLASS - Reservation
 * ================================================================
 */
class Reservation {

    String guestName;
    String roomType;

    public Reservation(String guestName, String roomType) {
        this.guestName = guestName;
        this.roomType = roomType;
    }
}

/**
 * ================================================================
 * CLASS - BookingHistory
 * ================================================================
 */
class BookingHistory {

    private List<Reservation> confirmedReservations;

    public BookingHistory() {
        confirmedReservations = new ArrayList<>();
    }

    // Add confirmed reservation
    public void addReservation(Reservation reservation) {
        confirmedReservations.add(reservation);
    }

    // Get all reservations
    public List<Reservation> getAllReservations() {
        return confirmedReservations;
    }
}

/**
 * ================================================================
 * CLASS - BookingReportService
 * ================================================================
 */
class BookingReportService {

    // Generate report
    public void generateReport(BookingHistory history) {

        System.out.println("\nBooking History Report\n");

        for (Reservation r : history.getAllReservations()) {
            System.out.println("Guest: " + r.guestName +
                               ", Room Type: " + r.roomType);
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

        BookingHistory history = new BookingHistory();

        // Add confirmed bookings
        history.addReservation(new Reservation("Adhi", "Single"));
        history.addReservation(new Reservation("Soumya", "Double"));
        history.addReservation(new Reservation("Vanshith", "Suite"));

        // Generate report
        BookingReportService report = new BookingReportService();
        report.generateReport(history);
    }
}