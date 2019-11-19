package Controller;

import Model.AccountList;
import View.MainInterfaceView;
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
    private AccountList accountList;
    private String feedback;

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
                mainInterfaceView.setVisible(false);
            }
        });

        JButton createRecord = mainInterfaceView.getCreateRecordButton();
        createRecord.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreateRecordViewController createRecord = new CreateRecordViewController();
                mainInterfaceView.setVisible(false);
            }
        });

        JButton scheduleAppointment = mainInterfaceView.getScheduleAppointmentButton();
        scheduleAppointment.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AppointmentViewController appointment = new AppointmentViewController();
                mainInterfaceView.setVisible(false);
            }
        });

        mainInterfaceView.getPrescriptionButton().addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PrescriptionViewController prescription = new PrescriptionViewController();
                mainInterfaceView.setVisible(false);
            }
        });

        mainInterfaceView.getReportButton().addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                feedback = JOptionPane.showInputDialog("Please enter feedback on the application below:");
                System.out.println("FEEDBACK: " + feedback);
            }
        });
        JButton logoutButton = mainInterfaceView.getLogoutButton();
        logoutButton.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginPageViewController loginPageView = new LoginPageViewController(accountList);
                mainInterfaceView.setVisible(false);
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
