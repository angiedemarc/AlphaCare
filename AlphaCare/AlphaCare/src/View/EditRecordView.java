package View;

import Controller.EditRecordViewController;
import Controller.ViewRecordViewController;
import Model.Caretaker;
import Model.Originator;
import Model.Record;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.UndoManager;

public class EditRecordView extends EditableView {

    private JButton saveRecordButton;
    private JButton homeButton;
//    private UndoManager undoManager;
    private JButton saveButton;
    private JButton undoButton;
    private JButton redoButton;
    private JTextArea textArea; //Demonstration purposes
    private JTextField textField; //Demonstration Purposes
    private EditRecordViewController cont;
    private Caretaker caretaker;
    private Originator originator;

    private int savedInfoIndex = 0;
    private int currentInfoIndex = 0;

    public EditRecordView() {
        super();
        editRecordUI();
    }

    public EditRecordView(Record medicalRecord, EditRecordViewController cont) {
        super(medicalRecord);
        this.cont = cont;
        this.caretaker = cont.getCaretaker();
        this.originator = cont.getOriginator();
        editRecordUI();
    }

    private void editRecordUI() {
        this.saveRecordButton = new JButton("Save Record");

        this.homeButton = new JButton("Home");

        this.textArea = new JTextArea(40, 60);

        this.saveButton = new JButton("Save Edits");

        this.undoButton = new JButton("Undo");

        this.redoButton = new JButton("Redo");

//        this.undoManager = new UndoManager();
//Undo functionality with UndoManager
//        this.textArea.getDocument().addUndoableEditListener(new UndoableEditListener() {
//            public void undoableEditHappened(UndoableEditEvent e) {
//                undoManager.addEdit(e.getEdit());
//                updateButtons();
//            }
//        });
        JPanel content = new JPanel();
        //TODO put all this in a spring layout
        GridLayout grid = new GridLayout(0, 1);
        content.setLayout(grid);

        patientId = new JLabel("Patient Id: ");
        patientIdEntry = new JTextField(String.valueOf(medicalRecord.getPatientId()));

        name = new JLabel("Name: ");
        nameEntry = new JTextField(medicalRecord.getPatientName());
        

        ssn = new JLabel("SSN: ");
        ssnEntry1 = new JTextField(16);


        ssnEntry1 = new JTextField(String.valueOf(medicalRecord.getSsn()));
            
        address = new JLabel("Address: ");
        addressEntry1 = new JTextField(medicalRecord.getAddress());
        
        
        // Why are we using this? Just a question!
        addressEntry2 = new JTextField(20);

        state = new JLabel("State: ");
        stateEntry = new JTextField(medicalRecord.getState());


        medicalHistory = new JLabel("Medical History: ");
        medicalHistoryEntry = new JTextField(medicalRecord.getMedicalHistory());



        familyMedicalHistory = new JLabel("Family Medical History: ");
        familyMedicalHistoryEntry = new JTextField(medicalRecord.getFamilyMedicalHistory());

        medicationHistory = new JLabel("Medication History: ");
        medicationHistoryEntry = new JTextField(medicalRecord.getMedicationHistory());

        treatmentHistory = new JLabel("Treatment History: ");
        treatmentHistoryEntry = new JTextField(medicalRecord.getTreatmentHistory());


        content.add(patientId);
        content.add(patientIdEntry);

        content.add(name);
        content.add(nameEntry);

        content.add(ssn);
        content.add(ssnEntry1);

        content.add(address);
        content.add(addressEntry1);
        content.add(addressEntry2);

        content.add(state);
        content.add(stateEntry);

        content.add(medicalHistory);
        content.add(medicalHistoryEntry);

        content.add(familyMedicalHistory);
        content.add(familyMedicalHistoryEntry);

        content.add(medicationHistory);
        content.add(medicationHistoryEntry);

        content.add(treatmentHistory);
        content.add(treatmentHistoryEntry);

        // Setting the buttons inside of the EditRecordView.
        content.add(saveRecordButton);
        content.add(homeButton);

        this.setContentPane(content);
        this.setTitle("Record");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /* 
        This is the line where we're getting the error - didn't want to delete Angie's class so I had to add it based on the panel from Editable 
        Was able to fix it but now receiving an error with the listeners inside of the controller, currently implemented a temporary fix but will fix this!
        */
        
        homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                goHome();
            }
        });
        
        saveRecordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchView();
            }
        });

        this.setSize(800, 600);
        this.setVisible(true);
    }

    @Override
    public void switchView() {
        
        medicalRecord.setPatientId(Integer.parseInt(patientIdEntry.getText()));
        medicalRecord.setPatientName(nameEntry.getText());
        medicalRecord.setSsn(Integer.parseInt(ssnEntry1.getText()));
        medicalRecord.setAddress(addressEntry1.getText());
        medicalRecord.setState(stateEntry.getText());
        medicalRecord.setMedicalHistory(medicalHistoryEntry.getText());
        medicalRecord.setFamilyMedicalHistory(familyMedicalHistoryEntry.getText());
        medicalRecord.setMedicationHistory(medicationHistoryEntry.getText());
        medicalRecord.setTreatmentHistory(treatmentHistoryEntry.getText());
        ViewRecordViewController viewRecordViewController = new ViewRecordViewController(medicalRecord);
        this.setVisible(false);
    }
    
    public void goHome() { 
        MainInterfaceView mainInterface = new MainInterfaceView();
        this.setVisible(false);
    }

    
    
//Undo functionality using UndoManager    
//    public void updateButtons(){
//        undoButton.setText(undoManager.getUndoPresentationName());
//        undoButton.setEnabled(undoManager.canUndo());
//    }

    public JButton getSaveRecordButton() {
        return saveRecordButton;
    }

    public void setSaveRecordButton(JButton saveRecordButton) {
        this.saveRecordButton = saveRecordButton;
    }

    public JButton getHomeButton() {
        return homeButton;
    }

    public void setHomeButton(JButton homeButton) {
        this.homeButton = homeButton;
    }

    public JButton getSaveButton() {
        return saveButton;
    }

    public void setSaveButton(JButton saveButton) {
        this.saveButton = saveButton;
    }

    public JButton getUndoButton() {
        return undoButton;
    }

    public void setUndoButton(JButton undoButton) {
        this.undoButton = undoButton;
    }

    public JButton getRedoButton() {
        return redoButton;
    }

    public void setRedoButton(JButton redoButton) {
        this.redoButton = redoButton;
    }

    public JTextArea getTextArea() {
        return textArea;
    }

    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }

    public JTextField getTextField() {
        return textField;
    }

    public void setTextField(JTextField textField) {
        this.textField = textField;
    }

    public EditRecordViewController getCont() {
        return cont;
    }

    public void setCont(EditRecordViewController cont) {
        this.cont = cont;
    }

    public Caretaker getCaretaker() {
        return caretaker;
    }

    public void setCaretaker(Caretaker caretaker) {
        this.caretaker = caretaker;
    }

    public Originator getOriginator() {
        return originator;
    }

    public void setOriginator(Originator originator) {
        this.originator = originator;
    }

    public int getSavedInfoIndex() {
        return savedInfoIndex;
    }

    public void setSavedInfoIndex(int savedInfoIndex) {
        this.savedInfoIndex = savedInfoIndex;
    }

    public int getCurrentInfoIndex() {
        return currentInfoIndex;
    }

    public void setCurrentInfoIndex(int currentInfoIndex) {
        this.currentInfoIndex = currentInfoIndex;
    }
}
