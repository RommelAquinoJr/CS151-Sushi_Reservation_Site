package Restaurants;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import ReservationFile.ReservationList;


public class Minato extends JFrame implements ActionListener{
    public JFrame frame;
    private ReservationList resList;

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
        ImageIcon sushi = new ImageIcon("Images/sushiBackground.jpg");
        Image newS = sushi.getImage();
        Image adjS = newS.getScaledInstance(screenSize.width, screenSize.height, java.awt.Image.SCALE_SMOOTH);
        ImageIcon newSushi = new ImageIcon(adjS);


        JLabel background = new JLabel(newSushi);
        background.setLayout(null);

        // frame.setContentPane(background);

        JPanel buttons = new JPanel(new FlowLayout());
        buttons.setBackground(new Color(225, 214, 202));

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


        /*
         * Colors to use maybe?:
         * 
         * tan: #e1d6ca - 225, 214, 202
         * white: #f2efed - 242, 239, 237
         * green: #b0bf93 - 176, 191, 147
         * 
         */

        // Adding a JPanel over the image
        JPanel restInfo = new JPanel();
        restInfo.setBounds(50, 100, 300, 400);
        restInfo.setBackground(new Color(225, 214, 202));
        restInfo.setLayout(null);

        // Adding Restaurant Logo to side info panel
        ImageIcon restIcon = new ImageIcon("Images/Minato_logo_w-text.jpg");
        Image tempIcon = restIcon.getImage();
        Image adjIcon = tempIcon.getScaledInstance(250, 250, java.awt.Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(adjIcon);

        JLabel restImage = new JLabel(newIcon);
        restImage.setBounds(25, 25, 250, 250);

        restInfo.add(restImage);

        // Adding contact and location
        JLabel address = new JLabel("Address: 617 N 6th St, San Jose, CA 95112");
        address.setBounds(25, 275, 275, 50);

        JLabel phone = new JLabel("Phone: (408) 998-9711");
        phone.setBounds(25, 300, 275, 50);

        restInfo.add(address);
        restInfo.add(phone);

        buttons.setBounds(15, 350, 275, 50);

        restInfo.add(buttons);


        // Creating JPanel for Appetizer info
        JPanel appetizers = new JPanel();
        appetizers.setLayout(null);
        appetizers.setBounds(400, 100, 1000, 600);
        appetizers.setBackground(new Color(225, 214, 202));

        // Title of section
        JLabel appTitle = new JLabel("Appetizers");
        appTitle.setFont(new Font("SANSERIF BOLD", Font.PLAIN, 30));
        appTitle.setForeground(new Color(176, 191, 147));
        appTitle.setBounds(5, 5, 1000, 40);

        
        appetizers.add(appTitle);

        

        // adding restaurant info to background section
        background.add(restInfo, LEFT_ALIGNMENT);

        background.add(appetizers);

        


        // Adding everything to the frame

        frame.add(background);
        
        // frame.add(buttons, BorderLayout.NORTH);

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
}
