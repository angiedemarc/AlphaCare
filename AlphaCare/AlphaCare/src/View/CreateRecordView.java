package View;

import Controller.ViewRecordViewController;
import Model.Record;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CreateRecordView extends EditableView {

    
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JButton homeButton;
    private JButton createRecordButton;
    private boolean hasClicked;

    public CreateRecordView() {
        createRecordUI();
    }

    private void createRecordUI() {
        this.createRecordButton = new JButton("Create Record");
        
        this.homeButton = new JButton("Home");
        this.homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainInterfaceView mainInterface = new MainInterfaceView();
                
                setVisible(false);
            }
        });

        JPanel content = super.promptRecordInfo();

        // setting positions and dimensions of everything
        createRecordButton.setBounds(20, 60, 200, 50);
        homeButton.setBounds(1, 10, 50, 50);
        content.add(createRecordButton);
        content.add(homeButton);

        this.setContentPane(content);
        this.setTitle("Record");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(1000, 800);
        this.setVisible(true);
    }

    @Override
    public Record getMedicalRecord() {
        if (hasClicked) {
            return medicalRecord;
        }
        return new Record();
    }
    
    public JButton getCreateRecordButton(){
        return this.createRecordButton;
    }

    @Override
    protected void switchView() {
        if (saveInfo()){
            hasClicked = true;
            ViewRecordViewController viewRecordViewController = new ViewRecordViewController(medicalRecord);
        }
        else{
            System.out.println("Must enter valid information to create record");
        }
    }
}
