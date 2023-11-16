import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;  


public class ReservationGUI extends JFrame implements ActionListener {
    private MainGUI mainGUI;

    public ReservationGUI(MainGUI mainGUI) {
        this.mainGUI = mainGUI; 
        JFrame frame = new JFrame();

        JButton button = new JButton("Make a Reservation");
        button.addActionListener(this);


        JPanel panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 300, 300));
        panel.setLayout(new GridLayout(2, 1));
        panel.add(button);
        
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setTitle("Restaurant Reservation App");
        frame.pack();
        frame.setVisible(true);
        
    }

    @Override 
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand(); 
        if("Make a Reservation".equals(command)) {
            mainGUI.showReservationPage(); 
        }
    }
}