import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminLoginPage extends JFrame implements ActionListener {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
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

        loginStatusLabel = new JLabel("");
        add(loginStatusLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if("admin".equals(usernameField.getText()) && "password123".equals(new String(passwordField.getPassword()))) {
            loginStatusLabel.setText("Login successful!");
        } else {
            loginStatusLabel.setText("Invalid credentials!");
        }
    }
}