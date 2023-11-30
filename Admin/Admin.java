package Admin;
public class Admin {
    private String userName;
    private boolean isLoggedIn = false;

    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "password123";

    /**
     * Admin constructor that takes in a username String 
     * @param userName
     */
    public Admin(String userName) {
        this.userName = userName;
    }

    /**
     * A method used to see if the user put in the correct credentials
     * @param password
     * @return true if login is successful and false if login is failed 
     * 
     */
    public boolean login(String password) {
        if (this.userName.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
            this.isLoggedIn = true;
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Login failed! Please check your credentials.");
            return false;
     }
    }

    /** 
     * Tells the user if they logged out or not 
     */
    public void logOut() {
        if (this.isLoggedIn) {
            this.isLoggedIn = false;
            System.out.println("Logged out successfully!");
        } else {
            System.out.println("You're not logged in!");
        }
    }
   
}
