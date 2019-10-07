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
import javax.swing.JToolBar;


public class MainInterfaceView extends JFrame {
    private JPanel mainPanel;
    private JToolBar toolBar;
    private JButton viewRecordButton;
    private JButton createRecordButton;
    private JButton logoutButton;
    private JButton scheduleAppointmentButton;
    
    
    /**
    * This constructor will instantiate 
    * the main menu interface.
     */
    public MainInterfaceView(){
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
    
    private void mainUI(){
        setTitle("Main Menu");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        //setVisible(true);
        
        viewRecordButton = new JButton("View Record");
        
        createRecordButton = new JButton("Create New Record");
        
        logoutButton = new JButton("Logout");
        
        scheduleAppointmentButton = new JButton("Schedule Appointment");
        
        toolBar = new JToolBar();
        toolBar.add(viewRecordButton);
        toolBar.add(createRecordButton);
        toolBar.add(logoutButton);
        
        mainPanel = new JPanel();
        mainPanel.add(viewRecordButton);
        mainPanel.add(createRecordButton);
        mainPanel.add(scheduleAppointmentButton);
        mainPanel.add(logoutButton);
        
        toolBar.add(mainPanel);
        
        getContentPane().add(toolBar, BorderLayout.NORTH);
        
        setVisible(true);
        
        viewRecordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent even){
                System.out.println("Testing: Successful Access!");
                
                ViewRecordView recordView = new ViewRecordView();
                
                setVisible(false);
                //recordView.setVisible(true);
            }
        });
        
        createRecordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event){
                System.out.println("Testing: Successful Access!");
                
                CreateRecordView createRecord = new CreateRecordView();
                
                setVisible(false);
                //createRecord.setVisible(true);
            }
        });
        
        scheduleAppointmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent eventL){
                System.out.println("Testing: Successful Access!");
                
                AppointmentView appointment = new AppointmentView();
                
                setVisible(false);
                //appointment.setVisible(true);
            }
        });
        
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent eventLi){
                System.out.println("Testing: Successful logout!");
                
                LoginPageView loginPageView = new LoginPageView();
                
                setVisible(false);
                loginPageView.setVisible(true);
            }
        });
    }
    
    /**
     * These action listener methods will allow
     * the buttons to display the new windows/screens
     * to the user/actor when they click on them.
     * @param al 
     */
    
        public void addViewRecordListener(ActionListener al) {
        viewRecordButton.addActionListener(al);
    }
        
        public void addCreateRecordListener(ActionListener al) {
        createRecordButton.addActionListener(al);
    }
        
        public void addScheduleAppointmentListener(ActionListener al) {
        scheduleAppointmentButton.addActionListener(al);
    }
        public void addLogoutButtonListener(ActionListener al) {
        logoutButton.addActionListener(al);
    }
}
