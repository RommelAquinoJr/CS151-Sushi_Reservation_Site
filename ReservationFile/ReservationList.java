package ReservationFile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
    private String restaurantName; 

    private JFrame frame;
    private DefaultTableModel tableModel;
    private JTable table;
    private JTextField customerField;
    private JTextField phoneNumField;
    private JTextField timeField, idField;
    private Map<String, Reservation> reservationMap; //maye hashmap
    private static Map<String, Reservation> minato = new HashMap<>();
    private static Map<String, Reservation> kaita = new HashMap<>();
    private static Map<String, Reservation> kaizoku = new HashMap<>();
    private static Map<String, Reservation> omogari = new HashMap<>();
    private static Map<String, Reservation> sushikoya = new HashMap<>();

   

    public List<Reservation> getReservations() {
        Map<String, Reservation> currentMap = getMapForRestaurant(restaurantName);
        return new ArrayList<>(currentMap.values());
    }
    private Map<String, Reservation> getMapForRestaurant(String restaurantName) {
        switch(restaurantName) {
            case "Minato": return minato;
            case "Kaita": return kaita;
            case "Kaizoku": return kaizoku;
            case "Omogari": return omogari;
            case "Sushi Koya": return sushikoya;
            default: return new HashMap<>();
        }
    }
    public ReservationList(String restaurantName) {

        this.restaurantName = restaurantName;

        if(restaurantName.equals("Minato"))
            this.reservationMap = minato;
        else if(restaurantName.equals("Kaita"))
            this.reservationMap = kaita;
        else if(restaurantName.equals("Kaizoku"))
            this.reservationMap = kaizoku;
        else if(restaurantName.equals("Omogari"))
            this.reservationMap = omogari;
        else if(restaurantName.equals("Sushi Koya"))
            this.reservationMap = sushikoya;

        frame = new JFrame("Reservation List");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        //Create a table
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Customer Name");
        tableModel.addColumn("Phone Number");
        tableModel.addColumn("Reserved Time");
        //Loop throught the reservation list to create a table
        for(Reservation res: reservationMap.values()){
            Vector<String> rowData = new Vector<>();
            rowData.add(res.getName());
            rowData.add(res.getPhone());
            rowData.add(res.getTime());
            tableModel.addRow(rowData);
        }
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        
        //Create pannel with Flow layout
        JPanel panel = new JPanel(new FlowLayout());
        customerField = new JTextField(15);
        phoneNumField = new JTextField(8);
        timeField = new JTextField(5);
        idField = new JTextField(8);
        idField.setEditable(false);
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
        panel.add(new JLabel("ID to copy:"));
        panel.add(idField);
        panel.add(confirmButton);


        //add all elements
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(panel, BorderLayout.NORTH);
        frame.pack();
        frame.setVisible(true);
    }

    public void deleteReservation(String reservationID) {
        reservationMap.remove(reservationID);
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
            Reservation res = new Reservation(customerName, phoneNum, time, restaurantName); //Create a reservation
            reservationMap.put(res.getID(),res);
            idField.setText(res.getID());
            customerField.setText("");
            phoneNumField.setText("");
            timeField.setText("");
            JOptionPane.showMessageDialog(this, "Reserveration successfully added. Please use this id if you want to cancel reservation: " + res.getID(), "Success", JOptionPane.INFORMATION_MESSAGE);
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
        //Check for duplicated time
        for(Reservation res: reservationMap.values()){
            if(reservationTime.equals(res.getTime())){
                JOptionPane.showMessageDialog(this, "Reservation at the time is already booked", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
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

    protected void cancelRes(String id) {
        //Check if id exists
        if(!reservationMap.containsKey(id))
            JOptionPane.showMessageDialog(this, "ID not found", "Error!", JOptionPane.ERROR_MESSAGE);
        DefaultTableModel model = (DefaultTableModel) table.getModel(); 
        String customerName = reservationMap.get(id).getName();
        String phoneNum = reservationMap.get(id).getPhone();
        String time = reservationMap.get(id).getTime();
        int rowIndexToRemove = findRowIndex(model, customerName, phoneNum, time); 
        if(rowIndexToRemove != -1) {
            reservationMap.remove(id);
            model.removeRow(rowIndexToRemove);
        } else {
            JOptionPane.showMessageDialog(this, "Reservation not found for cancellation", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }

    private int findRowIndex(DefaultTableModel model, String customerName, String phoneNum, String time) {
        for(int i = 0; i < model.getRowCount(); i++) {
            String custName = model.getValueAt(i,0).toString(); 
            String customerPhoneNum = model.getValueAt(i, 1).toString(); 
            String timeCol = model.getValueAt(i, 2).toString(); 
            
            if(custName.equals(customerName) && customerPhoneNum.equals(phoneNum) && timeCol.equals(time)) {
                return i; 
            }
        }

        return -1; //row not found 
    }

}