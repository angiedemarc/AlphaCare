package View;


import Model.Record;
import java.awt.PopupMenu;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class EditRecordView extends RecordView {

    private JButton saveRecordButton;

    EditRecordView() {
        super();
    }

    EditRecordView(Record medicalRecord){
        super(medicalRecord);
    }

    public void createVisual(){
        this.medicalRecordField = new JTextField(20);
        this.saveRecordButton = new JButton("Save Record");
        this.saveRecordButton.addActionListener(new ActionListener(){
            public void actionPerformed(){
                new ViewRecordView(medicalRecord);
                this.dispose();
            }
        });

        JPanel content = new JPanel();
        content.setLayout(null);
        content.add(this.medicalRecordField);

        //setting positions and dimensions of everything
        medicalRecordField.setBounds(5, 5, 300, 50);
        saveRecordButton.setBounds(5, 60, 200, 50);

        this.setContentPane(content);
        this.setTitle("Record");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(800, 600);

    }

}
