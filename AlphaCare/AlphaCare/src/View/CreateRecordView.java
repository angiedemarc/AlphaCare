package View;

import Controller.ViewRecordViewController;
import Model.Record;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreateRecordView extends EditableView {

    private static final long serialVersionUID = 1L;
    private JButton homeButton;
    private JButton createRecordButton;
    private boolean hasClicked;

    public CreateRecordView() {
        createRecordUI();
    }

    private void createRecordUI() {
        this.createRecordButton = new JButton("Create Record");

        this.homeButton = new JButton("Home");

         JPanel content = super.promptRecordInfo();

        // setting positions and dimensions of everything
        createRecordButton.setBounds(20, 60, 200, 50);
        homeButton.setBounds(1, 10, 50, 50);
        content.add(createRecordButton);
        content.add(homeButton);

        this.setContentPane(content);
        this.setTitle("Record");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(1000, 800);
        this.setVisible(true);
    }

    @Override
    public Record getMedicalRecord() {
        return medicalRecord;
    }

    public JButton getCreateRecordButton() {
        return this.createRecordButton;
    }

    public JButton getHomeButton() {
        return this.homeButton;
    }

    @Override
    protected void switchView() {
        if (saveInfo()) {
            hasClicked = true;
            ViewRecordViewController viewRecordViewController = new ViewRecordViewController(medicalRecord);
        } else {
            System.out.println("Must enter valid information to create record");
        }
    }
}
