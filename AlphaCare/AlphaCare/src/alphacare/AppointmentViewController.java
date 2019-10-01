package alphacare;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author calvinho
 */
public class AppointmentViewController {
    
      // Attributes in order to develop controller for the LoginPageViewController.
    private AppointmentView appointmentView;
    private Record model;
    
    // Constructor for LoginPageViewController.
    public AppointmentViewController(AppointmentView appointmentView, Record model) {
        this.appointmentView = appointmentView;
        this.model = model;
        // Method in order to add createRecordView to the controller class. 
        addAppointmentView();
    }
    // Added view to the controller class. 
    public void addAppointmentView() {
        this.appointmentView = new AppointmentView();
    }
    
}

    

