package Controller;

import Model.Account;
import Model.PatientList;
import Model.Record;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author calvinho
 */
public class CreateRecordViewController {

    private CreateRecordView createRecordView;
    private Account test;

    public CreateRecordViewController() {
        this.createRecordView = new CreateRecordView();
        createButtonListeners();
    }

    public Account getTest() {
        return test;
    }

    public CreateRecordView getCreateRecordView() {
        return this.createRecordView;
    }

    private void createButtonListeners() {
        createRecordView.getCreateRecordButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (createRecordView.saveInfo()) {
                    Record record = createRecordView.getMedicalRecord();
                    PatientList patients = new PatientList();
                    if (!patients.editRecord(record)) {
                        JOptionPane.showMessageDialog(createRecordView, "Must have valid patient ID");
                    } else {

                        //patient's record has already been updated from if statement
                        patients.editRecord(record);

                        ViewRecordView view = new ViewRecordView(record);
                        createRecordView.setVisible(false);
                    }
                } else {
                    JOptionPane.showMessageDialog(createRecordView, "Make sure to enter all information");
                }
            }
        });
        createRecordView.getHomeButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainInterfaceViewController();
                createRecordView.setVisible(false);
            }
        });
    }

}
