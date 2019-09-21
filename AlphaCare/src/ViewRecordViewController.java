/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist_412_alphacarecontrollers;

/**
 *
 * @author calvinho
 */
public class ViewRecordViewController {
    
     // Attributes in order to develop controller for the ViewRecord View.
    private ViewRecordView viewRecordView;
    private RecordModel model;
    
    // Constructor for CreateRecordViewController.
    public ViewRecordViewController(ViewRecordView viewRecordView) {
        this.viewRecordView = viewRecordView;
        // Method in order to add createRecordView to the controller class. 
        addViewRecordView();
    }
    // Added view to the controller class. 
    public void addViewRecordView() {
        this.viewRecordView = new ViewRecordView(model);
    }
    
}
