package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.NoSuchElementException;
//import java.util.List;
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;

/**
 *
 * @author cole
 */
public class PatientList implements Serializable {

    public ArrayList<Patient> theListOfPatients;
    Account account1 = new Account();
    Account account2 = new Account();
    Account account3 = new Account();

    /**
     *
     * Empty constructor that automatically creates ArrayList of patients
     */
    public PatientList() {
        theListOfPatients = getPatientList();
    }

    /**
     *
     * Method that populates ArrayList of records
     */
    private ArrayList<Patient> getPatientList() {
        ArrayList<Patient> patientList = new ArrayList<>();
        patientList.add((new Patient("John", "Doe", account1, 24, 1234)));
        patientList.add((new Patient("Jane", "Deere", account2, 20, 4321)));
        patientList.add((new Patient("Sam", "Spade", account3, 22, 5678)));
        return patientList;
    }

    /**
     *
     * getter for ArrayList of patients
     *
     * @return theListOfPatients
     */
    public ArrayList<Patient> getTheListOfPatients() {
        return theListOfPatients;
    }

    /**
     *
     * setter for ArrayList of patients
     *
     * @param theListOfPatients
     */
    public void setTheListOfPatients(ArrayList<Patient> theListOfPatients) {
        this.theListOfPatients = theListOfPatients;
    }

    public boolean contains(Patient patient) {
        for (Patient patientTemp : theListOfPatients) {
            if (patient.equals(patientTemp)) {
                return true;
            }
        }
        return false;
    }

    public boolean editRecord(Record record) {

        for (Patient patient : theListOfPatients) {
            if (patient.getPatientID() == record.getPatientId()) {
                patient.setPatientRecord(record);
                return true;
            }
        }
        return false;
    }

    public Patient getPatient(int patientId) {
        for (Patient p : this.getPatientList()) {
            if (p.getPatientID() == patientId) {
                return p;
            }
        }
        throw new NoSuchElementException();
    }

}
