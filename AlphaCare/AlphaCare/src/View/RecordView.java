package View;

import Model.Record;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public abstract class RecordView extends JFrame {

    protected JLabel patientId;
    protected JLabel name;
    protected JLabel ssn;
    protected JLabel address;
    protected JLabel state;
    protected JLabel medicalHistory;
    protected JLabel familyMedicalHistory;
    protected JLabel medicationHistory;
    protected JLabel treatmentHistory;
    protected Record medicalRecord;

    public RecordView() {
        this.medicalRecord = new Record();
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
        this.patientId = new JLabel(Integer.toString(medicalRecord.getPatientId()));
        this.name = new JLabel(medicalRecord.getPatientName());
        this.address = new JLabel(medicalRecord.getAddress());
        this.state = new JLabel(medicalRecord.getState());
        this.medicalHistory = new JLabel(medicalRecord.getMedicalHistory());
        this.familyMedicalHistory = new JLabel(medicalRecord.getFamilyMedicalHistory());
        this.medicationHistory = new JLabel(medicalRecord.getMedicationHistory());
        this.treatmentHistory = new JLabel(medicalRecord.getTreatmentHistory());
    }

    abstract protected void switchView();
}
