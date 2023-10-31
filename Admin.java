public class Admin {
    private String userName;
    private boolean isLoggedIn = false;

    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "password123";

    public Admin(String userName) {
        this.userName = userName;
    }

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
    public void logOut() {
        if (this.isLoggedIn) {
            this.isLoggedIn = false;
            System.out.println("Logged out successfully!");
        } else {
            System.out.println("You're not logged in!");
        }
    }
    public void confirmReservation() {}
    public void denyReservation() {}
    public void editReservation() {}
    //test
}
