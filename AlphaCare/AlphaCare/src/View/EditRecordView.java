package View;


import Model.Record;
import java.awt.PopupMenu;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class EditRecordView extends JFrame {

    private JButton saveRecordButton;
    private JTextField medicalRecordField;
    private Record medicalRecord;
    private PopupMenu editRecordButton;

    EditRecordView() {

        this.medicalRecordField = new JTextField(20);
        this.saveRecordButton = new JButton("Save Record");

        JPanel content = new JPanel();
        content.setLayout(null);
        content.add(this.medicalRecordField);
        content.add(this.editRecordButton);

        //setting positions and dimensions of everything
        medicalRecordField.setBounds(5, 5, 300, 50);
        saveRecordButton.setBounds(5, 60, 200, 50);

        this.setContentPane(content);
        this.setTitle("Record");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(800, 600);
    }

    /**
     * Adds actionlistener to saveRecordButton
     * Will use information from medicalRecordField to update medicalRecord
     * @param al ActionListener that will save updated information and switch view form 'EditRecordView' to 'SaveRecordView'
     */
    public void addSaveRecordButtonListener(ActionListener al) {
        saveRecordButton.addActionListener(al);
    }

}
