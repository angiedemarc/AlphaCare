/**
 * This is the account creation window/interface.
 *
 * The user will be prompted to enter several
 * pieces of information in order to make an account.
 *
 */
package View;

import Model.Account;
import Model.AccountList;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class CreateAccountView extends JFrame {


    private JPanel createPanel;
    private JLabel userLabel;
    private JLabel passLabel;
    private JLabel confirmPassLabel;
    private JLabel passDescLabel;
    private JProgressBar passStrength;
    private JLabel firstNameLabel;
    private JLabel lastNameLabel;
    private JLabel roleLabel;
    private JTextField userField;
    private JPasswordField passField;
    private JPasswordField confirmPassField;
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JComboBox roleSelection;
    private JButton submitButton;

    /**
     * This constructor will instantiate the account creation interface.
     */
    public CreateAccountView() {
        createAccountUI();
    }

    private void createAccountUI() {
        setSize(1000, 600);
        setTitle("Account Creation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // setVisible(true);

        userLabel = new JLabel("Username: ");
        setUserField(new JTextField(16));

        passLabel = new JLabel("Password: ");
        setPassField(new JPasswordField(16));
        passDescLabel = new JLabel("<html><ul>" + "<li>Passwords must be at least 8 characters long</li>"
                + "<li>Passwords must contain at least 1 uppercase letter</li>"
                + "<li>Passwords must contain at least 1 number</li>"
                + "<li>Passwords must contain at least 1 special character (ex. !, ?, %, _)</li>" + "</ul></html>"); // Rudimentary
        // description
        // and
        // requirements
        // for
        // a
        // password
        passStrength = new JProgressBar(0, 20);

        confirmPassLabel = new JLabel("Confirm Password: ");
        setConfirmPassField(new JPasswordField(16));

        firstNameLabel = new JLabel("First name: ");
        setFirstNameField(new JTextField(16));

        lastNameLabel = new JLabel("Last name: ");
        setLastNameField(new JTextField(16));

        roleLabel = new JLabel("Select your Role: ");
        setRoleSelection(new JComboBox(new String[]{"Patient", "Medical Personnel", "Medical Administrator"}));

        setSubmitButton(new JButton("SUBMIT"));

        createPanel = new JPanel();

        createPanel.add(userLabel);
        createPanel.add(getUserField());
        createPanel.add(passLabel);
        createPanel.add(getPassField());
        createPanel.add(passDescLabel);
        createPanel.add(passStrength);
        createPanel.add(confirmPassLabel);
        createPanel.add(getConfirmPassField());
        createPanel.add(firstNameLabel);
        createPanel.add(getFirstNameField());
        createPanel.add(lastNameLabel);
        createPanel.add(getLastNameField());
        createPanel.add(roleLabel);
        createPanel.add(getRoleSelection());
        createPanel.add(getSubmitButton());

        getContentPane().add(createPanel);

        setVisible(true);

        /**
         * Rudimentary Password Strength Meter: for now, it just checks the
         * length of the password. Later on, we plan on implementing some sort
         * of point system based on the requirements we outlined above.
         */
        getPassField().getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {
                updateLabel(e);
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                updateLabel(e);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateLabel(e);
            }

            private void updateLabel(DocumentEvent e) {
                String password = getPassField().getText();
                if (password.length() < 1) {
                    passStrength.setValue(0);
                } else {
                    passStrength.setValue(password.length());
                }
            }
        });
    }

    /**
     * This action listener method will allow the submit button to send the
     * information to the database and create the account.
     *
     * @param al
     */
    public JButton getSubmitButton() {
        return submitButton;
    }

    public void setSubmitButton(JButton submitButton) {
        this.submitButton = submitButton;
    }
    public JTextField getUserField() {
        return userField;
    }

    public void setUserField(JTextField userField) {
        this.userField = userField;
    }

    public JPasswordField getPassField() {
        return passField;
    }

    public void setPassField(JPasswordField passField) {
        this.passField = passField;
    }

    public JPasswordField getConfirmPassField() {
        return confirmPassField;
    }

    public void setConfirmPassField(JPasswordField confirmPassField) {
        this.confirmPassField = confirmPassField;
    }

    public JTextField getFirstNameField() {
        return firstNameField;
    }

    public void setFirstNameField(JTextField firstNameField) {
        this.firstNameField = firstNameField;
    }

    public JTextField getLastNameField() {
        return lastNameField;
    }

    public void setLastNameField(JTextField lastNameField) {
        this.lastNameField = lastNameField;
    }

    public JComboBox getRoleSelection() {
        return roleSelection;
    }

    public void setRoleSelection(JComboBox roleSelection) {
        this.roleSelection = roleSelection;
    }
}
