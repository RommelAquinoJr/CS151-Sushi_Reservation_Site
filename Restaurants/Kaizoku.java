package Restaurants;

import ReservationFile.ReservationList;
import ReservationFile.ReservationManager;

import java.awt.event.ActionEvent;


public class Kaizoku extends Restaurant{
    public static String[] menu = {"SHRIMP TEMPURA...................$6.99", "GYOZA(6PCS).........................$5.99",
        "EDAME....................................$4.99", "VEGGIE TEMPURA.....................$5.99",
        "FOUNTAIN DRINK...................$3.99", "MILK SHAKES...........................$6.99",
        "BOTTLED WATER......................$2.99", "GREEN TEA..............................$3.99",
        "MAGURO (TUNA) SASHIMI..........$6.50", "TOBIKO (ROE)............................$5.75",
        "BENTO BOX.............................$14.99", "SPICY TUNA ROLL....................$10.99"

    };
 

    /**
     * Displays the webpage for the Minato Japanese Restaurant portion
     * of the site
     */
    public Kaizoku() {
        super("Kaizoku Sushi", "Images/kaizoku.jpg", "Images/kaizokuLogo.jpg",
            "Address: 1710 Berryessa Rd 111, San Jose, CA 95133", "Phone: (669) 284-3967", menu);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if ("Return".equals(command)) {
            frame.setVisible(false);
            new RestaurantGUI();
        }
        else if("Make Reservation".equals(command)) {
            ReservationList kaizokuList = new ReservationList("Kaizoku");
            ReservationManager.setReservationList("Kaizoku", kaizokuList);
        }
    }
}
