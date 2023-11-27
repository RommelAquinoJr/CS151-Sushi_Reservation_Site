package ReservationFile;
import javax.swing.*;

import Main.LandingPage;

import java.awt.*; 
import java.awt.event.*;

public class CancelReservationPage extends JFrame implements ActionListener {

    // private JTextField idField; 
    private JTextField idField; 
    //private JTextField timeField; 
    private JButton confirmButton;  
    private JButton returnButton; 
    private ReservationList reservationList; 
   

    public CancelReservationPage(ReservationList reservationList) {
        this.reservationList = reservationList;  
        this.setTitle("Cancel Reservation"); 
        this.setSize(300,200); 
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        this.setLayout(new GridLayout(4, 2)); 

        // add(new JLabel("Name:"));
        // idField = new JTextField();
        // idField.setEditable(true);
        // this.add(idField); 

        this.add(new JLabel("Please entor your ID:"));
        idField = new JTextField(); 
        idField.setEditable(true); 
        this.add(idField); 

        // this.add(new JLabel("Reservation time:"));
        // timeField = new JTextField(); 
        // timeField.setEditable(true);
        // this.add(timeField); 
        

        confirmButton = new JButton("Confirm cancellation");
        confirmButton.addActionListener(this); 
        this.add(confirmButton);   //says yes, confirming cancellation

        returnButton = new JButton("Return"); //says no, taking you back to keep the reservation 
        returnButton.addActionListener(this);
        this.add(returnButton); 

        this.setVisible(true);

    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == confirmButton) { //cancels reservation  
            String id = idField.getText(); 

            if(!id.isEmpty()) {
                reservationList.cancelRes(id); 
                JOptionPane.showMessageDialog(this, "Reservation canceled successfully!");
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Please fill in all of the fields.", "Error!", JOptionPane.ERROR_MESSAGE);
            }
            
        } else if(e.getSource() == returnButton) { //takes you back to home page  
            this.setVisible(false);
            new LandingPage(); 
        }
    } 
    

}
