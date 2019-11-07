/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Genesis
 */
public class AccountList implements Serializable {

    private ArrayList<Account> theListOfAccountsAll;

    /**
     *
     * Empty constructor that automatically creates ArrayList of accounts
     */
    public AccountList() {
        theListOfAccountsAll = getAccountList();

        //this.accountList = new ArrayList<>();
        //createAccounts();
    }

    public ObservableList<Account> getAccountData() {
        ObservableList<Account> theListOfAccounts;
        List<Account> accountList = (List<Account>) theListOfAccountsAll;
        theListOfAccounts = FXCollections.observableList(accountList);
        return theListOfAccounts;
    }

    /**
     *
     * Method that populates ArrayList of accounts
     */
    private ArrayList<Account> getAccountList() {
        ArrayList<Account> accountList = new ArrayList<>();
        accountList.add((new Account("CJones45", "ghdjuei34", "Admin", new ArrayList<>())));
        accountList.add((new Account("AMira", "uejdnh36!", "Patient", new ArrayList<>())));
        accountList.add((new Account("MBuchle", "ujks3456", "Doctor", new ArrayList<>())));
        accountList.add((new Account("a", "z", "Patient", new ArrayList<>())));
        return accountList;
    }

    /**
     *
     * Method that populates ArrayList of accounts
     */
//    public void createAccounts() {
//        this.accountList.add(new Account());
//        this.accountList.add(new Account());
//        this.accountList.add(new Account("CJones45", "ghdjuei34", "Admin", new ArrayList<>()));
//        this.accountList.add(new Account("AMira", "uejdnh36!", "Patient", new ArrayList<>()));
//        this.accountList.add(new Account("MBuchle", "ujks3456", "Doctor", new ArrayList<>()));
//        this.accountList.add(new Account("a", "z", "Patient", new ArrayList<>()));
//    }
//    public boolean contains(Account account){
//        for (Account account2 : accountList) {
//            if (account2.equals(account)){
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public void addAccount(Account account){
//        accountList.add(account);
//    }
}
