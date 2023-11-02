import java.time.LocalDate;
import java.util.Random;

public class Reservation {
    private String reservationID;
    private String customerName;
    private LocalDate time;
    private double phoneNum;
    private String email;
    public String letters  = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public String numbers = "0123456789";

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
        String id = this.generateID();
        this.reservationID = id;
    }


    /**
     * Generates a random string of letters and numbers to for the Reservation ID
     * @return Reservation ID string
     */
    public String generateID() {
        String temp = "SU-";
        Random rand = new Random();

        for(int value = 0; value < 6; value ++) {
            int randVal = rand.nextInt(2);
            if(randVal == 0) {
                int randLetter = rand.nextInt(26);
                char letter = letters.charAt(randLetter);
                temp += letter;
            }
            else {
                int randNum = rand.nextInt(10);
                char number = numbers.charAt(randNum);
                temp += number;
            }
        }
        return temp;
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