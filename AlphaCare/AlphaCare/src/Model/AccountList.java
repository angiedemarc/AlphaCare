/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Genesis
 */
public class AccountList implements Serializable {

    private ArrayList<Account> accountList;

    /**
     *
     * Empty constructor that automatically creates ArrayList of accounts
     */
    public AccountList() {
        this.accountList = new ArrayList<>();
        createAccounts();
    }

    /**
     *
     * Method that populates ArrayList of accounts
     */ 
    
    public void createAccounts() {
        this.accountList.add(new Account());
        this.accountList.add(new Account());
        this.accountList.add(new Account("CJones45", "ghdjuei34", "Admin", new ArrayList<>()));
        this.accountList.add(new Account("AMira", "uejdnh36!", "Patient", new ArrayList<>()));
        this.accountList.add(new Account("MBuchle", "ujks3456", "Doctor", new ArrayList<>()));
        this.accountList.add(new Account("a", "z", "Patient", new ArrayList<>()));
    }

    public boolean contains(Account account){
        for (Account account2 : accountList) {
            if (account2.equals(account)){
                return true;
            }
        }
        return false;
    }

    public void addAccount(Account account){
        accountList.add(account);
    }

    /**
     *
     * getter for ArrayList of accounts
     *
     * @return accountList
     */
    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    /**
     *
     * setter for ArrayList of accounts
     *
     * @param accountList
     */
    public void setAccountList(ArrayList<Account> accountList) {
        this.accountList = accountList;
    }

}
