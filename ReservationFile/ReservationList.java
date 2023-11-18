package ReservationFile;

import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ReservationList extends JFrame {
    private String customerName;
    private String time;
    private String phoneNum;
    private JFrame frame;
    private DefaultTableModel tableModel;
    private JTable table;
    private JTextField customerField;
    private JTextField phoneNumField;
    private JTextField timeField;
  
    public ReservationList(){

        frame = new JFrame("Reservation List");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        //Create a table
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Customer Name");
        tableModel.addColumn("Phone Number");
        tableModel.addColumn("Reserved Time");
        
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        //Create pannel with Flow layout
        JPanel panel = new JPanel(new FlowLayout());
        customerField = new JTextField(15);
        phoneNumField = new JTextField(10);
        timeField = new JTextField(10);
        JButton confirmButton = new JButton("Confirm");
        //action listoner of confirm Button
        confirmButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                addRes();
            }
        });

        //Add fields and button to panel
        panel.add(new JLabel("Customer Name"));
        panel.add(customerField);
        panel.add(new JLabel(" Phone Number"));
        panel.add(phoneNumField);
        panel.add(new JLabel("Time:"));
        panel.add(timeField);
        panel.add(confirmButton);


        //add all elements
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(panel, BorderLayout.NORTH);
        frame.pack();
        frame.setVisible(true);
    }

    public void addRes() {
        customerName = customerField.getText();
        phoneNum = phoneNumField.getText();
        time = timeField.getText();
        
        if(isValidCustomerInfo(customerName, phoneNum, time)){ //Validate customer's info
            Vector<String> rowData = new Vector<>();
            rowData.add(customerName);
            rowData.add(phoneNum);
            rowData.add(time);
            tableModel.addRow(rowData);
            new Reservation(customerName, phoneNum, time); //Create a reservation
            customerField.setText("");
            phoneNumField.setText("");
            timeField.setText("");
        }else {
        // Display an error message or take appropriate action
        JOptionPane.showMessageDialog(this, "Invalid customer information. Please check and try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Validate customer information.
     * @param name Customer's name
     * @param phone Customer's phone number
     * @param reservationTime Customer's reservation time
     * @return True if customer information is valid, false otherwise
     */
    public boolean isValidCustomerInfo(String name, String phone, String reservationTime){
        return isValidName(name) && isValidPhoneNumber(phone) && isValidTime(reservationTime);
    }
    /**
     * Validate customer's phoneNumber
     * @param phone Customer's phone number
     * @return True if customer's informatin is valid, false otherwise
     */ 
    private boolean isValidPhoneNumber(String phone){
        return phone.matches("\\d+") && phone.length() == 10;
    }

    /**
     * Validate customer's reservation time.
     * @param time Customer's reservation time
     * @return True if the reservation time is valid, false otherwise
     */
    private boolean isValidTime(String time){
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
        try{
            dateFormat.parse(time);
            return true;
        } catch(ParseException e){
            return false;
        }
    }
        /**
     * Validate customer's name.
     * @param name Customer's name
     * @return True if the name is valid, false otherwise
     */
    private boolean isValidName(String name) {
        return !name.isEmpty() && name.matches("^[a-zA-Z\\s-]+$");
    }
}