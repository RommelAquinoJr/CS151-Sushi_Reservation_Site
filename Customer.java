import java.time.LocalDate;

public class Customer {
    private double phoneNumber;
    private String email;
    private String name;
    private String reservationID;
    private LocalDate time;


    public void searchRestaurant(String name) {
        
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
    
    
    public void editReservation() {}
    
    
    public void cancelReservation() {}


    /**
     * Sets the phone number of the customer object
     * @param pn phone number
     */
    public void setPhoneNumber(double pn) {
        this.phoneNumber = pn;
    }
}