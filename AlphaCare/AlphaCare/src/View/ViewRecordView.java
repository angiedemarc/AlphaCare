package View;

import Model.Record;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ViewRecordView extends JFrame {

    private JButton editRecordButton;
    private JTextField medicalRecordField;
    private Record medicalRecord;

    ViewRecordView() {

        this.medicalRecordField = new JTextField(20);
        this.medicalRecordField.setEditable(false);
        this.editRecordButton = new JButton("Edit Record");

        JPanel content = new JPanel();
        content.setLayout(null);
        content.add(this.medicalRecordField);
        content.add(this.editRecordButton);

        //setting positions and dimensions of everything
        medicalRecordField.setBounds(5, 5, 300, 50);
        editRecordButton.setBounds(5, 60, 200, 50);

        this.setContentPane(content);
        this.setTitle("Record");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(800, 600);
    }

    /**
     * Returns the medicalRecord associated with the view
     */
    public Record getMedicalRecord(){
        return this.medicalRecord;
    }

    /**
     * Adds actionlistener to editRecordButton
     * @param al ActionListener that will switch view form 'ViewRecordView' to 'EditRecordView'
     */
    public void addEditRecordButtonListener(ActionListener al) {
        editRecordButton.addActionListener(al);
    }

    /**
     * Fills in medical info throughout the view
     * Edits medicalRecordField to reflect the medical record
     * @param mr medical record to populate the view
     */
    public void enterMedicalInfo(Record mr){
        this.medicalRecord = mr;
    }

}