/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;

import Model.AccountList;
import Model.SingletonRecordList;
import java.io.Serializable;

/**
 *
 * @author cole
 */
public class PersistentDataCollection implements Serializable {

    private AccountList theAccountList;
    private SingletonRecordList theSingletonRecordList;
//    private ReminderList theReminderList;
//    private ExpenseList theExpenseList;
//    private ResourceList theResourceList;
//    

    public PersistentDataCollection() {
        if (theAccountList == null) {
            theAccountList = new AccountList();
        }
//        if(theSingletonRecordList == null){
//            theSingletonRecordList = new SingletonRecordList();
//        }
//        if(theActivityList == null){
//            theActivityList = new ActivityList();
//        }
//        if(theExpenseList == null) {
//            theExpenseList = new ExpenseList();
//        }
//        if(theResourceList == null) {
//            theResourceList = new ResourceList();
//        }
    }

    public AccountList getAccountList() {
        return theAccountList;
    }
//
//    public SingletonRecordList getSingletonRecordList() {
//        return SingletonRecordList;
//    }
//    
//    public ActivityList getActivityList(){
//        return theActivityList;
//    }
//
//    public ExpenseList getExpenseList() {
//        return theExpenseList;
//    }
//
//    public ResourceList getResourceList() {
//        return theResourceList;
//    }
}
