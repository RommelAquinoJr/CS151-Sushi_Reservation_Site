import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class RestaurantGUI extends JFrame implements ActionListener{

    /**
     * Creates the main Restaurant page that displays all the listed Restaurants
     * to schedule a reservation at
     */
    public RestaurantGUI() {
        this.setTitle("Restaurant");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(250, 250);

        // Makes window full screen, but slowly not instant
        // this.setExtendedState(JFrame.MAXIMIZED_BOTH);

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

        JButton rest1 = new JButton("rest1");
        JButton rest2 = new JButton("rest2");
        JButton rest3 = new JButton("rest3");
        JButton rest4 = new JButton("rest4");
        JButton rest5 = new JButton("rest5");

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
    }
}
