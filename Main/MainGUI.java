package Main;
import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.*;

import Admin.AdminLoginPage;
import ReservationFile.ReservationList; 


public class MainGUI extends JPanel{
   private JFrame frame; 
 
   private LandingPage landingPage = null; 
   

   public MainGUI() {
      // frame = new JFrame("Main GUI"); 
      // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // frame.setSize(600, 400); 

      // cardPanel = new JPanel(new CardLayout()); 
      // frame.add(cardPanel, BorderLayout.CENTER); 

      showLandingPage(); 
      this.setVisible(true);
      
   }

   public void showLandingPage() {
      if(landingPage == null) { //creates new landing page only on start up 
         landingPage = new LandingPage(this);  
      }
   }

   public void showCancelReservationPage() {
      CancelReservationPage cancelRes = new CancelReservationPage(this); 
      // cardPanel.add(cancelRes, "CancelReservationPage");
      // cardLayout.show(cardPanel, "CancelReservationPage"); 
      
   }

   public void showAdminLoginPage() {
      AdminLoginPage adminLogin = new AdminLoginPage(); 
      // cardPanel.add(adminLogin, "AdminLoginPage");
      // cardLayout.show(cardPanel, "AdminLoginPage"); 

   }

   public void showReservationPage() {
      ReservationList reservationGUI = new ReservationList(); 
      // cardPanel.add(reservationGUI, "reservationPage");
      // cardLayout.show(cardPanel, "reservationPage"); 
   }

   public static void main(String[] args) {
      MainGUI mg = new MainGUI(); 
      mg.showLandingPage(); 

   }
}