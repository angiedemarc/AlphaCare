package Model;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Genesis
 */
public class Record {

    /**
     *
     * Declaration of class attributes
     */
    private int patientId;
    private String patientName;
    private int ssn;
    private String address;
    private String state;
    private String medicalHistory;
    private String familyMedicalHistory;
    private String medicationHistory;
    private String treatmentHistory;
    private LocalDate dateEntered;
    private LocalTime timeEntered;

    /**
     *
     * Empty constructor (does not take parameters)
     */
    public Record() {
        this.patientId = 1;
        this.patientName = "Genesis";
        this.ssn = 987656421;
        this.address = "10 Disappointment Avenue";
        this.state = "PA";
        this.medicalHistory = "Flu";
        this.familyMedicalHistory = "Deaf";
        this.medicationHistory = "Painkillers";
        this.treatmentHistory = "Antibiotics";
        this.dateEntered = LocalDate.now();
        this.timeEntered = LocalTime.now();
    }

    /**
     *
     * Full constructor (takes all attributes)
     *
     * @param patientId
     * @param patientName
     * @param ssn
     * @param address
     * @param state
     * @param medicalHistory
     * @param familyMedicalHistory
     * @param medicationHistory
     * @param treatmentHistory
     */
    public Record(int patientId, String patientName, int ssn, String address, String state, String medicalHistory, String familyMedicalHistory,
            String medicationHistory, String treatmentHistory) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.ssn = ssn;
        this.address = address;
        this.state = state;
        this.medicalHistory = medicalHistory;
        this.familyMedicalHistory = familyMedicalHistory;
        this.medicationHistory = medicationHistory;
        this.treatmentHistory = treatmentHistory;
        this.dateEntered = LocalDate.now();
        this.timeEntered = LocalTime.now();
    }

    /**
     *
     * getter for patientId
     *
     * @return patientId
     */
    public int getPatientId() {
        return patientId;
    }

    /**
     *
     * setter for patientId
     *
     * @param patientId
     */
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    /**
     *
     * getter for patientName
     *
     * @return patientName
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     *
     * setter for patientName
     *
     * @param patientName
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    /**
     *
     * getter for patientName
     *
     * @return patientName
     */
    public int getSsn() {
        return ssn;
    }

    /**
     *
     * setter for patient's SSN
     *
     * @param ssn
     */
    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    /**
     *
     * getter for patient's address
     *
     * @return patientName
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * setter for address
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * getter for state
     *
     * @return state
     */
    public String getState() {
        return state;
    }

    /**
     *
     * setter for state
     *
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     *
     * getter for medicalHistoy
     *
     * @return medicalHistory
     */
    public String getMedicalHistory() {
        return medicalHistory;
    }

    /**
     *
     * setter for medicalHistory
     *
     * @param medicalHistory
     */
    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    /**
     *
     * getter for familyMedicalHistory
     *
     * @return familyMedicalHistory
     */
    public String getFamilyMedicalHistory() {
        return familyMedicalHistory;
    }

    /**
     *
     * setter for familyMedicalHistory
     *
     * @param familyMedicalHistory
     */
    public void setFamilyMedicalHistory(String familyMedicalHistory) {
        this.familyMedicalHistory = familyMedicalHistory;
    }

    /**
     *
     * getter for medicationHistory
     *
     * @return medicationHistory
     */
    public String getMedicationHistory() {
        return medicationHistory;
    }

    /**
     *
     * setter for medicationHistory
     *
     * @param medicationHistory
     */
    public void setMedicationHistory(String medicationHistory) {
        this.medicationHistory = medicationHistory;
    }

    /**
     *
     * getter for treatmentHistory
     *
     * @return treatmentHistory
     */
    public String getTreatmentHistory() {
        return treatmentHistory;
    }

    /**
     *
     * setter for treatmentHistory
     *
     * @param treatmentHistory
     */
    public void setTreatmentHistory(String treatmentHistory) {
        this.treatmentHistory = treatmentHistory;
    }

    /**
     *
     * getter for dateEntered
     *
     */
    public LocalDate getDateEntered() {
        return dateEntered;
    }

    /**
     *
     * setter for dateEntered
     *
     * @param dateEntered
     */
    public void setDateEntered(LocalDate dateEntered) {
        this.dateEntered = dateEntered;
    }

    /**
     *
     * getter for timeEntered
     *
     */
    public LocalTime getTimeEntered() {
        return timeEntered;
    }

    /**
     *
     * setter for timeEntered
     *
     * @param timeEntered
     */
    public void setTimeEntered(LocalTime timeEntered) {
        this.timeEntered = timeEntered;
    }
    
    /**
     *
     * toString() for class
     *
     * @return patientName, social security number, address, state,
     * medicalHistory, familyMedicalHistory, medicationHistory,
     * treatmentHistory, medicalDirective
     */
    @Override
    public String toString() {
        return "Patient name: " + this.patientName + ", Social scurity number: " + this.ssn + ", Address: " + this.address + ", State: " + this.state
                + ", Medical history: " + this.medicalHistory + ", Family medical history: " + this.familyMedicalHistory + ", Medical history: "
                + this.medicationHistory + ", Treatment history: " + this.treatmentHistory;
    }

}
