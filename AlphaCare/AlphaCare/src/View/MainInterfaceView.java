/**
 * This is the main menu/interface when
 * logging into the application.
 *
 * It will feature several buttons
 * inside of a tool bar, so that
 * users/actors can easily find
 * and access functionalities for
 * viewing a record, creating a record,
 * and logging out.
 *
 * Viewing a record and creating a record
 * will display a new window or screen to the user.
 */
package View;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class MainInterfaceView extends JFrame {

    private JPanel mainPanel;
    private JToolBar toolBar;
    private JButton viewRecordButton;
    private JButton createRecordButton;
    private JButton logoutButton;
    private JButton scheduleAppointmentButton;
    private JButton searchButton;
    private JButton homeButton;
    private JTextField searchField;

    /**
     * This constructor will instantiate the main menu interface.
     */
    public MainInterfaceView() {
        mainUI();
    }

    public JButton getViewRecordButton() {
        return viewRecordButton;
    }

    public JButton getCreateRecordButton() {
        return createRecordButton;
    }

    public JButton getLogoutButton() {
        return logoutButton;
    }

    public JButton getScheduleAppointmentButton() {
        return scheduleAppointmentButton;
    }

    public JButton getSearchButton() {
        return searchButton;
    }

    public JButton getHomeButton() {
        return homeButton;
    }

    private void mainUI() {
        setTitle("Main Menu");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        //setVisible(true);

        setViewRecordButton(new JButton("View Record"));

        setCreateRecordButton(new JButton("Create New Record"));

        setLogoutButton(new JButton("Logout"));

        setScheduleAppointmentButton(new JButton("Schedule Appointment"));

        setSearchButton(new JButton("Search"));

        setHomeButton(new JButton("Home"));

        //-----Input Prompt User Interface Design Pattern-------
        setSearchField(new JTextField());
        getSearchField().setText("Enter a record number or account number");
        //------------------------------------------------------

        toolBar = new JToolBar();
        toolBar.add(getHomeButton());
        toolBar.add(getSearchButton());
        toolBar.add(getViewRecordButton());
        toolBar.add(getCreateRecordButton());
        toolBar.add(getLogoutButton());
        toolBar.add(getSearchField());

        mainPanel = new JPanel();
        mainPanel.add(getSearchButton());
        mainPanel.add(getViewRecordButton());
        mainPanel.add(getCreateRecordButton());
        mainPanel.add(getScheduleAppointmentButton());
        mainPanel.add(getHomeButton());
        mainPanel.add(getLogoutButton());

        toolBar.add(mainPanel);

        getContentPane().add(toolBar, BorderLayout.NORTH);

        setVisible(true);
    }

    /**
     * These action listener methods will allow the buttons to display the new
     * windows/screens to the user/actor when they click on them.
     *
     * @param al
     */
    public void setViewRecordButton(JButton viewRecordButton) {
        this.viewRecordButton = viewRecordButton;
    }

    public void setCreateRecordButton(JButton createRecordButton) {
        this.createRecordButton = createRecordButton;
    }

    public void setLogoutButton(JButton logoutButton) {
        this.logoutButton = logoutButton;
    }

    public void setScheduleAppointmentButton(JButton scheduleAppointmentButton) {
        this.scheduleAppointmentButton = scheduleAppointmentButton;
    }

    public void setSearchButton(JButton searchButton) {
        this.searchButton = searchButton;
    }

    public void setHomeButton(JButton homeButton) {
        this.homeButton = homeButton;
    }

    public JTextField getSearchField() {
        return searchField;
    }

    public void setSearchField(JTextField searchField) {
        this.searchField = searchField;
    }
}
