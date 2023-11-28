package Restaurants;

import ReservationFile.ReservationList;
import ReservationFile.ReservationManager;

import java.awt.event.ActionEvent;


public class Omogari extends Restaurant{
    public static String[] menu = {"FRIED TOFU.....................................$7.95", "POT STICKERS (6PCS)...........................$8.95",
        "SPICY WINGS (6PCS)................................$9.95", "KIMCHI PANCAKE................................$19.99",
        "FOUNTAIN DRINK...........................$2.50", "ICED TEA......................................$3.95",
        "SPARKLING WATER..........................$4.99", "SOJU..........................................$12.95",
        "SHRIMP FRIED RICE...........................$16.99", "PORK CUTLET (TON KATSU)...................$19.95",
        "TOFU SOUP.........................................$17.95", "FLAMING FONDUE CHICKEN....................$26.95"
    };

    /**
     * Displays the webpage for the Minato Japanese Restaurant portion
     * of the site
     */
    public Omogari() {
        super("Omogari", "Images/omoari_bg.jpg", "Images/omogari.png", 
            "Address: 154 Jackson St, San Jose, CA 95112", "Phone: (408) 288-8134", menu);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if ("Return".equals(command)) {
            frame.setVisible(false);
            new RestaurantGUI();
        }
        else if("Make Reservation".equals(command)) {
            ReservationList omogariList = new ReservationList("Omogari");
            ReservationManager.setReservationList("Omogari", omogariList);
        }
    }
}
