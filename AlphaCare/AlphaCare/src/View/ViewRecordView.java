package View;

import Model.Record;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ViewRecordView extends JFrame {

    private JButton editRecordButton;
    private JTextField medicalRecordField;
    private Record medicalRecord;

    public ViewRecordView() {
        ViewRecordUI();
    }
        
        private void ViewRecordUI() {
        this.medicalRecordField = new JTextField(20);
        this.medicalRecordField.setEditable(false);
        this.editRecordButton = new JButton("Edit Record");
        this.editRecordButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                new EditRecordView(medicalRecord);
            }
        });

        JPanel content = new JPanel();
        content.setLayout(null);
        content.add(this.editRecordButton);

        //setting positions and dimensions of everything
        editRecordButton.setBounds(5, 60, 200, 50);

        this.setContentPane(content);
        this.setTitle("Record");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(800, 600);
        this.setVisible(true);
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
