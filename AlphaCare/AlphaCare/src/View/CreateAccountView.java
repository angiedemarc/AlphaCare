/**
 * This is the account creation window/interface.
 * 
 * The user will be prompted to enter several
 * pieces of information in order to make an account.
 * 
 */
package View;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class CreateAccountView extends JFrame {
    private JPanel createPanel;
    private JLabel userLabel;
    private JLabel passLabel;
    private JLabel passDescLabel;
    private JProgressBar passStrength;
    private JLabel firstNameLabel;
    private JLabel lastNameLabel;
    private JLabel roleLabel;
    private JTextField userField;
    private JTextField passField;
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JComboBox roleSelection;
    private JButton submitButton;
    
    
    /**
     * This constructor will instantiate
     * the account creation interface.
     */
    public CreateAccountView(){
        createAccountUI();
    }
    
    private void createAccountUI(){
        setSize(1000, 600);
        setTitle("Account Creation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setVisible(true);
        
        userLabel = new JLabel("Username: ");
        userField = new JTextField(16);
        
        passLabel = new JLabel("Password: ");
        passField = new JTextField(16);
        passDescLabel = new JLabel("<html><ul>" +
                "<li>Passwords must be at least 8 characters long</li>" +
                "<li>Passwords must contain at least 1 uppercase letter</li>" +
                "<li>Passwords must contain at least 1 number</li>" +
                "<li>Passwords must contain at least 1 special character (ex. !, ?, %, _)</li>" +
                "</ul></html>"); //Rudimentary description and requirements for a password
        passStrength = new JProgressBar(0,20);
        
        firstNameLabel = new JLabel("First name: ");
        firstNameField = new JTextField(16);
        
        lastNameLabel = new JLabel("Last name: ");
        lastNameField = new JTextField(16);
        
        roleLabel = new JLabel("Select your Role: ");
        roleSelection = new JComboBox(new String[] { "Patient", "Medical Personnel", "Medical Administrator"});
        
        submitButton = new JButton("SUBMIT");
        
        createPanel = new JPanel();
        
        createPanel.add(userLabel);
        createPanel.add(userField);
        createPanel.add(passLabel);
        createPanel.add(passField);
        createPanel.add(passDescLabel);
        createPanel.add(passStrength);
        createPanel.add(firstNameLabel);
        createPanel.add(firstNameField);
        createPanel.add(lastNameLabel);
        createPanel.add(lastNameField);
        createPanel.add(roleLabel);
        createPanel.add(roleSelection);
        createPanel.add(submitButton);
        
        getContentPane().add(createPanel);
        
        setVisible(true);
        
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent eve){
                System.out.println("Testing: Submission sent!");
                
                LoginPageView loginPage = new LoginPageView();
                
                setVisible(false);
                loginPage.setVisible(true);
            }
        });
                
        /**
         * Rudimentary Password Strength Meter:
         * for now, it just checks the length of the password.
         * Later on, we plan on implementing some sort of
         * point system based on the requirements we outlined above.
         */
        passField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e){
                updateLabel(e);
            }
            
            @Override
            public void insertUpdate(DocumentEvent e){
                updateLabel(e);
            }
            
            @Override
            public void removeUpdate(DocumentEvent e){
                updateLabel(e);
            }
            
            private void updateLabel(DocumentEvent e){
                String password =  passField.getText();
                if(password.length() < 1){
                    passStrength.setValue(0);
                }
                else{
                    passStrength.setValue(password.length());
                }
            }
        }); 
    }
    
    /**
     * This action listener method will allow
     * the submit button to send the information
     * to the database and create the account.
     * @param al 
     */
    
    public void addSubmitListener(ActionListener al) {
        submitButton.addActionListener(al);
    }
}
