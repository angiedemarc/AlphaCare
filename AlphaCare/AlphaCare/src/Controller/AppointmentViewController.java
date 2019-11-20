package Controller;

import View.*;
import Model.*;
import alphacare.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

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
    public ArrayList<Appointment> apptList = new ArrayList();

    // private Account test;
    public AppointmentViewController() {
        this.appointmentView = new AppointmentView();
        createButtonListeners();

        apptList.add(new Appointment("Johnny Cash", "12/14/1990", 9876, "ad", "adf", "12/14/19", "afad"));
    }

    public void addAppointmentView() {
        this.appointmentView = new AppointmentView();
    }

    public AppointmentView getAppointmentView() {
        return this.appointmentView;
    }

    public void displayApptInfo() {

        int apptListLength = apptList.size();
        JLabel confirmMsg = new JLabel();
        int response = JOptionPane.showConfirmDialog(confirmMsg, apptList.get(apptListLength-1).getFullName() + ", your next appointment is scheduled for "
                + apptList.get(apptListLength-1).getApptDate() + ". Would you like to make any changes to the current appointment?", "Confirm Appointment",
                JOptionPane.YES_OPTION, JOptionPane.NO_OPTION);

        if (response == JOptionPane.YES_OPTION) {

            //insert code to make appointment changes here
        }
    }

    private void createButtonListeners() {
        this.appointmentView.getHomeButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent eventL) {
                MainInterfaceView mainInterface = new MainInterfaceView();

                appointmentView.setVisible(false);
                mainInterface.setVisible(true);
            }
        });

        this.appointmentView.getSubmitButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent eventLis) {

                try {
                    Appointment newAppt = new Appointment(appointmentView.getFullNameField().getText(),
                            appointmentView.getBirthDateField().getText(), Integer.parseInt(appointmentView.getSsnField().getText()),
                            appointmentView.getPhoneNumField().getText(), appointmentView.getEmailField().getText(),
                            appointmentView.getDateField().getText(), appointmentView.getSymptomsArea().getText());

                    apptList.add(newAppt);

                    JLabel submitMessage = new JLabel();
                    JOptionPane.showMessageDialog(submitMessage, "Your appointment has been scheduled!");

                    MainInterfaceView mainInterface = new MainInterfaceView();
                    appointmentView.setVisible(false);
                    mainInterface.setVisible(true);
                    
                    displayApptInfo();

                } catch (NumberFormatException e) {
                    JLabel error = new JLabel();
                    JOptionPane.showMessageDialog(error, "Please enter text and/or numbers into the appropriate fields.");
                }

            }
        });

        this.appointmentView.getCancelButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent eventList) {

                JLabel cancelLabel = new JLabel();

                int response = JOptionPane.showConfirmDialog(cancelLabel, "Are you sure you want to cancel scheduling an appointment?", "Confirm",
                        JOptionPane.YES_OPTION, JOptionPane.NO_OPTION);

                if (response == JOptionPane.YES_OPTION) {

                    MainInterfaceView mainInterface = new MainInterfaceView();
                    appointmentView.setVisible(false);
                    mainInterface.setVisible(true);
                }

            }
        });
    }

}
