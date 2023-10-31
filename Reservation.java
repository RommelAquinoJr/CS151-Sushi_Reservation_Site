import java.time.LocalDate;

public class Reservation {
    private String reservationID;
    private String customerName;
    private LocalDate time;
    private double phoneNum;
    private String email;

    /**
     * Creates a Reservation at a restaurant 
     * @param name name of the customer
     * @param em customer email
     * @param pn customer phone number
     * @param time time of the reservation
     */
    public Reservation(String name, String em, double pn, LocalDate time) {
        this.customerName = name;
        this.email = em;
        this.phoneNum = pn;
        this.time = time;
        // Generate random string for reservationID
    }
}