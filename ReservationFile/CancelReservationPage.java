package ReservationFile;
import javax.swing.*;

import Main.LandingPage;
import Main.MainGUI;

import java.awt.*; 
import java.awt.event.*;

public class CancelReservationPage extends JFrame implements ActionListener {

    private JTextField nameField; 
    private JPasswordField reservationID; 
    private JButton yesButton;  
    private JButton noButton; 
    private LandingPage landingPage; 
    private MainGUI mainGUI; 

    public CancelReservationPage(MainGUI mainGUI) {
        this.mainGUI = mainGUI;  

        this.setTitle("Cancel Reservation"); 
        this.setSize(300,200); 
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        this.setLayout(new GridLayout(4, 2)); 

        add(new JLabel("Name:"));
        nameField = new JTextField();
        nameField.setEditable(true);
        this.add(nameField); 

        this.add(new JLabel("ReservationID:"));
        reservationID = new JPasswordField();
        reservationID.setEditable(true); 
        this.add(reservationID); 
        

        yesButton = new JButton("Yes");
        yesButton.addActionListener(this); 
        this.add(yesButton);   //says yes, confirming cancellation

        noButton = new JButton("No"); //says no, taking you back to keep the reservation 
        noButton.addActionListener(this);
        this. add(noButton); 

        this.setVisible(true);

        
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == yesButton) { //cancels reservation  
            System.out.println("Yes");  
            dispose();
        } else if(e.getSource() == noButton) { //takes you back to home page  
            System.out.println("No");  
            dispose(); 
            new LandingPage(); 
        }
    } 
    

}
