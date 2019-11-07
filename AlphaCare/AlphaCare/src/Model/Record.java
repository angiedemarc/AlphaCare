package Model;

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

    /**
     *
     * Empty constructor (does not take parameters)
     */
    public Record() {
        this.patientId = -1;
        this.patientName = "N/A";
        this.ssn = 0;
        this.address = "N/A";
        this.state = "N/A";
        this.medicalHistory = "N/A";
        this.familyMedicalHistory = "N/A";
        this.medicationHistory = "N/A";
        this.treatmentHistory = "N/A";
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
