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
public class EditRecordViewController {
    
    // Attributes in order to develop controller for the EditRecord View.
    private EditRecordView editRecordView;
    private RecordModel model;
    
    // Constructor for CreateRecordViewController.
    public EditRecordViewController(EditRecordView editRecordView) {
        this.editRecordView = editRecordView;
        // Method in order to add createRecordView to the controller class. 
        addCreateRecordView();
    }
    // Added view to the controller class. 
    public void addCreateRecordView() {
        this.editRecordView = new EditRecordView(model);
    }
    
}
