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
public class EditRecordViewController {
    
     private EditRecordView editRecordView;
     private Account test;

    public Account getTest() {
        return test;
    }

    public void setTest(Account test) {
        this.test = test;
    }
    
    public EditRecordViewController() {
        EditRecordView editRecordView = new EditRecordView();
    }

    public void setEditRecordView(EditRecordView editRecordView) {
        this.editRecordView = editRecordView;
    }

    public EditRecordView getEditRecordView() {
        return editRecordView;
    }
    
    
}
