package View;

import Controller.EditRecordViewController;
import Controller.ViewRecordViewController;
import Model.Caretaker;
import Model.Originator;
import Model.Record;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
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
    private Caretaker caretaker = cont.getCaretaker();
    private Originator originator = cont.getOriginator();

    private int savedInfoIndex = 0;
    private int currentInfoIndex = 0;

    public EditRecordView() {
        super();
        editRecordUI();
    }

    public EditRecordView(Record medicalRecord, EditRecordViewController cont) {
        super(medicalRecord);
        editRecordUI();
        this.cont = cont;
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
        JPanel content = promptRecordInfo();

        // setting positions and dimensions of everything
        saveRecordButton.setBounds(5, 60, 200, 50);
        homeButton.setBounds(40, 80, 10, 50);
        textArea.setBounds(50, 90, 20, 60);
        saveButton.setBounds(60, 100, 30, 70);
        undoButton.setBounds(70, 110, 40, 80);
        redoButton.setBounds(80, 120, 50, 90);

        this.setContentPane(content);
        this.setTitle("Record");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JScrollPane scrollPane = new JScrollPane(content);
        // getContentPane().add(appointmentPanel);
        getContentPane().add(scrollPane);

        this.setSize(800, 600);
        this.setVisible(true);
    }

    @Override
    public void switchView() {
        ViewRecordViewController viewRecordViewController = new ViewRecordViewController(medicalRecord);
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
