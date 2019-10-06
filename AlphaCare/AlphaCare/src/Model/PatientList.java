package Model;

import java.util.ArrayList;
//import java.util.List;
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;

/**
 *
 * @author cole
 */
public class PatientList {

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

}
