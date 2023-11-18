package Restaurants;

import ReservationFile.ReservationList;

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
import javax.swing.JScrollPane;

public class Kaizoku implements ActionListener{
    public JFrame frame;
    private ReservationList resList;
    public JLabel[] apps = new JLabel[4];
    public JLabel app1, app2, app3, app4;

    /**
     * Displays the webpage for the Minato Japanese Restaurant portion
     * of the site
     */
    public Kaizoku() {
        frame = new JFrame("Kaizoku Sushi");
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

        frame.add(background);


        // Making the page scrollable
        JScrollPane scroll = new JScrollPane(background);

        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);


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
        ImageIcon restIcon = new ImageIcon("Images/kaizokuLogo.jpg");
        Image tempIcon = restIcon.getImage();
        Image adjIcon = tempIcon.getScaledInstance(250, 250, java.awt.Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(adjIcon);

        JLabel restImage = new JLabel(newIcon);
        restImage.setBounds(25, 25, 250, 250);

        restInfo.add(restImage);

        // Adding contact and location
        JLabel address = new JLabel("Address: 1710 Berryessa Rd 111, San Jose, CA 95133");
        address.setBounds(25, 275, 275, 50);

        JLabel phone = new JLabel("Phone: (669) 284-3967");
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
        appTitle.setFont(new Font("SANSERIF BOLD", Font.PLAIN, 40));
        appTitle.setBounds(20, 10, 1000, 40);

        // Creating appetizers
        apps[0] = (app1 = new JLabel("HIYAYAKKO......................$4.99"));
        apps[1] = (app2 = new JLabel("GYOZA(6PCS)....................$4.99"));
        apps[2] = (app3 = new JLabel("EDAME..............................$2.99"));
        apps[3] = (app4 = new JLabel("SASHIMI............................$12.99"));

        for(JLabel l : apps) {
            l.setFont(new Font("SANSERIF BOLD", Font.PLAIN, 30));
            appetizers.add(l);
        }

        apps[0].setBounds(20, 70, 1000, 40);
        apps[1].setBounds(20, 120, 1000, 40);
        apps[2].setBounds(20, 170, 1000, 40);
        apps[3].setBounds(20, 220, 1000, 40);



        appetizers.add(appTitle);

        

        // adding restaurant info to background section
        background.add(restInfo);
        background.add(appetizers);
        


        // Adding everything to the frame

        // frame.add(background);
        frame.getContentPane().add(scroll);


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
