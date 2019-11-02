package Model;

/**
 *
 * @author cole
 */
public class GeneralUser {

    /**
     *
     * class attributes
     */
    public String firstName;
    public String lastName;
    public Account account;

    /**
     *
     * Full constructor (takes all attributes)
     *
     * @param firstName
     * @param lastName
     * @param account
     */
    public GeneralUser(String firstName, String lastName, Account account) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.account = account;
    }

    /**
     *
     * getter for firstName
     *
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * setter for firstName
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * getter for lastName
     *
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * setter for lastName
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * getter for account
     *
     * @return account
     */
    public Account getAccount() {
        return account;
    }

    /**
     *
     * setter for account
     *
     * @param account
     */
    public void setAccount(Account account) {
        this.account = account;
    }

}
