package ReservationFile;
import javax.swing.*;

import Main.LandingPage;

import java.awt.*; 
import java.awt.event.*;

public class CancelReservationPage extends JFrame implements ActionListener {

    private JTextField idField; 
    private JTextField resName;
    private JButton confirmButton;  
    private JButton returnButton; 
    private ReservationList reservationList; 
   

    public CancelReservationPage() {
        this.setTitle("Cancel Reservation"); 
        this.setSize(300,200); 
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        this.setLayout(new GridLayout(4, 2)); 

        this.add(new JLabel("Restaurant Name:"));
        resName = new JTextField();
        resName.setEditable(true);
        this.add(resName); 

        this.add(new JLabel("Please enter your ID:"));
        idField = new JTextField(); 
        idField.setEditable(true); 
        this.add(idField); 
        
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
        // Create a reservation List based on the restaurant Name
        if (!resName.getText().isEmpty()) {
            this.reservationList = new ReservationList(resName.getText());
        }
        if(e.getSource() == confirmButton) { //cancels reservation  
            String id = idField.getText(); 

            if(!id.isEmpty()) {
                reservationList.cancelRes(id); 
                JOptionPane.showMessageDialog(this, "Reservation canceled successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Please fill in all of the fields.", "Error!", JOptionPane.ERROR_MESSAGE);
            }
            
        } else if(e.getSource() == returnButton) { //takes you back to home page  
            this.setVisible(false);
            new LandingPage(); 
        }
    } 
    

}
