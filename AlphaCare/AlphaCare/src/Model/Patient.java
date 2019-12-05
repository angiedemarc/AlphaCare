package Model;

import java.util.ArrayList;

/**
 *
 * @author cole
 */
public class Patient extends GeneralUser {

    /**
     *
     * class attributes
     */
    private int age;
    private int patientID;
    private Record patientRecord;
    private ArrayList<Prescription> patientPrescriptions;

    /**
     *
     * Constructor
     *
     * @param firstName
     * @param lastName
     * @param account
     * @param age
     * @param patientID
     */
    public Patient(String firstName, String lastName, Account account, int age, int patientID) {
        super(firstName, lastName, account);
        this.age = age;
        this.patientID = patientID;
        patientPrescriptions = new ArrayList<>();
    }
    
    /**
     *
     * Full constructor (takes all attributes)
     *
     * @param firstName
     * @param lastName
     * @param account
     * @param age
     * @param patientID
     * @param record
     */
    public Patient(String firstName, String lastName, Account account, int age, int patientID, Record record) {
        super(firstName, lastName, account);
        this.age = age;
        this.patientID = patientID;
        this.patientRecord = record;
    }

    /**
     *
     * getter for age
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * setter for age
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     *
     * getter for patientID
     *
     * @return patientID
     */
    public int getPatientID() {
        return patientID;
    }

    /**
     *
     * setter for patientID
     *
     * @param patientID
     */
    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }
    
    /**
     *
     * getter for patientRecord
     *
     * @return patientRecord
     */
    public Record getPatientRecord() {
        return patientRecord;
    }

    /**
     *
     * setter for patientRecord
     *
     * @param patientRecord
     */
    public void setPatientRecord(Record patientRecord) {
        this.patientRecord = patientRecord;
    }
    
    /**
     *
     * getter for prescriptions
     *
     * @return patientPrescriptions
     */
    public ArrayList<Prescription> getPrescriptions() {
        return patientPrescriptions;
    }

    /**
     *
     * setter for patientPrescriptions
     *
     * @param patientPrescriptions
     */
    public void setPatientPrescriptions(ArrayList<Prescription> patientPrescriptions) {
        this.patientPrescriptions = patientPrescriptions;
    }
    
    /**
     * adds prescription to the list for the patient
     * 
     * @param prescription
    */
    public void addPrescription(Prescription prescription){
        this.patientPrescriptions.add(prescription);
    }
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.patientID;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Patient other = (Patient) obj;
        if (this.patientID != other.patientID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Patient Info: " + "age: " + age + " patient ID: " + patientID + " patient Record: " + patientRecord + " patientPrescriptions: " + patientPrescriptions;
    }
    
}
