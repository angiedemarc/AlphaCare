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
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreateAccountView extends JFrame {
    private JPanel createPanel;
    private JLabel userLabel;
    private JLabel passLabel;
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
        setSize(800, 600);
        setTitle("Account Creation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        userLabel = new JLabel("Username: ");
        userField = new JTextField();
        
        passLabel = new JLabel("Password: ");
        passField = new JTextField();
        
        firstNameLabel = new JLabel("First name: ");
        firstNameField = new JTextField();
        
        lastNameLabel = new JLabel("Last name: ");
        lastNameField = new JTextField();
        
        roleLabel = new JLabel("Select your Role: ");
        roleSelection = new JComboBox(new String[] { "Patient", "Medical Personnel", "Medical Administrator"});
        
        submitButton = new JButton("SUBMIT");
        
        createPanel = new JPanel();
        
        createPanel.add(userLabel);
        createPanel.add(userField);
        createPanel.add(passLabel);
        createPanel.add(passField);
        createPanel.add(firstNameLabel);
        createPanel.add(firstNameField);
        createPanel.add(lastNameLabel);
        createPanel.add(lastNameField);
        createPanel.add(roleLabel);
        createPanel.add(roleSelection);
        createPanel.add(submitButton);
        
        getContentPane().add(createPanel);
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
