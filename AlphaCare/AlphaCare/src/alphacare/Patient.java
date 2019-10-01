package alphacare;

/**
 *
 * @author cole
 */
public class Patient extends GeneralUser {

    /**
     *
     * class attributes
     */
    public int age;
    public int patientID;

    /**
     *
     * Full constructor (takes all attributes)
     *
     * @param firstName
     * @param lastName
     * @param account
     * @param age
     * @param patientID
     */
    public Patient(String firstName, String lastName, Account account, int age, int patientID) {
        super(firstName, lastName, account);
        this.age = age;
        this.patientID = patientID;
    }

    /**
     *
     * getter for age
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * setter for age
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     *
     * getter for patientID
     *
     * @return patientID
     */
    public int getPatientID() {
        return patientID;
    }

    /**
     *
     * setter for patientID
     *
     * @param patientID
     */
    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

}
