package View;

import Model.Record;
import java.awt.PopupMenu;
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
            public void actionPerformed(ActionEvent e){
                new ViewRecordView(this.medicalRecord);
                this.dispose();
            }
        });

        JPanel content = new JPanel();
        content.setLayout(null);
        content.add(this.medicalRecordField);

        //setting positions and dimensions of everything
        medicalRecordField.setBounds(5, 5, 300, 50);
        createRecordButton.setBounds(5, 60, 200, 50);

        this.setContentPane(content);
        this.setTitle("Record");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(800, 600);
        this.setVisible(true);
    }
}
