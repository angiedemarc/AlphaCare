/**
 * This is the appointment scheduling interface.
 *
 * This is where users/actors can input the necessary
 * information in order to submit and create an appointment.
 */
package View;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AppointmentView extends JFrame {

    private JPanel appointmentPanel;
    private JLabel fullNameLabel;
    private JLabel birthDateLabel;
    private JLabel ssnLabel;
    private JLabel phoneNumLabel;
    private JLabel emailLabel;
    private JLabel dateLabel;
    private JLabel symptomsLabel;
    private JTextField fullNameField;
    private JTextField birthDateField;
    private JTextField ssnField;
    private JTextField phoneNumField;
    private JTextField emailField;
    private JTextField dateField;
    private JTextArea symptomsArea;
    private JButton homeButton;
    private JButton submitButton;
    private JButton cancelButton;

    /**
     * This constructor will instantiate the appointment scheduling interface.
     */
    public AppointmentView() {
        appointmentUI();
    }
    
    private void appointmentUI() {
        setSize(800, 600);
        setVisible(true);
        setTitle("Appointment Scheduling");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        fullNameLabel = new JLabel("Full Name: ");
        fullNameField = new JTextField(16);
        
        birthDateLabel = new JLabel("Birth Date: ");
        birthDateField = new JTextField(16);
        
        ssnLabel = new JLabel("SSN: ");
        ssnField = new JTextField(16);
        
        phoneNumLabel = new JLabel("Phone Number: ");
        phoneNumField = new JTextField(16);
        
        emailLabel = new JLabel("Email Address: ");
        emailField = new JTextField(16);
        
        dateLabel = new JLabel("Appointment Date: ");
        dateField = new JTextField(16);
        
        symptomsLabel = new JLabel("Please type in any symptoms you are experiencing: ");
        symptomsArea = new JTextArea(10, 10);
        
        homeButton = new JButton("Home");
        
        submitButton = new JButton("Submit");
        
        cancelButton = new JButton("Cancel");
        
        appointmentPanel = new JPanel();
        GridLayout g = new GridLayout(0,2);
        appointmentPanel.setLayout(g);
        
        appointmentPanel.add(fullNameLabel);
        appointmentPanel.add(fullNameField);
        appointmentPanel.add(birthDateLabel);
        appointmentPanel.add(birthDateField);
        appointmentPanel.add(ssnLabel);
        appointmentPanel.add(ssnField);
        appointmentPanel.add(phoneNumLabel);
        appointmentPanel.add(phoneNumField);
        appointmentPanel.add(emailLabel);
        appointmentPanel.add(emailField);
        appointmentPanel.add(dateLabel);
        appointmentPanel.add(dateField);
        appointmentPanel.add(symptomsLabel);
        appointmentPanel.add(symptomsArea);
        
        JPanel buttons = new JPanel();
        buttons.setLayout(new FlowLayout());
        buttons.add(homeButton);
        buttons.add(submitButton);
        buttons.add(cancelButton);
        
       appointmentPanel.add(buttons);
        // Fucked the layout up just to show them that continuous scrolling does work! :(
        JScrollPane scrollPane = new JScrollPane(appointmentPanel);
        // getContentPane().add(appointmentPanel);
        getContentPane().add(scrollPane);
        
        setVisible(true);
    }

    public JTextField getFullNameField() {
        return fullNameField;
    }

    public JTextField getBirthDateField() {
        return birthDateField;
    }

    public JTextField getSsnField() {
        return ssnField;
    }

    public JTextField getPhoneNumField() {
        return phoneNumField;
    }

    public JTextField getEmailField() {
        return emailField;
    }

    public JTextField getDateField() {
        return dateField;
    }

    public JTextArea getSymptomsArea() {
        return symptomsArea;
    }
    
    
    
    public JButton getHomeButton() {
        return this.homeButton;
    }
    
    public JButton getSubmitButton() {
        return this.submitButton;
    }
    
    public void setSubmitButton(JButton submitButton) {
        this.submitButton = submitButton;
    }
    
    public JButton getCancelButton(){
        return this.cancelButton;
    }

 }
