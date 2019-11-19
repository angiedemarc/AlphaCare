package Model;

import java.util.ArrayList;

/**
 *
 * @author cole
 */
public class MedicalAdminList {

    public ArrayList<MedicalAdmin> theListOfMedicalAdmins;
    Account account1 = new Account();
    Account account2 = new Account();
    Account account3 = new Account();

    /**
     *
     * Empty constructor that automatically creates ArrayList of medicalAdmin
     */
    public MedicalAdminList() {
        theListOfMedicalAdmins = createMedicalAdminList();
    }

    /**
     *
     * Method that populates ArrayList of medicalAdmin
     */
    private ArrayList<MedicalAdmin> createMedicalAdminList() {
        this.theListOfMedicalAdmins.add((new MedicalAdmin("Admin1", "Uno", account1, 2460)));
        this.theListOfMedicalAdmins.add((new MedicalAdmin("Admin2", "Dos", account2, 2080)));
        this.theListOfMedicalAdmins.add((new MedicalAdmin("Admin3", "Tres", account3, 2240)));
        return this.theListOfMedicalAdmins;

    }

    /**
     *
     * getter for ArrayList of medicalAdmin
     *
     * @return theListOfMedicalAdmins
     */
    public ArrayList<MedicalAdmin> getTheListOfMedicalAdmins() {
        return theListOfMedicalAdmins;
    }

    /**
     *
     * setter for ArrayList of medicalAdmin
     *
     * @param theListOfMedicalAdmins
     */
    public void setTheListOfMedicalAdmins(ArrayList<MedicalAdmin> theListOfMedicalAdmins) {
        this.theListOfMedicalAdmins = theListOfMedicalAdmins;
    }

}
