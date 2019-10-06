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

    public RecordView(){
        this.name = new JTextField();
        this.address = new JTextField();
        this.medicalHistory = new JTextField();
        this.familyMedicalHistory = new JTextField();
        this.medicationHistory = new JTextField();
        this.treatmentHistory = new JTextField();
        displayRecordInfo();
    }

    /**
     * Returns the medicalRecord associated with the view
     */
    public Record getMedicalRecord(){
        return this.medicalRecord;
    }

    public void displayRecordInfo(){
        name.setText(medicalRecord.getPatientName());
        address.setText(medicalRecord.getAddress());
        medicalHistory.setText(medicalRecord.getMedicalHistory());
        familyMedicalHistory.setText(medicalRecord.getFamilyMedicalHistory());
        medicationHistory.setText(medicalRecord.getMedicationHistory());
        treatmentHistory.setText(medicalRecord.getTreatmentHistory());
    }
}
