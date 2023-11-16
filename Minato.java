import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Minato extends JFrame implements ActionListener{
    public JFrame frame;

    /**
     * Displays the webpage for the Minato Japanese Restaurant portion
     * of the site
     */
    public Minato() {
        frame = new JFrame("Minato Japanese Sushi");
        frame.setTitle("Minato Japanese Sushi");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize.width, screenSize.height);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);


        // Sets the background of the window with the "sushiBackground.png"
        ImageIcon sushi = new ImageIcon("sushiBackground.jpg");
        Image newS = sushi.getImage();
        Image adjS = newS.getScaledInstance(screenSize.width, screenSize.height, java.awt.Image.SCALE_SMOOTH);
        ImageIcon newSushi = new ImageIcon(adjS);


        JLabel background = new JLabel(newSushi);
        background.setLayout(null);

        // frame.setContentPane(background);

        JPanel buttons = new JPanel(new FlowLayout());

        // Button to return to Restaurant page
        JButton returnh = new JButton("return");
        returnh.addActionListener(this);
        returnh.setSize(100, 100);

        // Button to make a reservation
        JButton reserve = new JButton("Make Reservation");
        reserve.addActionListener(this);
        reserve.setSize(100, 100);

        buttons.add(returnh);
        buttons.add(reserve);


        // Adding a JPanel over the  image
        JPanel appetizers = new JPanel();
        appetizers.setSize(200, 400);
        appetizers.setBounds(50, 100, 200, 400);

        // adding appetizers to background section
        background.add(appetizers, LEFT_ALIGNMENT);


        // Adding everything to the frame

        frame.add(background);
        
        frame.add(buttons, BorderLayout.NORTH);

        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if ("return".equals(command)) {
            frame.setVisible(false);
            new RestaurantGUI();
        }
        else if("Make Reservation".equals(command)) {
            // frame.setVisible(false);
            new ReservationList();
        }
    }

    public static void main(String[] args) {
        new Minato();
    }
}
