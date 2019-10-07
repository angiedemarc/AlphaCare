package View;

import Controller.ViewRecordViewController;
import Model.Record;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class CreateRecordView extends RecordView {

    private JButton createRecordButton;

    public CreateRecordView() {
        super();
        createRecordUI();
    }

    private void createRecordUI(){
        this.createRecordButton = new JButton("Create Record");
        this.createRecordButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                switchView();
            }
        });

        JPanel content = new JPanel();
        content.setLayout(null);

        //setting positions and dimensions of everything
        createRecordButton.setBounds(5, 60, 200, 50);

        this.setContentPane(content);
        this.setTitle("Record");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(800, 600);
        this.setVisible(true);
    }
    
    private void switchView(){
        ViewRecordViewController viewRecordViewController = new ViewRecordViewController(medicalRecord);
    }
}
