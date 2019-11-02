/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Account;
import Model.Record;
import View.ViewRecordView;

/**
 *
 * @author calvinho
 */
public class ViewRecordViewController {
    
    private ViewRecordView viewRecordView;
    private Account test;

    public Account getTest() {
        return test;
    }

    public ViewRecordViewController(Record medicalRecord) {
        viewRecordView = new ViewRecordView(medicalRecord);
    }

    public ViewRecordView getViewRecordView() {
        return viewRecordView;
    }

    public void setViewRecordView(ViewRecordView viewRecordView) {
        this.viewRecordView = viewRecordView;
    }

}
