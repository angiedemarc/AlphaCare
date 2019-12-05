package View;

import Controller.EditRecordViewController;
import Controller.MainInterfaceViewController;
import Model.Record;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ViewRecordView extends RecordView {

    private JButton editRecordButton;
    private JButton homeButton;
    /* 
    private int patientId;
    private String patientName;
    private int ssn;
    private String address;
    private String state;
    private String medicalHistory;
    private String familyMedicalHistory;
    private String medicationHistory;
    private String treatmentHistory;
    */
    private JLabel patientID;
    private JLabel patientName;
    private JLabel ssn;
    private JLabel state;
    private JLabel medicalHistory;
    private JLabel familyMedicalHistory;
    private JLabel medicationHistory;
    private JLabel treatmentHistory;
    private JTextField patientIDField;
    private JTextField patientNameField;
    private JTextField ssnField;
    private JTextField stateField;
    private JTextField medicalHistoryField;
    private JTextField familyMedicalHistoryField;
    private JTextField medicationHistoryField;
    private JTextField treatmentHistoryField;

    public ViewRecordView() {
        super();
        viewRecordUI();
    }

    public ViewRecordView(Record medicalRecord) {
        super(medicalRecord);
        viewRecordUI();
    }

    private void viewRecordUI() {
        /* 
        JLabels and JTextFields to display the attributes of the patient's appropriate medical record. 
        This will also include logic to not display  
         */
        
            this.patientID = new JLabel("Patient ID: ");
            this.patientIDField = new JTextField(16);
            this.patientIDField.setText(Integer.toString(medicalRecord.getPatientId()));
            this.patientIDField.setEditable(false);
            
            this.patientName = new JLabel("Patient Name: ");
            this.patientNameField = new JTextField(16);
            this.patientNameField.setText(medicalRecord.getPatientName());
            this.patientNameField.setEditable(false);
            
            this.ssn = new JLabel("SSN: ");
            this.ssnField = new JTextField(16);
            this.ssnField.setText(Integer.toString(medicalRecord.getSsn()));
            this.ssnField.setEditable(false);
            
            this.state = new JLabel("State: ");
            this.stateField = new JTextField(16);
            this.stateField.setText(medicalRecord.getState());
            this.stateField.setEditable(false);
            
            this.medicalHistory = new JLabel("Medical History: ");
            this.medicalHistoryField = new JTextField(16);
            this.medicalHistoryField.setText(medicalRecord.getMedicalHistory());
            this.medicalHistoryField.setEditable(false);
            
            this.familyMedicalHistory = new JLabel("Family Medical History: ");
            this.familyMedicalHistoryField = new JTextField(16);
            this.familyMedicalHistoryField.setText(medicalRecord.getFamilyMedicalHistory());
            this.familyMedicalHistoryField.setEditable(false);
            
            this.medicationHistory = new JLabel("Medication History: ");
            this.medicationHistoryField = new JTextField(16);
            this.medicationHistoryField.setText(medicalRecord.getMedicationHistory());
            this.medicationHistoryField.setEditable(false);
            
            this.treatmentHistory = new JLabel("Treatment History: ");
            this.treatmentHistoryField = new JTextField(16);
            this.treatmentHistoryField.setText(medicalRecord.getTreatmentHistory());
            this.treatmentHistoryField.setEditable(false);
        
        
        this.editRecordButton = new JButton("Edit Record");
        this.editRecordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchView();
            }
        });

        this.homeButton = new JButton("Home");
        this.homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainInterfaceViewController();
                setVisible(false);
            }
        });

        JPanel content = new JPanel();
        GridLayout g = new GridLayout(0,2);
        content.setLayout(g);
        
        content.add(patientID);
        content.add(patientIDField);
        content.add(patientName);
        content.add(patientNameField);
        content.add(ssn);
        content.add(ssnField);
        content.add(state);
        content.add(stateField);
        content.add(medicalHistory);
        content.add(medicalHistoryField);
        content.add(familyMedicalHistory);
        content.add(familyMedicalHistoryField);
        content.add(medicationHistory);
        content.add(medicationHistoryField);
        content.add(treatmentHistory);
        content.add(treatmentHistoryField);
        content.add(editRecordButton);
        content.add(homeButton);
        
        
        JScrollPane scrollPane = new JScrollPane(content);
        getContentPane().add(scrollPane);


        this.setContentPane(content);
        this.setTitle("Record");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(800, 600);
        this.setVisible(true);
    }

    protected void switchView() {
        EditRecordViewController editRecordViewController = new EditRecordViewController(medicalRecord);
        this.setVisible(false);
    }

    /**
     * Returns the medicalRecord associated with the view
     *
     * @return
     */
    @Override
    public Record getMedicalRecord() {
        return this.medicalRecord;
    }

    /**
     * Fills in medical info throughout the view Edits medicalRecordField to
     * reflect the medical record
     *
     * @param mr medical record to populate the view
     */
    public void enterMedicalInfo(Record mr) {
        this.medicalRecord = mr;
    }
}
