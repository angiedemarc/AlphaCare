/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author angie
 */

public class PrescriptionView extends JFrame {

    //labels
    private JPanel createPanel;
    private JLabel patientIdLabel;
    private JLabel fNameLabel;
    private JLabel lNameLabel;
    private JLabel hospitalNameLabel;
    private JLabel amountTakenInADayLabel;
    private JLabel daysTakenInAWeekLabel;
    private JLabel quantityTakenLabel;
    private JLabel overdoseWarningsLabel;
    
    //input types
    private JTextField patientIdField;
    private JTextField fNameField;
    private JTextField lNameField;
    private JTextField addressField;
    private JTextField hospitalNameField;
    private JTextField amountTakenInADayField;
    private JComboBox daysTakenInAWeekSelection;
    private JTextField quantityTakenField;
    private JTextArea overdoseWarningsArea;
    
    //buttons
    private JButton submitButton;
    private JButton cancelButton;

    public PrescriptionView() {
        createAccountUI();
    }

    private void createAccountUI() {
        setSize(1000, 600);
        setTitle("Account Creation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setPatientIdLabel(new JLabel("Patient Id: "));
        setPatientIdField((new JTextField(16)));
        
        setfNameLabel(new JLabel("First name (of doctor prescribing): "));
        setfNameField((new JTextField(16)));
        
        setlNameLabel(new JLabel("Last name (of doctor): "));
        setlNameField((new JTextField(16)));
        
        setHospitalNameLabel(new JLabel("Hospital name: "));
        setHospitalNameField((new JTextField(16)));
        
        setAmountTakenInADayLabel(new JLabel("amount of times prescription taken in a day: "));
        setAmountTakenInADayField((new JTextField(16)));
        
        setDaysTakenInAWeekLabel(new JLabel("select the amount of days prescription is taken in a week: "));
        Integer [] days = {1, 2, 3, 4, 5, 6, 7};
        setDaysTakenInAWeekSelection((new JComboBox(days)));
        
        setQuantityTakenLabel(new JLabel("quantity taken each time: "));
        setQuantityTakenField((new JTextField(16)));
        
        setOverdoseWarningsLabel(new JLabel("Warnings (overdose and others): "));
        setOverdoseWarningsArea((new JTextArea(10, 20)));

        
        setSubmitButton(new JButton("SUBMIT"));
        setCancelButton(new JButton("Cancel/Home"));

        createPanel = new JPanel();

        createPanel.add(patientIdLabel);
        createPanel.add(patientIdField);

        createPanel.add(fNameLabel);
        createPanel.add(fNameField);

        createPanel.add(lNameLabel);
        createPanel.add(lNameField);

        createPanel.add(hospitalNameLabel);
        createPanel.add(hospitalNameField);

        createPanel.add(amountTakenInADayLabel);
        createPanel.add(amountTakenInADayField);

        createPanel.add(daysTakenInAWeekLabel);
        createPanel.add(daysTakenInAWeekSelection);

        createPanel.add(quantityTakenLabel);
        createPanel.add(quantityTakenField);

        createPanel.add(overdoseWarningsLabel);
        createPanel.add(overdoseWarningsArea);

        createPanel.add(getSubmitButton());
        createPanel.add(cancelButton);

        getContentPane().add(createPanel);
    }

    //Getters and Setters
    public JPanel getCreatePanel() {
        return createPanel;
    }

    public void setCreatePanel(JPanel createPanel) {
        this.createPanel = createPanel;
    }

    public JLabel getPatientIdLabel() {
        return patientIdLabel;
    }

    public void setPatientIdLabel(JLabel patientIdLabel) {
        this.patientIdLabel = patientIdLabel;
    }

    public JLabel getfNameLabel() {
        return fNameLabel;
    }

    public void setfNameLabel(JLabel fNameLabel) {
        this.fNameLabel = fNameLabel;
    }

    public JLabel getlNameLabel() {
        return lNameLabel;
    }

    public void setlNameLabel(JLabel lNameLabel) {
        this.lNameLabel = lNameLabel;
    }

    public JLabel getHospitalNameLabel() {
        return hospitalNameLabel;
    }

    public void setHospitalNameLabel(JLabel hospitalNameLabel) {
        this.hospitalNameLabel = hospitalNameLabel;
    }

    public JLabel getAmountTakenInADayLabel() {
        return amountTakenInADayLabel;
    }

    public void setAmountTakenInADayLabel(JLabel amountTakenInADayLabel) {
        this.amountTakenInADayLabel = amountTakenInADayLabel;
    }

    public JLabel getDaysTakenInAWeekLabel() {
        return daysTakenInAWeekLabel;
    }

    public void setDaysTakenInAWeekLabel(JLabel daysTakenInAWeekLabel) {
        this.daysTakenInAWeekLabel = daysTakenInAWeekLabel;
    }

    public JLabel getQuantityTakenLabel() {
        return quantityTakenLabel;
    }

    public void setQuantityTakenLabel(JLabel quantityTakenLabel) {
        this.quantityTakenLabel = quantityTakenLabel;
    }

    public JLabel getOverdoseWarningsLabel() {
        return overdoseWarningsLabel;
    }

    public void setOverdoseWarningsLabel(JLabel overdoseWarningsLabel) {
        this.overdoseWarningsLabel = overdoseWarningsLabel;
    }

    public JTextField getPatientIdField() {
        return patientIdField;
    }

    public void setPatientIdField(JTextField patientIdField) {
        this.patientIdField = patientIdField;
    }

    public JTextField getfNameField() {
        return fNameField;
    }

    public void setfNameField(JTextField fNameField) {
        this.fNameField = fNameField;
    }

    public JTextField getlNameField() {
        return lNameField;
    }

    public void setlNameField(JTextField lNameField) {
        this.lNameField = lNameField;
    }

    public JTextField getAddressField() {
        return addressField;
    }

    public void setAddressField(JTextField addressField) {
        this.addressField = addressField;
    }

    public JTextField getHospitalNameField() {
        return hospitalNameField;
    }

    public void setHospitalNameField(JTextField hospitalNameField) {
        this.hospitalNameField = hospitalNameField;
    }

    public JTextField getAmountTakenInADayField() {
        return amountTakenInADayField;
    }

    public void setAmountTakenInADayField(JTextField amountTakenInADayField) {
        this.amountTakenInADayField = amountTakenInADayField;
    }

    public JComboBox getDaysTakenInAWeekSelection() {
        return daysTakenInAWeekSelection;
    }

    public void setDaysTakenInAWeekSelection(JComboBox daysTakenInAWeekSelection) {
        this.daysTakenInAWeekSelection = daysTakenInAWeekSelection;
    }

    public JTextField getQuantityTakenField() {
        return quantityTakenField;
    }

    public void setQuantityTakenField(JTextField quantityTakenField) {
        this.quantityTakenField = quantityTakenField;
    }

    public JTextArea getOverdoseWarningsArea() {
        return overdoseWarningsArea;
    }

    public void setOverdoseWarningsArea(JTextArea overdoseWarningsArea) {
        this.overdoseWarningsArea = overdoseWarningsArea;
    }

    public JButton getSubmitButton() {
        return submitButton;
    }

    public void setSubmitButton(JButton submitButton) {
        this.submitButton = submitButton;
    }

    public JButton getCancelButton() {
        return cancelButton;
    }

    public void setCancelButton(JButton cancelButton) {
        this.cancelButton = cancelButton;
    }

}
