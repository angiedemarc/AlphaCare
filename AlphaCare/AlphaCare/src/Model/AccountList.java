/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;


/**
 *
 * @author Genesis
 */
public class AccountList  {

    private ArrayList<Account> theListOfAccountsAll;

    /**
     *
     * Empty constructor that automatically creates ArrayList of accounts
     */
    public AccountList() {
        theListOfAccountsAll = getAccountList();
    }


    /**
     *
     * Method that populates ArrayList of accounts
     */
    public ArrayList<Account> getAccountList() {
        theListOfAccountsAll = new ArrayList<>();
        theListOfAccountsAll.add((new Account("CJones45", "ghdjuei34", "Admin")));
        theListOfAccountsAll.add((new Account("AMira", "uejdnh36!", "Patient")));
        theListOfAccountsAll.add((new Account("MBuchle", "ujks3456", "Doctor")));
        theListOfAccountsAll.add((new Account("Genesis", "genesis", "Patient")));
        return theListOfAccountsAll;
    }

    public void addAccount(Account account){
        theListOfAccountsAll.add(account);
        
        for(Account a: theListOfAccountsAll){
            System.out.println("Hi:"+ a.toString());
        }
    }
}
