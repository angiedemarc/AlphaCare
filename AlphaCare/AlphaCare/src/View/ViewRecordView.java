package View;

import Controller.EditRecordViewController;
import Model.Record;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ViewRecordView extends RecordView {

    private JButton editRecordButton;
    private JButton homeButton;

    public ViewRecordView() {
        super();
        viewRecordUI();
    }

    public ViewRecordView(Record medicalRecord) {
        super(medicalRecord);
        viewRecordUI();
    }

    private void viewRecordUI() {
        this.editRecordButton = new JButton("Edit Record");
        this.editRecordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchView();
            }
        });

        this.homeButton = new JButton("Home");
        this.homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainInterfaceView mainInterface = new MainInterfaceView();
                setVisible(false);
            }
        });

        JPanel content = new JPanel();
        content.setLayout(null);
        content.add(this.editRecordButton, this.homeButton);

        //setting positions and dimensions of everything
        editRecordButton.setBounds(5, 60, 200, 50);
        homeButton.setBounds(10, 10, 10, 10);

        this.setContentPane(content);
        this.setTitle("Record");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Scrolling
        JScrollPane scrollPane = new JScrollPane(content);
        // getContentPane().add(appointmentPanel);
        this.setContentPane(scrollPane);

        this.setSize(800, 600);
        this.setVisible(true);
    }

    protected void switchView() {
        EditRecordViewController editRecordViewController = new EditRecordViewController(medicalRecord);
        this.setVisible(false);
    }

    /**
     * Returns the medicalRecord associated with the view
     *
     * @return
     */
    @Override
    public Record getMedicalRecord() {
        return this.medicalRecord;
    }

    /**
     * Fills in medical info throughout the view Edits medicalRecordField to
     * reflect the medical record
     *
     * @param mr medical record to populate the view
     */
    public void enterMedicalInfo(Record mr) {
        this.medicalRecord = mr;
    }
}
