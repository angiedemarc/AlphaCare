package View;


import Model.Record;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
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

    public EditRecordView() {
        EditRecordUI();
    }

    private void editRecordUI() {
        this.saveRecordButton = new JButton("Save Record");
        this.saveRecordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ViewRecordView(medicalRecord);
            }
        });

        JPanel content = new JPanel();
        content.setLayout(null);

        // setting positions and dimensions of everything
        saveRecordButton.setBounds(5, 60, 200, 50);

        this.setContentPane(content);
        this.setTitle("Record");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(800, 600);
        this.setVisible(true);
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
