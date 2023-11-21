package Main;
import javax.swing.*;

import Admin.AdminLoginPage;
import ReservationFile.ReservationList;
import Restaurants.RestaurantGUI;

import java.awt.*; 

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;  

public class LandingPage extends JFrame implements ActionListener{
    //private MainGUI mainGUI;

    //landing page constructor
    public LandingPage() {
        
        this.setTitle("Restaurant Reservations"); 
        this.setSize(600,400); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        

        JPanel panel = new JPanel(); 
        panel.setLayout(new GridLayout(4,1)); 


        //Vertical buttons (book restaurant + admin login)
        JPanel verticalButtonPanel = new JPanel(); 
        verticalButtonPanel.setLayout(new GridLayout(2,1)); 

        JButton bookRest = new JButton("Book Restaurant"); 
        bookRest.addActionListener(this);
        
        JButton adminLogin = new JButton("Admin Login");
        adminLogin.addActionListener(this); 
       

        verticalButtonPanel.add(bookRest); 
        verticalButtonPanel.add(adminLogin); 
        
        panel.add(verticalButtonPanel); 

        
        //Horizontal buttons (admin create acc + cancel res)
        JPanel horizontalButtonPanel = new JPanel(); 
        horizontalButtonPanel.setLayout(new FlowLayout());

        JButton cancelRes = new JButton("Cancel Reservation"); 
        cancelRes.addActionListener(this); 

        horizontalButtonPanel.add(cancelRes); 

        panel.add(horizontalButtonPanel); 

        this.add(panel); 
        this.setVisible(true); 
    }
    


    @Override 
    public void actionPerformed(ActionEvent e) { 
        String command = e.getActionCommand();
        if ("Admin Login".equals(command)) {
            this.setVisible(false);
            new AdminLoginPage(); 

        } else if ("Book Restaurant".equals(command)) {
            this.setVisible(false);
            new RestaurantGUI(); 

        } else if ("Cancel Reservation".equals(command)) {
            this.setVisible(false);
            new CancelReservationPage(); 
        } 
    }
}
