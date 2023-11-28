package Restaurants;

import ReservationFile.ReservationList;
import ReservationFile.ReservationManager;

import java.awt.event.ActionEvent;


public class SushiKoya extends Restaurant{
    public static String[] menu = {"HIYAYAKKO...........................................$4.95", "GYOZA(6PCS).........................................$4.95",
        "EDAME...................................................$2.95", "SASHIMI.................................................$12.95",
        "FOUNTAIN DRINKS.................................$2.95", "BEER.......................................................$3.95",
        "WINE.......................................................$10.95", "Sake.......................................................$4.95",
        "DRAGON ROLL........................................$15.95", "KOYA ROLL.............................................$17.95",
        "CRUNCH ROLL........................................$13.95", "LET YOUR MAN GO ROLL.......................$15.95"

    };


    /**
     * Displays the webpage for the Sushi Koya Restaurant portion
     * of the site
     */
    public SushiKoya() {
        super("Sushi Koya", "Images/koyaBackground.jpg", "Images/SushiKoya.png",
             "Address: 2424 Almaden Rd, San Jose, CA 95125", "Phone: (408) 960-6339", menu);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if ("Return".equals(command)) {
            frame.setVisible(false);
            new RestaurantGUI();
        }
        else if("Make Reservation".equals(command)) {
            ReservationList sushikoyaList = new ReservationList("Sushi Koya");
            ReservationManager.setReservationList("Sushi Koya", sushikoyaList);
        }
    }
}