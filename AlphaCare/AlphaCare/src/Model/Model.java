/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author cole
 */
public class Model {
    
    //add shortcuts for all model classes
    
    
    private AccountList acctList;
    


    public Model()
    {
        acctList = new AccountList();
    }

    public AccountList getacctList()
    {
        return acctList;
    }

    public void setAcctList(AccountList acctList)
    {
        this.acctList = acctList;
    }
    
    
}
