package View;

import Controller.ViewRecordViewController;
import Model.Record;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class EditRecordView extends EditableView {

    private JButton saveRecordButton;
    private JButton homeButton;

    public EditRecordView() {
        super();
        editRecordUI();
    }

    public EditRecordView(Record medicalRecord) {
        super(medicalRecord);
        editRecordUI();
    }

    private void editRecordUI() {
        this.saveRecordButton = new JButton("Save Record");
        this.saveRecordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchView();
            }
        });
        
        this.homeButton = new JButton("Home");
        this.homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainInterfaceView mainInterface = new MainInterfaceView();
                
                setVisible(false);
            }
        });

        JPanel content = promptRecordInfo();
        
        // setting positions and dimensions of everything
        saveRecordButton.setBounds(5, 60, 200, 50);
        homeButton.setBounds(40, 80, 10, 50);

        this.setContentPane(content);
        this.setTitle("Record");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        JScrollPane scrollPane = new JScrollPane(content);
        // getContentPane().add(appointmentPanel);
        getContentPane().add(scrollPane);

        this.setSize(800, 600);
        this.setVisible(true);
    }
    
    @Override
    protected void switchView(){
        ViewRecordViewController viewRecordViewController = new ViewRecordViewController(medicalRecord);
    }

}
