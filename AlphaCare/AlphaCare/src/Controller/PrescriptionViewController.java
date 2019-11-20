package Controller;

import View.PrescriptionView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author angie
 */
public class PrescriptionViewController {

    private PrescriptionView prescriptionView;

    public PrescriptionViewController() {
        prescriptionView = new PrescriptionView();
        prescriptionView.setVisible(true);
        CreateSubmitButtonListener();
    }

    private void CreateSubmitButtonListener() {
        prescriptionView.getSubmitButton().addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Submit");
            }
        });
        
        prescriptionView.getCancelButton().addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prescriptionView.setVisible(false);
                new MainInterfaceViewController();
            }
        });
    }

}
