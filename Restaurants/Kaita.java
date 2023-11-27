package Restaurants;

import ReservationFile.ReservationList;

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

public class Kaita implements ActionListener{
    public JFrame frame;
    private ReservationList resList;
    public JLabel[] apps = new JLabel[4];
    public JLabel app1, app2, app3, app4;

    /**
     * Displays the webpage for the Kaita Restaurant portion
     * of the site
     */
    public Kaita() {
        frame = new JFrame("Kaita Restaurant");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize.width, screenSize.height);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);


        // Sets the background of the window with the "sushiBackground.png"
        ImageIcon sushi = new ImageIcon("Images/kaitaBackground.jpg");
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
        JButton returnh = new JButton("Return");
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
        ImageIcon restIcon = new ImageIcon("Images/kaitaLogo.jpg");
        Image tempIcon = restIcon.getImage();
        Image adjIcon = tempIcon.getScaledInstance(250, 250, java.awt.Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(adjIcon);

        JLabel restImage = new JLabel(newIcon);
        restImage.setBounds(25, 25, 250, 250);

        restInfo.add(restImage);

        // Adding contact and location
        JLabel address = new JLabel("Address: 215 Jackson St, San Jose, CA 95130");
        address.setBounds(25, 275, 275, 50);

        JLabel phone = new JLabel("Phone: (408) 287-5551");
        phone.setBounds(25, 300, 275, 50);

        restInfo.add(address);
        restInfo.add(phone);

        buttons.setBounds(15, 350, 275, 50);

        restInfo.add(buttons);


        // Creating JPanel for Appetizer info
        JPanel appetizers = new JPanel();
        appetizers.setLayout(null);
        appetizers.setBounds(400, 100, 1000, 300);
        appetizers.setBackground(new Color(225, 214, 202));

        // Title of section
        JLabel appTitle = new JLabel("Appetizers");
        appTitle.setFont(new Font("SANSERIF BOLD", Font.PLAIN, 40));
        appTitle.setBounds(20, 10, 1000, 40);

        // Creating appetizers
        apps[0] = (app1 = new JLabel("COLD TOFU...........................................$5.95"));
        apps[1] = (app2 = new JLabel("DAIKON SALAD.....................................$8.95"));
        apps[2] = (app3 = new JLabel("EDAMAME..............................................$5.95"));
        apps[3] = (app4 = new JLabel("SASHIMI.................................................$17.95"));

        for(JLabel l : apps) {
            l.setFont(new Font("SANSERIF BOLD", Font.PLAIN, 30));
            appetizers.add(l);
        }

        apps[0].setBounds(20, 70, 1000, 40);
        apps[1].setBounds(20, 120, 1000, 40);
        apps[2].setBounds(20, 170, 1000, 40);
        apps[3].setBounds(20, 220, 1000, 40);



        appetizers.add(appTitle);


        // Adding Drinks
        JPanel drinkPanel = new JPanel();
        drinkPanel.setLayout(null);
        drinkPanel.setBounds(400, 450, 1000, 300);
        drinkPanel.setBackground(new Color(225, 214, 202));

        JLabel drinkTitle = new JLabel("Drinks");
        drinkTitle.setFont(new Font("SANSERIF BOLD", Font.PLAIN, 40));
        drinkTitle.setBounds(20, 10, 1000, 40);

        drinkPanel.add(drinkTitle);

        // Creating Drinks
        apps[0] = (app1 = new JLabel("FOUNTAIN DRINKS.................................$2.95"));
        apps[1] = (app2 = new JLabel("BEER.......................................................$4.95"));
        apps[2] = (app3 = new JLabel("WINE.......................................................$5.95"));
        apps[3] = (app4 = new JLabel("Sake.......................................................$6.25"));

        for(JLabel l : apps) {
            l.setFont(new Font("SANSERIF BOLD", Font.PLAIN, 30));
            drinkPanel.add(l);
        }

        apps[0].setBounds(20, 70, 1000, 40);
        apps[1].setBounds(20, 120, 1000, 40);
        apps[2].setBounds(20, 170, 1000, 40);
        apps[3].setBounds(20, 220, 1000, 40);


        // Adding Main Dishes
        JPanel entreePanel = new JPanel();
        entreePanel.setLayout(null);
        entreePanel.setBounds(400, 800, 1000, 300);
        entreePanel.setBackground(new Color(225, 214, 202));

        JLabel entreeTitle = new JLabel("Main Dishes");
        entreeTitle.setFont(new Font("SANSERIF BOLD", Font.PLAIN, 40));
        entreeTitle.setBounds(20, 10, 1000, 40);

        entreePanel.add(entreeTitle);

        // Creating Main Dishes
        apps[0] = (app1 = new JLabel("CHICKEN TERIYAKI................................$16.95"));
        apps[1] = (app2 = new JLabel("TEMPURA MIC........................................$19.95"));
        apps[2] = (app3 = new JLabel("BROILED MACKERAL..............................$17.75"));
        apps[3] = (app4 = new JLabel("GINGER PORK........................................$16.95"));

        for(JLabel l : apps) {
            l.setFont(new Font("SANSERIF BOLD", Font.PLAIN, 30));
            entreePanel.add(l);
        }

        apps[0].setBounds(20, 70, 1000, 40);
        apps[1].setBounds(20, 120, 1000, 40);
        apps[2].setBounds(20, 170, 1000, 40);
        apps[3].setBounds(20, 220, 1000, 40);


        // adding restaurant info to background section
        background.add(restInfo);
        background.add(appetizers);
        background.add(entreePanel);
        background.add(drinkPanel);


        // Adding everything to the frame
        frame.getContentPane().add(scroll);

        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if ("Return".equals(command)) {
            frame.setVisible(false);
            new RestaurantGUI();
        }
        else if("Make Reservation".equals(command)) {
            // frame.setVisible(false);
            new ReservationList("Kaita");
        }
    }

    public static void main(String[] args) {
        new Minato();
    }
}
