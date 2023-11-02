import java.time.LocalDate;

public class Reservation {
    private String reservationID;
    private String customerName;
    private LocalDate time;
    private double phoneNum;
    private String email;
    public String letters  = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

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


    public String generateID() {

        return reservationID;
    }

    /**
     * Adds reservation to the ReservationList
     * @param name
     * @param email
     * @param pn
     * @param time
     */
    public void addReservation(String name, String email, double pn, LocalDate time) {
        Reservation newRes = new Reservation(name, email, pn, time);
        

    }
}