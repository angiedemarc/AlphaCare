package Controller;

import View.AppointmentView;
import Model.*;
import View.MainInterfaceView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    public Account getTest() {
        return test;
    }
    private Account test;
    
    public AppointmentViewController() {
        AppointmentView appointmentPanel = new AppointmentView();
    }
    
    public void addAppointmentView() {
        this.appointmentView = new AppointmentView();
    }

    public AppointmentView getAppointmentView() {
        return appointmentView;
    }
    
    private void createButtonListeners(){
        appointmentView.getHomeButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent eventL) {
                System.out.println("home button");
                MainInterfaceView mainInterface = new MainInterfaceView();
                
                appointmentView.setVisible(false);
                mainInterface.setVisible(true);
            }
        });
        
        appointmentView.getSubmitButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent eventLis) {
                System.out.println("Testing: Successful Submission!");
                
                MainInterfaceView mainInterface = new MainInterfaceView();
                
                appointmentView.setVisible(false);
                mainInterface.setVisible(true);
            }
        });
        
        appointmentView.getCancelButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent eventList) {
                System.out.println("Testing: Successful Cancellation!");
                
                MainInterfaceView mainInterface = new MainInterfaceView();
                
                appointmentView.setVisible(false);
                mainInterface.setVisible(true);
            }
        });
    }
    
}