package ReservationFile;
import java.util.Random;

public class Reservation {
    private String reservationID;
    private String customerName;
    private String time;
    private String phoneNum;
    private String restaurantName; 

    public String letters  = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public String numbers = "0123456789";

    /**
     * Creates a Reservation at a restaurant 
     * @param name name of the customer
     * @param em customer email
     * @param pn customer phone number
     * @param time time of the reservation
     */
    public Reservation(String name, String pn, String time, String restaurantName) {
        this.customerName = name;
        this.phoneNum = pn;
        this.time = time;
        this.restaurantName = restaurantName; 
        // Generate random string for reservationID
        String id = this.generateID();
        this.reservationID = id;
    }

    //Getters 

    /**
     * Gets reservationID from the reservation 
     * @return returns the reservationID 
     */
    public String getID(){
        return reservationID;
    }

    /**
     * Gets the name of the customer based on the reservation
     * @return the customerName
     */
    public String getName(){
        return customerName;
    }

    /**
     * Gets the time from the reservation 
     * @return the time the user provided from the reservation 
     */
    public String getTime(){
        return time;
    }

    /**
     * Gets the phone number 
     * @return
     */
    public String getPhone(){
        return phoneNum;
    }
    
    /**
     * Gets the restaurantName 
     * @return the name of the restaurant based on the reservation 
     */
    public String getRestaurantName(){
        return restaurantName; 
    }

    /**
     * Sets the restaurantName 
     * @param restaurantName
     */
    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName; 
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

}