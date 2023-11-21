package Restaurants;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

import Main.LandingPage;

public class RestaurantGUI extends JFrame implements ActionListener{

    /**
     * Creates the main Restaurant page that displays all the listed Restaurants
     * to schedule a reservation at
     */
    public RestaurantGUI() {
        this.setTitle("Restaurant");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(250, 250);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screenSize.width, screenSize.height);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        JPanel panel = new JPanel(new FlowLayout());
        JPanel restaurants = new JPanel(new GridLayout(2, 3));
        JPanel leftPanel = new JPanel();
        JPanel rightPanel = new JPanel();
        JPanel bottomPanel = new JPanel();

        leftPanel.setPreferredSize(new Dimension(50, 50));
        rightPanel.setPreferredSize(new Dimension(50, 50));
        bottomPanel.setPreferredSize(new Dimension(50, 50));

        ImageIcon minato = new ImageIcon("Images/Minato_logo_w-text.jpg");
        ImageIcon kaita = new ImageIcon("Images/kaitaLogo.jpg");
        ImageIcon koya = new ImageIcon("Images/SushiKoya.png");
        ImageIcon kaizoku = new ImageIcon("Images/kaizokuLogo.jpg");
        ImageIcon omogari = new ImageIcon("Images/omogari.png");

        JButton rest1 = new JButton("Minato Japanese Sushi");
        JButton rest2 = new JButton("Kaita Restaurant");
        JButton rest3 = new JButton("Sushi Koya");
        JButton rest4 = new JButton("Kaizoku Sushi");
        JButton rest5 = new JButton("Omogari");

        rest1.addActionListener(this);
        rest1.setIcon(minato);

        rest2.addActionListener(this);
        rest2.setIcon(kaita);

        rest3.addActionListener(this);
        rest3.setIcon(koya);

        rest4.addActionListener(this);
        rest4.setIcon(kaizoku);

        rest5.addActionListener(this);
        rest5.setIcon(omogari);


        restaurants.add(rest1);
        restaurants.add(rest2);
        restaurants.add(rest3);
        restaurants.add(rest4);
        restaurants.add(rest5);


        JButton returnHome = new JButton("Return");
        returnHome.addActionListener(this);
        returnHome.setSize(100, 100);
        panel.add(returnHome);

        this.add(panel, BorderLayout.NORTH);
        this.add(restaurants, BorderLayout.CENTER);
        this.add(leftPanel, BorderLayout.WEST);
        this.add(rightPanel, BorderLayout.EAST);
        this.add(bottomPanel, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    @Override 
    public void actionPerformed(ActionEvent e) { 
        String command = e.getActionCommand();
        if ("Return".equals(command)) {
            this.setVisible(false);
            new LandingPage();
        }
        else if("Minato Japanese Sushi".equals(command)) {
            this.setVisible(false);
            new Minato();
        }
        else if("Kaita Restaurant".equals(command)) {
            this.setVisible(false);
            new Kaita();
        }
        else if("Sushi Koya".equals(command)) {
            this.setVisible(false);
            new SushiKoya();
        }
        else if("Kaizoku Sushi".equals(command)) {
            this.setVisible(false);
            new Kaizoku();
        }
        else if("Omogari".equals(command)) {
            this.setVisible(false);
            new Omogari();
        }
    }
}
