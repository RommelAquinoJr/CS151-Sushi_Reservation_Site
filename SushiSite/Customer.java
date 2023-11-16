import java.time.LocalDate;

public class Customer {
    private double phoneNumber;
    private String email;
    private String name;
    private String reservationID;
    private LocalDate time;


    public void searchRestaurant(String name) {
        
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