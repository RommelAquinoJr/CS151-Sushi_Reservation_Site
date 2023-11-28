package Admin;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminLoginPage extends JFrame implements ActionListener {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton returnButton;
    private JLabel loginStatusLabel;

    public AdminLoginPage() {
        setTitle("Admin Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(4, 2));


        add(new JLabel("Username:"));
        usernameField = new JTextField();
        add(usernameField);

        add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        add(passwordField);

        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        add(loginButton);

        returnButton = new JButton("Return");
        returnButton.addActionListener(this);
        add(returnButton);

        loginStatusLabel = new JLabel("");
        add(loginStatusLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == returnButton) {
            dispose();
            new Main.LandingPage();
        }
        
        if("admin".equals(usernameField.getText()) && "password123".equals(new String(passwordField.getPassword()))) {
            this.setVisible(false);
            new AdminPage();
        } else {
            loginStatusLabel.setText("Invalid credentials!");
        }
    }
}