package Main;
import javax.swing.*;

import Admin.AdminLoginPage;
import Admin.AdminPage;
import ReservationFile.CancelReservationPage;
import ReservationFile.ReservationList;
import Restaurants.RestaurantGUI;

import java.awt.*; 

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;  

public class LandingPage extends JFrame implements ActionListener{

    //landing page constructor
    public LandingPage() {
        
        this.setTitle("Restaurant Reserve"); 
        this.setSize(600,440); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        JPanel mainPanel = new JPanel(); 
        mainPanel.setLayout(new BorderLayout()); 

        //create logo panel on the left 
        JPanel logoPanel = new JPanel(); 
        logoPanel.setBackground(Color.WHITE);

        ImageIcon logoIcon = new ImageIcon("Images/app_logo.PNG"); 
        Image scaledLogo = logoIcon.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH); 
        ImageIcon scaledLogoIcon = new ImageIcon(scaledLogo); 

        JLabel logoLabel = new JLabel(scaledLogoIcon); 
        logoPanel.add(logoLabel); 

        mainPanel.add(logoPanel, BorderLayout.WEST); 
        

        //create panel for buttons
        JPanel buttonPanel = new JPanel(new FlowLayout()); 

        JButton bookRest = new JButton("Book Restaurant"); 
        bookRest.addActionListener(this);

        JButton adminLogin = new JButton("Admin Login");
        adminLogin.addActionListener(this);

        JButton cancelRes = new JButton("Cancel Reservation"); 
        cancelRes.addActionListener(this); 
       
        buttonPanel.add(bookRest); 
        buttonPanel.add(adminLogin); 
        buttonPanel.add(cancelRes); 

        mainPanel.add(buttonPanel, BorderLayout.CENTER); 

        this.add(mainPanel); 
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
            CancelReservationPage cancel = new CancelReservationPage(); 
            cancel.setVisible(true);
        } 
    }
}
