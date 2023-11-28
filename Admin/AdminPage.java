package Admin;

import javax.swing.*;

import ReservationFile.ReservationList;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminPage extends JFrame implements ActionListener {
    private JLabel welcomeLabel;
   
    private JButton viewDetailsButton;
    private JButton acceptButton;
    private JButton denyButton;
    private JButton logoutButton;
    

    public AdminPage() {

        

        setTitle("Admin Dashboard");
        setSize(600, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Welcome Label
        welcomeLabel = new JLabel("Welcome to the Admin Dashboard");
        add(welcomeLabel, BorderLayout.NORTH);

        // Table for Reservations
    

        // Buttons
        viewDetailsButton = new JButton("View Details");
        acceptButton = new JButton("Accept Reservation");
        denyButton = new JButton("Deny Reservation");
        logoutButton = new JButton("Logout");

        viewDetailsButton.addActionListener(this);
        acceptButton.addActionListener(this);
        denyButton.addActionListener(this);
        logoutButton.addActionListener(this);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(viewDetailsButton);
        buttonPanel.add(acceptButton);
        buttonPanel.add(denyButton);
        buttonPanel.add(logoutButton);

        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

     

        if (e.getSource() == logoutButton) {
            dispose();
            new Main.LandingPage();
        } else if (e.getSource() == viewDetailsButton) {
            new ReservationList(getName());
        } else if (e.getSource() == acceptButton) {
            updateReservationStatus("Accepted");
        } else if (e.getSource() == denyButton) {
            updateReservationStatus("Denied");
        }
    }

  

    // private void displayReservationDetails(Reservation reservation) {
       
    // }

    private void updateReservationStatus(String status) {
      
    }
}

