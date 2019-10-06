package View;

import Model.Record;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ViewRecordView extends RecordView {

    private JButton editRecordButton;

    public ViewRecordView() {
        super();
        viewRecordUI();
    }

    public ViewRecordView(Record medicalRecord){
        super(medicalRecord);
        viewRecordUI();
    }

    private void viewRecordUI(){
        this.editRecordButton = new JButton("Edit Record");
        this.editRecordButton.addActionListener(new ActionListener(){
            public void actionPerforemd(){
                new EditRecordView(medicalRecord);
                this.dispose();
            }
        });

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
        this.setVisible(true);
        }
        
    

    /**
     * Returns the medicalRecord associated with the view
     */
    public Record getMedicalRecord(){
        return this.medicalRecord;
    }

    /**
     * Fills in medical info throughout the view
     * Edits medicalRecordField to reflect the medical record
     * @param mr medical record to populate the view
     */
    public void enterMedicalInfo(Record mr){
        this.medicalRecord = mr;
        this.medicalRecordField.setText("hello");
        this.medicalRecordField.setText(this.medicalRecord);
    }
}
