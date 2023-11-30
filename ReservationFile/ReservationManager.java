package ReservationFile;

import java.util.ArrayList;
import java.util.List;

public class ReservationManager {

    private static ReservationList minatoList;
    private static ReservationList kaitaList;
    private static ReservationList kaizokuList;
    private static ReservationList omogariList;
    private static ReservationList sushikoyaList;


    /**
     * Sets a restaurant to a list 
     * @param restaurantName name of restaurant
     * @param list list specifically for the restaurant
     */
    public static void setReservationList(String restaurantName, ReservationList list) {
        switch(restaurantName) {
            case "Minato": minatoList = list; break;
            case "Kaita": kaitaList = list; break;
            case "Kaizoku": kaizokuList = list; break;
            case "Omogari": omogariList = list; break;
            case "Sushi Koya": sushikoyaList = list; break;
        }
    }

    /**
     * Gets all of the reservations from the reservation lists throughout the application
     * @return all of the reservations across all of the restaurants  
     */
    public static List<Reservation> getAllReservations() {
        List<Reservation> allReservations = new ArrayList<>();
        if (minatoList != null) allReservations.addAll(minatoList.getReservations());
        if (kaitaList != null) allReservations.addAll(kaitaList.getReservations());
        if (kaizokuList != null) allReservations.addAll(kaizokuList.getReservations());
        if (omogariList != null) allReservations.addAll(omogariList.getReservations());
        if (sushikoyaList != null) allReservations.addAll(sushikoyaList.getReservations());
        return allReservations;
    }

    /**
     * Deletes a reservation from a list if the reservationID matches up
     * @param reservationID
     */
    public static void deleteReservation(String reservationID) {
        if (minatoList != null) minatoList.deleteReservation(reservationID);
        if (kaitaList != null) kaitaList.deleteReservation(reservationID);
        if (kaizokuList != null) kaizokuList.deleteReservation(reservationID);
        if (omogariList != null) omogariList.deleteReservation(reservationID);
        if (sushikoyaList != null) sushikoyaList.deleteReservation(reservationID);
    }
}


