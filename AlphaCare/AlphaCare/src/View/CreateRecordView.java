package View;

import Controller.ViewRecordViewController;
import Model.Record;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreateRecordView extends JFrame {

    private JTextField nameEntry;
    private JLabel namePrompt;
    private JTextField ssnEntry;
    private JLabel ssnPrompt;
    private JTextField addressEntry;
    private JLabel addressPrompt;
    private JTextField stateEntry;
    private JLabel statePrompt;
    private JTextField medicalHistoryEntry;
    private JLabel medicalHistoryPrompt;
    private JTextField familyMedicalHistoryEntry;
    private JLabel familyMedicalHistoryPrompt;
    private JTextField medicationHistoryEntry;
    private JLabel medicationHistoryPrompt;
    private JTextField treatmentHistoryEntry;
    private JLabel treatmentHistoryPrompt;
    private Record medicalRecord;
    private JButton createRecordButton;
    private boolean hasClicked;

    public CreateRecordView() {
        createRecordUI();
    }

    private void createRecordUI() {
        this.createRecordButton = new JButton("Create Record");
        this.createRecordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchView();
            }
        });

        JPanel content = new JPanel();
        content.setLayout(null);

        namePrompt = new JLabel("Name: ");
        nameEntry = new JTextField(20);
        ssnPrompt = new JLabel("Social Security Number: ");
        ssnEntry = new JTextField(9);
        addressPrompt = new JLabel("Address: ");
        addressEntry = new JTextField(30);
        statePrompt = new JLabel("State: ");
        stateEntry = new JTextField(30);
        medicalHistoryPrompt = new JLabel("Medical History: ");
        medicalHistoryEntry = new JTextField(60);
        familyMedicalHistoryPrompt = new JLabel("Family Medical History: ");
        familyMedicalHistoryEntry = new JTextField(60);
        medicationHistoryPrompt = new JLabel("Medication History: ");
        medicationHistoryEntry = new JTextField(50);
        treatmentHistoryPrompt = new JLabel("Treatment History: ");
        treatmentHistoryEntry = new JTextField(50);

        content.add(namePrompt);
        content.add(nameEntry);

        content.add(ssnPrompt);
        content.add(ssnEntry);

        content.add(addressPrompt);
        content.add(addressEntry);

        content.add(statePrompt);
        content.add(stateEntry);

        content.add(medicalHistoryPrompt);
        content.add(medicalHistoryEntry);

        content.add(familyMedicalHistoryPrompt);
        content.add(familyMedicalHistoryEntry);

        content.add(medicationHistoryPrompt);
        content.add(medicationHistoryEntry);

        content.add(treatmentHistoryPrompt);
        content.add(treatmentHistoryEntry);

        // setting positions and dimensions of everything
        createRecordButton.setBounds(5, 60, 200, 50);
        content.add(createRecordButton);

        this.setContentPane(content);
        this.setTitle("Record");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(800, 600);
        this.setVisible(true);
    }

    public Record getMedicalRecord() {
        if (hasClicked) {
            return medicalRecord;
        }
        return new Record();
    }

    private void switchView() {
        if (nameEntry.getText()!= ""
        && ssnEntry.getText != "" 
        && addressEntry.getText != ""
        && stateEntry.getText != ""
        && medicalHistoryEntry.getText != ""
        && familyMedicalHistoryEntry.getText != ""
        && medicationHistoryEntry.getText != ""
        && treatmentHistoryEntry.getText != ""){
        hasClicked = true;
        medicalRecord = new Record(nameEntry.getText(), Integer.parseInt(ssnEntry.getText()), addressEntry.getText(),
                stateEntry.getText(), medicalHistoryEntry.getText(), familyMedicalHistoryEntry.getText(),
                medicationHistoryEntry.getText(), treatmentHistoryEntry.getText());
        ViewRecordViewController viewRecordViewController = new ViewRecordViewController(medicalRecord);
        }
        else{
            alert("Must enter valid information to create record");
        }
    }
}
