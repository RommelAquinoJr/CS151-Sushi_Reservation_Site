package Restaurants;

import ReservationFile.ReservationList;
import ReservationFile.ReservationManager;

import java.awt.event.ActionEvent;


public class Kaita extends Restaurant{
    public static String[] menu = {"COLD TOFU...........................................$5.95", "DAIKON SALAD.....................................$8.95",
        "EDAMAME..............................................$5.95", "SASHIMI.................................................$17.95",
        "FOUNTAIN DRINKS.................................$2.95", "BEER.......................................................$4.95",
        "WINE.......................................................$5.95", "Sake.......................................................$6.25",
        "CHICKEN TERIYAKI................................$16.95", "TEMPURA MIC........................................$19.95",
        "BROILED MACKERAL..............................$17.75", "GINGER PORK........................................$16.95"
    };


    /**
     * Displays the webpage for the Kaita Restaurant portion
     * of the site
     */
    public Kaita() {
        super("Kaita Restaurant", "Images/kaitaBackground.jpg", "Images/kaitaLogo.jpg", 
            "Address: 215 Jackson St, San Jose, CA 95130", "Phone: (408) 287-5551", menu);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if ("Return".equals(command)) {
            frame.setVisible(false);
            new RestaurantGUI();
        }
        else if("Make Reservation".equals(command)) {
            ReservationList kaitaList = new ReservationList("Kaita");
            ReservationManager.setReservationList("Kaita", kaitaList);
        }
    }
}
