/**
 * This is the interface to the login menu.
 * 
 * This is where users/actors enter their
 * AlphaCare account credentials, allowing
 * them to log in.
 */
package View;


import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class LoginPageView extends JFrame {
    private JPanel loginPanel;
    private JLabel userNameLabel;
    private JLabel passwordLabel;
    private JTextField userNameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton registerButton;

    /**
     * This constructor will instantiate the login window's interface.
     */
    public LoginPageView() {
        loginUI();
    }

    private void loginUI() {
        setSize(800, 600);
        setTitle("AlphaCare Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        userNameLabel = new JLabel("Username: ");
        setUserNameField(new JTextField(16));

        passwordLabel = new JLabel("Password: ");
        setPasswordField(new JPasswordField(16));

        setLoginButton(new JButton("Login"));

        setRegisterButton(new JButton("Register"));

        loginPanel = new JPanel();

        loginPanel.add(userNameLabel);
        loginPanel.add(getUserNameField());
        loginPanel.add(passwordLabel);
        loginPanel.add(getPasswordField());
        loginPanel.add(getLoginButton());
        loginPanel.add(getRegisterButton());


        // Scrolling
        loginPanel.setAutoscrolls(true);
        JScrollPane scrollBar = new JScrollPane(loginPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollBar.setBounds(50, 30, 300, 50);
        getContentPane().add(scrollBar, BorderLayout.CENTER);
        setVisible(true);

    }

    /**
     * These action listener methods will allow their respective buttons to perform
     * their functions when clicked.
     * 
     * The first one will log the user/actor in once the account has been found
     * based off of the entered credentials from the user.
     * 
     * The second one will display the account creation window/interface and the
     * user will have to go through the process of creating an account with
     * AlphaCare.
     * 
     * @param al
     * @return 
     */


    public JButton getRegisterButton() {
        return registerButton;
    }

    public void setRegisterButton(JButton registerButton) {
        this.registerButton = registerButton;
    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(JButton loginButton) {
        this.loginButton = loginButton;
    }

    public JTextField getUserNameField() {
        return userNameField;
    }

    public void setUserNameField(JTextField userNameField) {
        this.userNameField = userNameField;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(JPasswordField passwordField) {
        this.passwordField = passwordField;
    }

}
