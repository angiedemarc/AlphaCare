/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author calvinho
 */
public class MainInterfaceViewController {
    
      // Attributes in order to develop controller for the MainInterfaceViewController.
    private MainInterfaceView mainInterfaceView;
    private RecordModel model;
    
    // Constructor for MainInterfaceViewController.
    public MainInterfaceViewController(MainInterfaceView mainInterfaceView, RecordModel model) {
        this.mainInterfaceView = mainInterfaceView;
        this.model = model;
        // Method in order to add createRecordView to the controller class. 
        addMainInterfaceView();
    }
    // Added view to the controller class. 
    public void addMainInterfaceView() {
        this.mainInterfaceView = new MainInterfaceView();
    }
    
}

}
