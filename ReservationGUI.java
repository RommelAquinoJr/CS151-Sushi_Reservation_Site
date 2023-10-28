import javax.swing.*;
import java.awt.*;

public class ReservationGUI {
    public ReservationGUI() {
        JFrame frame = new JFrame();

        JButton button = new JButton("Make a Reservation");

        JPanel panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 300, 300));
        panel.setLayout(new GridLayout(2, 1));
        panel.add(button);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Sushi Reservation Site");
        frame.pack();
        frame.setVisible(true);
    }
}