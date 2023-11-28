package ReservationFile;

import java.util.ArrayList;
import java.util.List;

public class ReservationManager {

    private static ReservationList minatoList;
    private static ReservationList kaitaList;
    private static ReservationList kaizokuList;
    private static ReservationList omogariList;
    private static ReservationList sushikoyaList;

    
    public static void setReservationList(String restaurantName, ReservationList list) {
        switch(restaurantName) {
            case "Minato": minatoList = list; break;
            case "Kaita": kaitaList = list; break;
            case "Kaizoku": kaizokuList = list; break;
            case "Omogari": omogariList = list; break;
            case "Sushi Koya": sushikoyaList = list; break;
        }
    }

    public static List<Reservation> getAllReservations() {
        List<Reservation> allReservations = new ArrayList<>();
        if (minatoList != null) allReservations.addAll(minatoList.getReservations());
        if (kaitaList != null) allReservations.addAll(kaitaList.getReservations());
        if (kaizokuList != null) allReservations.addAll(kaizokuList.getReservations());
        if (omogariList != null) allReservations.addAll(omogariList.getReservations());
        if (sushikoyaList != null) allReservations.addAll(sushikoyaList.getReservations());
        return allReservations;
    }
}
