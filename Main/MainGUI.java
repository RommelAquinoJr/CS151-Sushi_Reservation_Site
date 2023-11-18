<<<<<<< HEAD:MainGUI.java
import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.*; 
=======
package Main;
>>>>>>> upstream/main:Main/MainGUI.java

public class MainGUI {
   private JFrame frame; 
   private JPanel cardPanel; 
   private CardLayout cardLayout; 

   private LandingPage landingPage = null; 
   

   public MainGUI() {
      frame = new JFrame("Main GUI"); 
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(600, 400); 

      cardPanel = new JPanel(new CardLayout()); 
      frame.add(cardPanel, BorderLayout.CENTER); 

      showLandingPage(); 
      frame.setVisible(true);
      
   }

   public void showLandingPage() {
      if(landingPage == null) { //creates new landing page only on start up 
         landingPage = new LandingPage(this); 
         cardPanel.add(landingPage, "landingPage");  
         
      }

      //cardPanel.add(landingPage, "landingPage");  
      CardLayout cardLayout = (CardLayout) cardPanel.getLayout(); 
      frame.revalidate();
      frame.repaint();
      //frame.setVisible(true);

      cardLayout.show(cardPanel, "landing Page"); 

   }

   public void showCancelReservationPage() {
      CancelReservationPage cancelRes = new CancelReservationPage(this); 
      cardPanel.add(cancelRes, "CancelReservationPage");
      cardLayout.show(cardPanel, "CancelReservationPage"); 
      
   }

   public void showAdminLoginPage() {
      AdminLoginPage adminLogin = new AdminLoginPage(); 
      cardPanel.add(adminLogin, "AdminLoginPage");
      cardLayout.show(cardPanel, "AdminLoginPage"); 

   }

   public void showReservationPage() {
      ReservationGUI reservatoinGUI = new ReservationGUI(this); 
      cardPanel.add(reservatoinGUI, "reservationPage");
      cardLayout.show(cardPanel, "reservationPage"); 
   }

   public void showRestaurantPage() {
      
   }

   public static void main(String[] args) {
      MainGUI mg = new MainGUI(); 
      mg.showLandingPage(); 

   }
}