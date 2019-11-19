package Controller;

import View.*;
import Model.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    // private Account test;

    public AppointmentViewController() {
        this.appointmentView = new AppointmentView();
        createButtonListeners();
    }

    public void addAppointmentView() {
        this.appointmentView = new AppointmentView();
    }

    public AppointmentView getAppointmentView() {
        return this.appointmentView;
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
                JLabel submitMessage = new JLabel();
                JOptionPane.showMessageDialog(submitMessage, "Your appointment has been scheduled!");

                MainInterfaceView mainInterface = new MainInterfaceView();
                appointmentView.setVisible(false);
                mainInterface.setVisible(true);
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
