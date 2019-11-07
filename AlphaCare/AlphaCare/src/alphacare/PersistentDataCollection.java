/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;

import Model.AccountList;
import Model.MedicalAdminList;
import Model.MedicalPersonnelList;
import Model.PatientList;
import Model.SingletonRecordList;
import java.io.Serializable;

/**
 *
 * @author cole
 */
public class PersistentDataCollection implements Serializable {

    private AccountList theAccountList;
    private SingletonRecordList theRecordList;
    private PatientList thePatientList;
    private MedicalAdminList theMedicalAdminList;
    private MedicalPersonnelList theMedicalPersonnelList;

    public PersistentDataCollection() {
        if (theAccountList == null) {
            theAccountList = new AccountList();
        }
        if (thePatientList == null) {
            thePatientList = new PatientList();
        }
        if (theMedicalAdminList == null) {
            theMedicalAdminList = new MedicalAdminList();
        }
        if (theMedicalPersonnelList == null) {
            theMedicalPersonnelList = new MedicalPersonnelList();
        }
        if(theRecordList == null){
            theRecordList = new SingletonRecordList();
        }

    }

    public AccountList getAccountList() {
        return theAccountList;
    }

    public PatientList getPatientList() {
        return thePatientList;
    }

    public MedicalAdminList getMedicalAdminList() {
        return theMedicalAdminList;
    }

    public MedicalPersonnelList getMedicalPersonnelList() {
        return theMedicalPersonnelList;
    }

    public SingletonRecordList getRecordList() {
        return theRecordList;
    }    

}
