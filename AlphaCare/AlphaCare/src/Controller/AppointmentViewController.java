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
    private ArrayList<Appointment> apptList = new ArrayList();
    private MainInterfaceView mainInterface;

    // private Account test;
    public AppointmentViewController() {
        this.appointmentView = new AppointmentView();
        this.mainInterface = new MainInterfaceView();
        this.mainInterface.setVisible(false);
        createButtonListeners();
        this.apptList.add(new Appointment("Genesis DuBon", "12/14/1990", 987656421, "484-786-5677", "gdubs@gmail.com", "12/14/19", "Deadness"));
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
            appointmentView.setVisible(true);
            // Setting the appointment view with values from the previous appointments.
            appointmentView.getFullNameField().setText(apptList.get(apptListLength-1).getFullName());
            appointmentView.getBirthDateField().setText(apptList.get(apptListLength-1).getBirthDate());
            appointmentView.getSsnField().setText(Integer.toString(apptList.get(apptListLength-1).getSsn()));
            appointmentView.getPhoneNumField().setText(apptList.get(apptListLength-1).getPhoneNum());
            appointmentView.getEmailField().setText(apptList.get(apptListLength-1).getEmail());
            appointmentView.getDateField().setText(apptList.get(apptListLength-1).getApptDate());
            appointmentView.getSymptomsArea().setText(apptList.get(apptListLength-1).getSymptoms());

            Appointment newAppt = new Appointment(appointmentView.getFullNameField().getText(),
                            appointmentView.getBirthDateField().getText(), Integer.parseInt(appointmentView.getSsnField().getText()),
                            appointmentView.getPhoneNumField().getText(), appointmentView.getEmailField().getText(),
                            appointmentView.getDateField().getText(), appointmentView.getSymptomsArea().getText());

            apptList.add(newAppt);
            // Removing the first appointment in the list each time!
            apptList.remove(0);
        }
        else {
            appointmentView.setVisible(false);
           // mainInterface.setVisible(true);
        }

    }

    private void createButtonListeners() {
        
        this.appointmentView.getHomeButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent eventL) {    
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

                    appointmentView.setVisible(false);
                    mainInterface.setVisible(true);
                }

            }
        });
    }

}
