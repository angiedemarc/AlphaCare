import java.util.ArrayList;

/**
 *
 * @author Genesis
 */
public class Account {
/**
 *
 * Declaration of class attributes
 */
    private String userName;
    private String password;
    private String role;
    private ArrayList<String> permissions;

/**
 *
 * Empty constructor (does not take parameters)
 */
    public Account() {
        this.userName = "N/A";
        this.password = "N/A";
        this.role = "N/A";
        this.permissions = new ArrayList<>();
        
    }

/**
 *
 * Full constructor (takes all attributes)
 * @param userName
 * @param password
 * @param role
 * @param permissions
 */
    public Account(String userName, String password, String role, ArrayList<String> permissions) {
        this.userName = userName;
        this.password = password;
        this.role = role;
        this.permissions = permissions;
    }

 /**
 *
 * getter for userName
 * @return userName
 */
    public String getUserName() {
        return userName;
    }
    
 /**
 *
 * setter for userName
 * @param userName
 */
    public void setUserName(String userName) {
        this.userName = userName;
    }
   
/**
 *
 * getter for password
 * @return password
 */
    public String getPassword() {
        return password;
    }

/**
 *
 * setter for password
 * @param password
 */
    public void setPassword(String password) {
        this.password = password;
    }

/**
 *
 * getter for role
 * @return role
 */
    public String getRole() {
        return role;
    }
    
/**
 *
 * setter for role
 * @param role
 */
    public void setRole(String role) {
        this.role = role;
    }

/**
 *
 * getter for ArrayList of permissions (read, write, view)
 * @return permissions
 */
    public ArrayList<String> getPermissions() {
        return permissions;
    }

/**
 *
 * setter for ArrayList of permissions
 * @param permissions
 */
    
    public void setPermissions(ArrayList<String> permissions) {
        this.permissions = permissions;
    }
   
/**
 *
 * toString() for class
 * @return userName, password, role, permissions
 */
//do we want to return the password in toString()?
    @Override
    public String toString() {
        return "Username: " + this.userName + ", Password: " + this.password + " Role: " + this.role + ", Permissions: " + this.permissions;
    }
    
    
    
    
}