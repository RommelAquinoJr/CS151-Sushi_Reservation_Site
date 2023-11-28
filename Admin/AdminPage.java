package Admin;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import ReservationFile.Reservation;

import ReservationFile.ReservationManager;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.util.List;

public class AdminPage extends JFrame implements ActionListener {
   
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

        createReservationTable();
        populateReservations();

        
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
        
        tableModel = new DefaultTableModel();
        

        tableModel.addColumn("Customer Name");
        tableModel.addColumn("Phone Number");
        tableModel.addColumn("Reserved Time");
        tableModel.addColumn("Restaurant");
        tableModel.addColumn("ID");

        
        table = new JTable(tableModel);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane scrollPane = new JScrollPane(table);
        
     
        add(scrollPane, BorderLayout.CENTER);

    }

    private void populateReservations() {
        List<Reservation> allReservations = ReservationManager.getAllReservations();
        for (Reservation res : allReservations) {
            Vector<String> rowData = new Vector<>();
            rowData.add(res.getName());
            rowData.add(res.getPhone());
            rowData.add(res.getTime());
            rowData.add(res.getRestaurantName());
            rowData.add(res.getID());
            tableModel.addRow(rowData);
        }
    }



    @Override
    public void actionPerformed(ActionEvent e) {

     

        if (e.getSource() == logoutButton) {
            dispose();
            new Main.LandingPage();
        } else if (e.getSource() == acceptButton) {
            acceptReservation();
           
        } else if (e.getSource() == denyButton) {
            denyReservation();
            
        }
    }
    private void deleteReservation() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow >= 0) {
            String reservationID = tableModel.getValueAt(selectedRow,4).toString(); 
            ReservationManager.deleteReservation(reservationID); 
            tableModel.removeRow(selectedRow);
            JOptionPane.showMessageDialog(this, 
            "Reservation Declined. A text confirmation has been sent.", 
            "Declined", 
            JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a reservation.");
        }
    }

    private void acceptReservation() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow >= 0) {
            JOptionPane.showMessageDialog(this, 
            "Reservation confirmed. A text confirmation has been sent.", 
            "Confirmation", 
            JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a reservation to accept.");
        }
    }
    
    private void denyReservation() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow >= 0) {
            deleteReservation();
        } else {
            JOptionPane.showMessageDialog(this, "Please select a reservation to deny.");
        }
    }

  

   

  
}

