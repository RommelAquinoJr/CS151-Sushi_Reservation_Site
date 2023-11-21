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
      new LandingPage(); 
      this.setVisible(true);
      
   }

   public static void main(String[] args) {
      MainGUI mg = new MainGUI(); 
      
   }
}