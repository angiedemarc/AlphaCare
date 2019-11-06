/**
 * This is the interface to the login menu.
 * 
 * This is where users/actors enter their
 * AlphaCare account credentials, allowing
 * them to log in.
 */
package View;

import Model.Account;
import Model.AccountList;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
        // setVisible(true);

        userNameLabel = new JLabel("Username: ");
        userNameField = new JTextField(16);

        passwordLabel = new JLabel("Password: ");
        passwordField = new JPasswordField(16);

        loginButton = new JButton("Login");

        registerButton = new JButton("Register");

        loginPanel = new JPanel();

        loginPanel.add(userNameLabel);
        loginPanel.add(userNameField);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);
        loginPanel.add(loginButton);
        loginPanel.add(registerButton);

        // this.setContentPane(loginPanel);
        // getContentPane().add(loginPanel);\
        // Scrolling
        loginPanel.setAutoscrolls(true);
        JScrollPane scrollBar = new JScrollPane(loginPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollBar.setBounds(50, 30, 300, 50);
        getContentPane().add(scrollBar, BorderLayout.CENTER);
        setVisible(true);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // System.out.println("Testing: Successful Login!");
                Account account = new Account(userNameField.getText(), passwordField.getText());
                AccountList accList = new AccountList(); //should make this global?
                if (accList.contains(account)) {
                    MainInterfaceView mainInterface = new MainInterfaceView();
                    setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(loginPanel, "Incorrect username/password - try again");
                }
            }
        });

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                //System.out.println("Testing: Going to Registration page!");

                CreateAccountView registerInterface = new CreateAccountView();
                //registerInterface.setVisible(true);

                setVisible(false);
            }
        });
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
     */
    public void addLoginListener(ActionListener al) {
        loginButton.addActionListener(al);
    }

    public void addRegisterListener(ActionListener al) {
        registerButton.addActionListener(al);
    }

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

}
