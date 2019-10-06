/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.*;


/**
 *
 * @author calvinho
 */
public class EditRecordViewController {
    
     private EditRecordView editRecordView;
    
    public EditRecordViewController() {
        // EditRecordView editRecordView = new EditRecordView();
    }

    public void setEditRecordView(EditRecordView editRecordView) {
        this.editRecordView = editRecordView;
    }

    public EditRecordView getEditRecordView() {
        return editRecordView;
    }
    
    
}
