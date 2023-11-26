package Main;
import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.*;

public class MainGUI extends JPanel{
   private JFrame frame; 
   
   public MainGUI() {
      new LandingPage(); 
      this.setVisible(true);
      
   }

   public static void main(String[] args) {
      MainGUI mg = new MainGUI();
   }

}