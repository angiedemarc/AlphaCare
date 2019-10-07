package View;

import Model.Record;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class CreateRecordView extends JFrame {

    private JButton createRecordButton;
    private Record medicalRecord;

    public CreateRecordView() {
       CreateRecordUI();
    }
    private void CreateRecordUI() {
        this.medicalRecordField = new JTextField(20);
        this.createRecordButton = new JButton("Create Record");
        this.createRecordButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                new ViewRecordView(medicalRecord);
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

    /**
     * Adds actionlistener to createRecordButton
     * Will use information from medicalRecordField to update medicalRecord
     * @param al ActionListener that will save updated information and switch view form 'CreateRecordView' to 'ViewRecordView'
     */
    public void addCreateRecordButtonListener(ActionListener al) {
        createRecordButton.addActionListener(al);
    }

}
