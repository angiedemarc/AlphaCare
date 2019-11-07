package View;

import Model.Record;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public abstract class EditableView extends RecordView {

    protected JTextField nameEntry;
    protected JTextField patientIdEntry;
    protected int ssnEntry;
    protected JTextField ssnEntry1;
    protected JTextField ssnEntry2;
    protected JTextField ssnEntry3;
    protected String addressEntry;
    protected JTextField addressEntry1;
    protected JTextField addressEntry2;
    protected JTextField stateEntry;
    protected JTextField medicalHistoryEntry;
    protected JTextField familyMedicalHistoryEntry;
    protected JTextField medicationHistoryEntry;
    protected JTextField treatmentHistoryEntry;

    public EditableView() {
    }

    public EditableView(Record medicalRecord) {
        super(medicalRecord);
    }

    public JPanel promptRecordInfo() {

        JPanel content = new JPanel();
        content.setLayout(null);

        patientId = new JLabel("Patient Id: ");
        if (medicalRecord.getPatientId() != -1) {
            patientIdEntry = new JTextField(medicalRecord.getPatientId());
        } else {
            patientIdEntry = new JTextField(10);
        }

        name = new JLabel("Name: ");
        if (medicalRecord.getPatientName() != null) {
            nameEntry = new JTextField(medicalRecord.getPatientName());
        } else {
            nameEntry = new JTextField(20);
        }

        ssn = new JLabel("Social Security Number: ");
        ssnEntry1 = new JTextField(3);
        ssnEntry2 = new JTextField(2);
        ssnEntry3 = new JTextField(4);

        address = new JLabel("Address: ");
        if (medicalRecord.getAddress() != null) {
            addressEntry1 = new JTextField(medicalRecord.getAddress());
        } else {
            addressEntry1 = new JTextField(30);
        }
        addressEntry2 = new JTextField(20);

        state = new JLabel("State: ");
        if (medicalRecord.getState() != null) {
            stateEntry = new JTextField(medicalRecord.getState());
        } else {
            stateEntry = new JTextField(30);
        }

        medicalHistory = new JLabel("Medical History: ");
        if (medicalRecord.getMedicalHistory() != null) {
            medicalHistoryEntry = new JTextField(medicalRecord.getMedicalHistory());
        } else {
            medicalHistoryEntry = new JTextField(60);
        }

        familyMedicalHistory = new JLabel("Family Medical History: ");
        if (medicalRecord.getFamilyMedicalHistory() != null) {
            familyMedicalHistoryEntry = new JTextField(medicalRecord.getFamilyMedicalHistory());
        } else {
            familyMedicalHistoryEntry = new JTextField(60);
        }

        medicationHistory = new JLabel("Medication History: ");
        if (medicalRecord.getMedicationHistory() != null) {
            medicationHistoryEntry = new JTextField(medicalRecord.getMedicationHistory());
        } else {
            medicationHistoryEntry = new JTextField(60);
        }

        treatmentHistory = new JLabel("Treatment History: ");
        if (medicalRecord.getTreatmentHistory() != null) {
            treatmentHistoryEntry = new JTextField(medicalRecord.getTreatmentHistory());
        } else {
            treatmentHistoryEntry = new JTextField(60);
        }

        content.add(patientId);
        content.add(patientIdEntry);

        content.add(name);
        content.add(nameEntry);

        content.add(ssn);
        content.add(ssnEntry1);
        content.add(new JLabel("-"));
        content.add(ssnEntry2);
        content.add(new JLabel("-"));
        content.add(ssnEntry3);

        content.add(address);
        content.add(addressEntry1);
        content.add(addressEntry2);

        content.add(state);
        content.add(stateEntry);

        content.add(medicalHistory);
        content.add(medicalHistoryEntry);

        content.add(familyMedicalHistory);
        content.add(familyMedicalHistoryEntry);

        content.add(medicationHistory);
        content.add(medicationHistoryEntry);

        content.add(treatmentHistory);
        content.add(treatmentHistoryEntry);
        return content;
    }

    public boolean saveInfo() {

        String temp = ssnEntry1.getText() + ssnEntry2.getText() + ssnEntry3.getText();
        ssnEntry = Integer.parseInt(temp);
        addressEntry = addressEntry1.getText() + addressEntry2.getText();

        if (nameEntry.getText() != "" && nameEntry.getText() != "" && temp != "" && addressEntry != ""
                && stateEntry.getText() != "" && medicalHistoryEntry.getText() != ""
                && familyMedicalHistoryEntry.getText() != "" && medicationHistoryEntry.getText() != ""
                && treatmentHistoryEntry.getText() != "") {
            medicalRecord = new Record(Integer.parseInt(patientIdEntry.getText()), nameEntry.getText(), ssnEntry, addressEntry, stateEntry.getText(),
                    medicalHistoryEntry.getText(), familyMedicalHistoryEntry.getText(),
                    medicationHistoryEntry.getText(), treatmentHistoryEntry.getText());
            return true;
        }
        return false;
    }
}
