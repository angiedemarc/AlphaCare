package View;

import Model.Record;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class RecordView extends JFrame {

    protected JTextField name;
    protected JTextField address;
    protected JTextField medicalHistory;
    protected JTextField familyMedicalHistory;
    protected JTextField medicationHistory;
    protected JTextField treatmentHistory;
    protected Record medicalRecord;

    public RecordView() {
        displayRecordInfo();
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

    public void displayRecordInfo() {
        if (medicalRecord != null) {
            this.name = new JTextField(medicalRecord.getPatientName());
            this.address = new JTextField(medicalRecord.getAddress());
            this.medicalHistory = new JTextField(medicalRecord.getMedicalHistory());
            this.familyMedicalHistory = new JTextField(medicalRecord.getFamilyMedicalHistory());
            this.medicationHistory = new JTextField(medicalRecord.getMedicationHistory());
            this.treatmentHistory = new JTextField(medicalRecord.getTreatmentHistory());
        }
    }
}
