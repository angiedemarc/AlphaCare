package alphacare;

import Controller.LoginPageViewController;
import Model.*;
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

        AccountList gr = new AccountList();
        
        LoginPageViewController loginPage = new LoginPageViewController(gr); // We have not yet added authentication functionality to the application yet!

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
