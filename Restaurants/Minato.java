package Restaurants;

import ReservationFile.ReservationList;
import ReservationFile.ReservationManager;

import java.awt.event.ActionEvent;


public class Minato extends Restaurant{
    public static ReservationList instance; //Singleton ReservationList
    // private ReservationList resList;
    public static String[] menu = { "HIYAYAKKO...........................................$4.99", "GYOZA(6PCS).........................................$4.99",
        "EDAME...................................................$2.99","SASHIMI.................................................$12.99",
        "FOUNTAIN DRINKS.................................$1.99", "BEER.......................................................$3.99",
        "WINE.......................................................$10.99", "Sake.......................................................$4.99",
        "WORLD FAMOUS TERIYAKI SPARERIBS...$16.99", "SHASHIMI...............................................$28.99",
        "KATSU CURRY........................................$6.99", "SABA (BROILED MACKEREL)....................$7.99"
    };


    /**
     * Displays the webpage for the Minato Japanese Restaurant portion
     * of the site
     */
    public Minato() {
        super("Minato Japanese Sushi", "Images/sushiBackground.jpg", "Images/Minato_logo_w-text.jpg",
             "Address: 617 N 6th St, San Jose, CA 95112", "Phone: (408) 998-9711", menu);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if ("Return".equals(command)) {
            frame.setVisible(false);
            new RestaurantGUI();
        }
        else if("Make Reservation".equals(command)) {
            ReservationList minatoList = new ReservationList("Minato");
            ReservationManager.setReservationList("Minato", minatoList);
        }
    }
}
