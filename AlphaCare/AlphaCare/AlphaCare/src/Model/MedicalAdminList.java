package Model;

import java.util.ArrayList;

/**
 *
 * @author cole
 */
public class MedicalAdminList {
    
    private ArrayList<MedicalAdmin> theListOfMedicalAdmins;
    Account account1 = new Account();
    Account account2 = new Account();
    Account account3 = new Account();

    public MedicalAdminList() {
        theListOfMedicalAdmins = getMedicalAdminList();
    }

    private ArrayList<MedicalAdmin> getMedicalAdminList() {
        ArrayList<MedicalAdmin> MedicalAdminList = new ArrayList<>();
        MedicalAdminList.add((new MedicalAdmin("Admin1", "Uno", account1, 2460)));
        MedicalAdminList.add((new MedicalAdmin("Admin2", "Dos", account2, 2080)));
        MedicalAdminList.add((new MedicalAdmin("Admin3", "Tres", account3, 2240)));
        return MedicalAdminList;
    
    }
    
    
    
    
}
