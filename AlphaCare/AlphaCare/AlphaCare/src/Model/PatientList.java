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

    private ArrayList<Patient> theListOfPatients;
    Account account1 = new Account();
    Account account2 = new Account();
    Account account3 = new Account();

    public PatientList() {
        theListOfPatients = getPatientList();
    }

// Code that will display the contents of the patientList class
//    public ObservableList<Patient> getPatientData() {
//        ObservableList<Patient> theListOfUsers;
//        List<Patient> userPatient = (List<Patient>) theListOfPatients;
//        theListOfPatients = FXCollections.observableList(userPatient);
//        return theListOfPatients;
//    }
// Populates ArrayList with Patient information   
    private ArrayList<Patient> getPatientList() {
        ArrayList<Patient> patientList = new ArrayList<>();
        patientList.add((new Patient("John", "Doe", account1, 24, 1234)));
        patientList.add((new Patient("Jane", "Deere", account2, 20, 4321)));
        patientList.add((new Patient("Sam", "Spade", account3, 22, 5678)));
        return patientList;
    }

}
