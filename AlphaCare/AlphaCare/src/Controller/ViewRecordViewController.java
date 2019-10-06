/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Record;
import View.ViewRecordView;

/**
 *
 * @author calvinho
 */
public class ViewRecordViewController {
    
    private ViewRecordView viewRecordView;

    public ViewRecordViewController(ViewRecordView viewRecordView) {
        this.viewRecordView = viewRecordView;
    }

    public ViewRecordView getViewRecordView() {
        return viewRecordView;
    }

    public void setViewRecordView(ViewRecordView viewRecordView) {
        this.viewRecordView = viewRecordView;
    }

}
