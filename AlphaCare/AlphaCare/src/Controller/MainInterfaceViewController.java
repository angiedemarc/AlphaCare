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
        
        displayApptInfo();
        CreateSearchListeners();
        CreateButtonListeners();

    }
    
    private void displayApptInfo() {

        JLabel confirmMessage = new JLabel();
        int apptListLength = forApptList.apptList.size();
        
        int response = JOptionPane.showConfirmDialog(confirmMessage, forApptList.apptList.get(apptListLength - 1).getFullName() + ", "
                + "your next appointment is scheduled for " + forApptList.apptList.get(apptListLength - 1).getApptDate() + ". Would you "
                + "like to make any changes to the current appointment?", "Confirm", JOptionPane.YES_OPTION, JOptionPane.NO_OPTION);

        if (response == JOptionPane.YES_OPTION) {

            //insert code to make appointment changes here
        }
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
