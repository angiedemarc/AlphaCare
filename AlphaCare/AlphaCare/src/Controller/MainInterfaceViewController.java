package Controller;

import Model.Account;
import Model.AccountList;
import View.MainInterfaceView;
import Model.Record;
import View.AppointmentView;
import View.CreateRecordView;
import View.LoginPageView;
import View.ViewRecordView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

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

    private MainInterfaceView mainInterfaceView;

    public MainInterfaceViewController() {
        mainInterfaceView = new MainInterfaceView();
        CreateSearchListeners();
        CreateButtonListeners();

    }

    private void CreateSearchListeners() {
        JTextField search = mainInterfaceView.getSearchField();
        search.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // System.out.println(search.getText());
            }
        });
        JButton searchButton = mainInterfaceView.getSearchButton();
        searchButton.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(search.getText());
            }
        });
    }

    private void CreateButtonListeners() {
        JButton viewRecord = mainInterfaceView.getViewRecordButton();
        viewRecord.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewRecordView recordView = new ViewRecordView();
                //setVisible(false);
            }
        });

        JButton createRecord = mainInterfaceView.getCreateRecordButton();
        createRecord.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreateRecordView createRecord = new CreateRecordView();
            }
        });

        JButton scheduleAppointment = mainInterfaceView.getScheduleAppointmentButton();
        scheduleAppointment.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AppointmentView appointment = new AppointmentView();
            }
        });

        JButton homeButton = mainInterfaceView.getHomeButton();
        homeButton.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainInterfaceView mainInterface = new MainInterfaceView();
            }
        });

        JButton logoutButton = mainInterfaceView.getLogoutButton();
        logoutButton.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginPageView loginPageView = new LoginPageView();
            }
        });
    }

    public MainInterfaceView getMainInterfaceView() {
        return mainInterfaceView;
    }

    public void setMainInterfaceView(MainInterfaceView mainInterfaceView) {
        this.mainInterfaceView = mainInterfaceView;
    }

}
