/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;

import Controller.LoginPageViewController;
import Model.*;
import Model.SingletonRecordList;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author cole
 */
public class AlphaCare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Shows the functionality of the 'createRecord' which in turn can view a record
        // CreateRecordViewController createRecord = new CreateRecordViewController();
        // This tests to see the application work flow from the Login. It should display all of our view classes from just initially the login process. 
        AccountList gr = new AccountList();
        LoginPageViewController loginPage = new LoginPageViewController(gr); // We have not yet added authentication functionality to the application yet!

        // Here, we will test to see the attributes in our model class. 
//        
//        for(Record r: SingletonRecordList.getInstance().getRecordList()){
//            System.out.println("From the singleton class: " + r.getPatientName());
//        }
    }

    //checks if records are outdated and updates the list to no longer include them
    public void recordCleanUp() {
        SingletonRecordList recordList = new SingletonRecordList();
        PatientList patientList = new PatientList();
        ArrayList<Record> newRecords = recordList.getRecordList();
        try {
            for (Record r : recordList.getRecordList()) {
                if (r.getDateEntered().isBefore(LocalDate.now().minusDays(1095)) && patientList.getPatient(r.getPatientId()).getAge() >= 21) {
                    newRecords.remove(r);
                }
            }
        } catch (Exception e) {
        }
        recordList.setRecordList(newRecords);
    }

}
