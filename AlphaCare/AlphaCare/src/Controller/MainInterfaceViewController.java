package Controller;

import Model.AccountList;
import View.MainInterfaceView;
import View.ViewRecordView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import Controller.AppointmentViewController;

/**
 *
 * @author calvinho
 */
public class MainInterfaceViewController {

    private MainInterfaceView mainInterfaceView;
    private AppointmentViewController forApptList;
    private AccountList accountList;
    private String feedback;

    public MainInterfaceViewController() {
        mainInterfaceView = new MainInterfaceView();
        forApptList = new AppointmentViewController();
        forApptList.getAppointmentView().setVisible(false);
        forApptList.displayApptInfo();
        CreateSearchListeners();
        CreateButtonListeners();

    }

    private void CreateSearchListeners() {
        JTextField searchBar = mainInterfaceView.getSearchField();
        searchBar.addActionListener(
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
                System.out.println(searchBar.getText());
                SearchViewController search = new SearchViewController(searchBar.getText());
                mainInterfaceView.setVisible(false);
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
