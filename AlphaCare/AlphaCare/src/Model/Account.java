package Model;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Genesis
 */
public class Account implements Comparable <Account>{
/**
 *
 * Declaration of class attributes
 */
    private String userName;
    private String password;
    private String fName;
    private String lName;
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
    public Account(String userName, String password, String role) {
        this.userName = userName;
        this.password = password;
        this.role = role;
        //this.permissions = permissions;
    }

    public Account(String userName, String password, String role, String fName, String lName) {
        this.userName = userName;
        this.password = password;
        this.role = role;
        this.fName = fName;
        this.lName = lName;
    }
    
    public Account(String userName, String password){
        this.userName = userName;
        this.password = password;
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

///**
// *
// * getter for ArrayList of permissions (read, write, view)
// * @return permissions
// */
//    public ArrayList<String> getPermissions() {
//        return permissions;
//    }
//
///**
// *
// * setter for ArrayList of permissions
// * @param permissions
// */
//    
//    public void setPermissions(ArrayList<String> permissions) {
//        this.permissions = permissions;
//    }
   
/**
 *
 * toString() for class
 * @return userName, password, role, permissions
 */
//do we want to return the password in toString()?
    @Override
    public String toString() {
        return "Username: " + this.userName + ", Password: " + this.password + " Role: " + this.role;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.userName);
        hash = 71 * hash + Objects.hashCode(this.password);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Account other = (Account) obj;
        if (!Objects.equals(this.userName, other.userName)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Account o) {
        int compareVal = o.password.compareTo(o.password);
       return compareVal;
    }
    
    
    
    
}