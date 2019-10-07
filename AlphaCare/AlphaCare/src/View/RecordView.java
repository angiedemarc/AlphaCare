package View;

import Model.Record;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class RecordView extends JFrame {

    protected JLabel name;
    protected JLabel address;
    protected JLabel medicalHistory;
    protected JLabel familyMedicalHistory;
    protected JLabel medicationHistory;
    protected JLabel treatmentHistory;
    protected Record medicalRecord;

    public RecordView() {
        promptRecordInfo();
    }

    public RecordView(Record medicalRecord) {
        this.medicalRecord = medicalRecord;
        displayRecordInfo();
    }

    /**
     * Returns the medicalRecord associated with the view
     *
     * @return
     */
    public Record getMedicalRecord() {
        return this.medicalRecord;
    }

    public void promptRecordInfo() {
        this.name = new JTextField();
        this.address = new JTextField();
        this.medicalHistory = new JTextField();
        this.familyMedicalHistory = new JTextField();
        this.medicationHistory = new JTextField();
        this.treatmentHistory = new JTextField();
    }

    public void displayRecordInfo() {
            this.name = new JTextField(medicalRecord.getPatientName());
            this.address = new JTextField(medicalRecord.getAddress());
            this.medicalHistory = new JTextField(medicalRecord.getMedicalHistory());
            this.familyMedicalHistory = new JTextField(medicalRecord.getFamilyMedicalHistory());
            this.medicationHistory = new JTextField(medicalRecord.getMedicationHistory());
            this.treatmentHistory = new JTextField(medicalRecord.getTreatmentHistory());
    }
}
