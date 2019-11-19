/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
                System.out.println("SUBMIT");
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
