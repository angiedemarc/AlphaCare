package View;

import Model.Record;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
        this.name = new JLabel();
        this.address = new JLabel();
        this.medicalHistory = new JLabel();
        this.familyMedicalHistory = new JLabel();
        this.medicationHistory = new JLabel();
        this.treatmentHistory = new JLabel();
    }

    public void displayRecordInfo() {
            this.name = new JLabel(medicalRecord.getPatientName());
            this.address = new JLabel(medicalRecord.getAddress());
            this.medicalHistory = new JLabel(medicalRecord.getMedicalHistory());
            this.familyMedicalHistory = new JLabel(medicalRecord.getFamilyMedicalHistory());
            this.medicationHistory = new JLabel(medicalRecord.getMedicationHistory());
            this.treatmentHistory = new JLabel(medicalRecord.getTreatmentHistory());
    }
}
