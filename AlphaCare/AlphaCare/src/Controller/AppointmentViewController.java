package Controller;

import View.AppointmentView;
import Model.Record;

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

    private AppointmentView appointmentView;
    
    public AppointmentViewController() {
        AppointmentView appointmentPanel = new AppointmentView();
    }
    
    public void addAppointmentView() {
        this.appointmentView = new AppointmentView();
    }

    public AppointmentView getAppointmentView() {
        return appointmentView;
    }
    
    
    
}

    

