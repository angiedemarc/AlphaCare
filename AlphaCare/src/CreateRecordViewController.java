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
public class CreateRecordViewController {
     // Attributes in order to develop controller for the CreateRecord View.
    private CreateRecordView createRecordView;
    private RecordModel model;
    
    // Constructor for CreateRecordViewController.
    public CreateRecordViewController(CreateRecordView createRecordView) {
        this.createRecordView = createRecordView;
        // Method in order to add createRecordView to the controller class. 
        addCreateRecordView();
    }
    // Added view to the controller class. 
    public void addCreateRecordView() {
        this.createRecordView = new CreateRecordView(model);
    }
}
