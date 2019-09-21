package cole.branch;

/**
 *
 * @author cole
 */
public class MedicalPersonnel extends GeneralUser {

    /**
     *
     * class attributes
     */
    public int employeeID;

    /**
     *
     * Full constructor (takes all attributes)
     *
     * @param firstName
     * @param lastName
     * @param account
     * @param employeeID
     */
    public MedicalPersonnel(String firstName, String lastName, Account account, int employeeID) {
        super(firstName, lastName, account);
        this.employeeID = employeeID;
    }

    /**
     *
     * getter for employeeID
     *
     * @return employeeID
     */
    public int getEmployeeID() {
        return employeeID;
    }

    /**
     *
     * setter for employeeID
     *
     * @param employeeID
     */
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

}
