package Controller;

import Model.Account;
import View.MainInterfaceView;
import Model.Record;
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
public class MainInterfaceViewController implements ActionListener {
    
    private MainInterfaceView mainInterfaceView;
    private Account test;

    public Account getTest() {
        return test;
    }

    public MainInterfaceViewController() {
        mainInterfaceView = new MainInterfaceView();
        mainInterfaceView.addCreateRecordListener(this);
        mainInterfaceView.addViewRecordListener(this);
        mainInterfaceView.addLogoutButtonListener(this);
        mainInterfaceView.addScheduleAppointmentListener(this);
    }

    public MainInterfaceView getMainInterfaceView() {
        return mainInterfaceView;
    }

    public void setMainInterfaceView(MainInterfaceView mainInterfaceView) {
        this.mainInterfaceView = mainInterfaceView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == mainInterfaceView.getCreateRecordButton()) {
           CreateRecordViewController createRecord = new CreateRecordViewController();
       } else if (e.getSource() == mainInterfaceView.getViewRecordButton()) {
           ViewRecordViewController viewRecord = new ViewRecordViewController();
       } else if (e.getSource() == mainInterfaceView.getLogoutButton()) {
           LoginPageViewController login = new LoginPageViewController();
       } else if (e.getSource() == mainInterfaceView.getScheduleAppointmentButton()) {
           AppointmentViewController appointment = new AppointmentViewController();
       } else {
           System.out.println("This has failed!");
       }
    }
    
}

