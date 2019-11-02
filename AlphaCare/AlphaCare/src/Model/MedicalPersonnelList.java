package Model;

import java.util.ArrayList;

/**
 *
 * @author cole
 */
public class MedicalPersonnelList {

    public ArrayList<MedicalPersonnel> theListOfMedicalPersonnels;
    Account account1 = new Account();
    Account account2 = new Account();
    Account account3 = new Account();

    /**
     *
     * Empty constructor that automatically creates ArrayList of
     * medicalPersonnel
     */
    public MedicalPersonnelList() {
        theListOfMedicalPersonnels = getMedicalPersonnelList();
    }

    /**
     *
     * Method that populates ArrayList of medicalPersonnel
     */
    private ArrayList<MedicalPersonnel> getMedicalPersonnelList() {
        ArrayList<MedicalPersonnel> MedicalPersonnelList = new ArrayList<>();
        MedicalPersonnelList.add((new MedicalPersonnel("Admin1", "Uno", account1, 2460)));
        MedicalPersonnelList.add((new MedicalPersonnel("Admin2", "Dos", account2, 2080)));
        MedicalPersonnelList.add((new MedicalPersonnel("Admin3", "Tres", account3, 2240)));
        return MedicalPersonnelList;

    }

    /**
     *
     * getter for ArrayList of medicalPersonnel
     *
     * @return theListOfMedicalPersonnels
     */
    public ArrayList<MedicalPersonnel> getTheListOfMedicalPersonnels() {
        return theListOfMedicalPersonnels;
    }

    /**
     *
     * setter for ArrayList of medicalPersonnel
     *
     * @param theListOfMedicalPersonnels
     */
    public void setTheListOfMedicalPersonnels(ArrayList<MedicalPersonnel> theListOfMedicalPersonnels) {
        this.theListOfMedicalPersonnels = theListOfMedicalPersonnels;
    }

}
