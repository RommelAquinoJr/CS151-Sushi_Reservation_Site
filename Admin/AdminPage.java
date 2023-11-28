package Admin;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

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
    private JTable table; 
    private DefaultTableModel tableModel; 

    

    public AdminPage() {

   
        setTitle("Admin Dashboard");
        setSize(600, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Welcome Label
        welcomeLabel = new JLabel("Welcome to the Admin Dashboard");
        add(welcomeLabel, BorderLayout.NORTH);

        // Table for Reservations
        createReservationTable();

        // Buttons
        acceptButton = new JButton("Accept Reservation");
        denyButton = new JButton("Deny Reservation");
        logoutButton = new JButton("Logout");

        
        acceptButton.addActionListener(this);
        denyButton.addActionListener(this);
        logoutButton.addActionListener(this);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(acceptButton);
        buttonPanel.add(denyButton);
        buttonPanel.add(logoutButton);

        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void createReservationTable() {
        // Create a table model
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Customer Name");
        tableModel.addColumn("Phone Number");
        tableModel.addColumn("Reserved Time");

        
        table = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);
        
     
        add(scrollPane, BorderLayout.CENTER);

        
    }



    @Override
    public void actionPerformed(ActionEvent e) {

     

        if (e.getSource() == logoutButton) {
            dispose();
            new Main.LandingPage();
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

