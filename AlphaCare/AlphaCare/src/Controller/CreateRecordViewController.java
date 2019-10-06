/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Account;
import View.*;



/**
 *
 * @author calvinho
 */
public class CreateRecordViewController {
     private CreateRecordView createRecordView;
     private Account test;

    public Account getTest() {
        return test;
    }
    
    public CreateRecordViewController() {
        CreateRecordView createRecordView = new CreateRecordView();
    }
    
    public void addCreateRecordViewController() {
        this.createRecordView = createRecordView;
    }

    public CreateRecordView getCreateRecordView() {
        return createRecordView;
    }
   
}
