package Controller;

import Model.Patient;
import Model.PatientList;
import Model.Prescription;
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
                int patientId = Integer.parseInt(prescriptionView.getPatientIdField().getText());
                String fName = prescriptionView.getfNameField().getText();
                String lName = prescriptionView.getlNameField().getText();
                String hospitalName = prescriptionView.getHospitalNameField().getText();
                int amountTakenInADay = Integer.parseInt(prescriptionView.getAmountTakenInADayField().getText());
                int daysTakenInAWeek = Integer.parseInt(prescriptionView.getDaysTakenInAWeekSelection().getSelectedItem().toString());
                int quantityTaken = Integer.parseInt(prescriptionView.getQuantityTakenField().getText());
                String overdoseWarnings = prescriptionView.getOverdoseWarningsArea().getText();
                Prescription newPrs = new Prescription(patientId, fName, lName, hospitalName, amountTakenInADay, daysTakenInAWeek, quantityTaken, overdoseWarnings);

                PatientList patients = new PatientList();
                Patient p = patients.getPatient(patientId);
                p.addPrescription(newPrs);
                patients.editPatient(p);
                
                //System.out.println("Added prescription: " + newPrs);
                //System.out.println("Check that it works: " + patients.getPatient(patientId).toString());
                
                prescriptionView.setVisible(false);
                new MainInterfaceViewController();
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
