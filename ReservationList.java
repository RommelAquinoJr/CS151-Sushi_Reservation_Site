import java.time.LocalDate;
import java.util.Vector;

import javax.accessibility.AccessibleAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
        JButton cancelButton = new JButton("Cancel");

        //Add fields and button to panel
        panel.add(new JLabel("Customer"));
        panel.add(customerField);
        panel.add(new JLabel(" Phone Number"));
        panel.add(phoneNumField);
        panel.add(new JLabel("Time:"));
        panel.add(timeField);
        panel.add(confirmButton);
        panel.add(cancelButton);


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
        
        if(!customerName.isEmpty() && !phoneNum.isEmpty() && !time.isEmpty()){
            Vector<String> rowData = new Vector<>();
            rowData.add(customerName);
            rowData.add(phoneNum);
            rowData.add(time);
            tableModel.addRow(rowData);
            customerField.setText("");
            phoneNumField.setText("");
            timeField.setText("");
        }
    }
    public void deleteRes(String reservationID) {

    }
}