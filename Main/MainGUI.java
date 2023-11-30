package Main;

import javax.swing.*;

public class MainGUI extends JPanel{
   
   public MainGUI() {
      new LandingPage(); 
      this.setVisible(true);
      
   }

   public static void main(String[] args) {
      MainGUI mg = new MainGUI();
   }

}