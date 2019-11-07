/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import alphacare.PersistentDataCntl;
import javafx.collections.ObservableList;

/**
 *
 * @author cole
 */
public class AccountListCntl {
    
    private static AccountListCntl theAccountListCntl;
    private  ObservableList<Account> theListOfAccounts;

    AccountListCntl() {
        theListOfAccounts = (ObservableList<Account>) PersistentDataCntl.getPersistentDataCntl().getPeristentDataCollection().getAccountList().getAccountData();
    }

    public static AccountListCntl getAccountListCntl() {
        if (theAccountListCntl != null) {
            return theAccountListCntl;
        } else {
            theAccountListCntl = new AccountListCntl();
            return theAccountListCntl;
        }
    }

    public void addAccountRow(Account newAccount) {
        PersistentDataCntl.getPersistentDataCntl().getPeristentDataCollection().getAccountList().getAccountData().add(newAccount);
        PersistentDataCntl.getPersistentDataCntl().writeSerializedDataModel();
    }

    public ObservableList<Account> getListOfAccounts() {
        return theListOfAccounts;
    }

}
