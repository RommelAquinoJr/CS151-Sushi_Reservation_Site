import javax.swing.*;
import java.awt.*; 

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;  

public class LandingPage extends JFrame implements ActionListener{

    //landing page constructor
    public LandingPage() {
        this.setTitle("Restaurant Reservations"); 
        this.setSize(600,400); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        

        JPanel panel = new JPanel(); 
        panel.setLayout(new GridLayout(4,1)); 


        //Vertical buttons (book restaurant + admin login)
        JPanel verticalButtonPanel = new JPanel(); 
        verticalButtonPanel.setLayout(new GridLayout(2,1)); 

        JButton bookRest = new JButton("Book Restaurant"); 
        bookRest.addActionListener(this);
        
        JButton adminLogin = new JButton("Admin Login");
        adminLogin.addActionListener(this); 
       

        verticalButtonPanel.add(bookRest); 
        verticalButtonPanel.add(adminLogin); 
        
        panel.add(verticalButtonPanel); 

        
        //Horizontal buttons (admin create acc + cancel res)
        JPanel horizontalButtonPanel = new JPanel(); 
        horizontalButtonPanel.setLayout(new FlowLayout());

        // JButton adminCreateAcc = new JButton("Admin: Create an Account"); 
        // adminCreateAcc.addActionListener(this); 

        JButton cancelRes = new JButton("Cancel Reservation"); 
        cancelRes.addActionListener(this); 

        // horizontalButtonPanel.add(adminCreateAcc); 
        horizontalButtonPanel.add(cancelRes); 

        panel.add(horizontalButtonPanel); 


        this.add(panel); 
        this.setVisible(true); 
    }
    


    @Override 
    public void actionPerformed(ActionEvent e) { 
        String command = e.getActionCommand();
        if ("Admin Login".equals(command)) {
            new AdminLoginPage();
        } else if ("Book Restaurant".equals(command)) {
            new ReservationList();
            
        } else if ("Cancel Reservation".equals(command)) {
            System.out.println("test");
            
        }
    }
}
