package Controller;

import Model.Account;
import Model.Caretaker;
import Model.Memento;
import Model.Originator;
import Model.Record;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author calvinho
 */
public class EditRecordViewController {
    
     private EditRecordView editRecordView;
     private Account test;
     private Memento memento;
     private Originator originator;
     private Caretaker caretaker;

    public Account getTest() {
        return test;
    }

    public void setTest(Account test) {
        this.test = test;
    }
    
    public EditRecordViewController(Record medicalRecord) {
        EditRecordView editRecordView = new EditRecordView(medicalRecord, this);
    }

    public void setEditRecordView(EditRecordView editRecordView) {
        this.editRecordView = editRecordView;
    }

    public EditRecordView getEditRecordView() {
        return editRecordView;
    }
    
        public Memento getMemento(){
        return memento;
    }
    
    public void setMemento(Memento mem){
        this.memento = mem;
    }
    
    public Originator getOriginator(){
        return originator;
    }
    
    public void setOriginator(Originator origin){
        this.originator = origin;
    }
    
    public Caretaker getCaretaker(){
        return caretaker;
    }
    
    public void setCaretaker(Caretaker ct){
        this.caretaker = ct;
    }
    
    private void createButtonListeners(){
        editRecordView.getRedoButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent even) {
                if ((editRecordView.getSavedInfoIndex() - 1) > editRecordView.getCurrentInfoIndex()) {
                    editRecordView.setCurrentInfoIndex(editRecordView.getCurrentInfoIndex()+1);

                    String textBoxString = originator.restoreFromMemento(caretaker.getMemento(editRecordView.getCurrentInfoIndex()));

                    editRecordView.getTextArea().setText(textBoxString);

                    editRecordView.getUndoButton().setEnabled(true);
                } else {
                    editRecordView.getRedoButton().setEnabled(false);
                }
            }
        });
        editRecordView.getUndoButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent eve) {
                if (editRecordView.getCurrentInfoIndex() >= 1) {
                    editRecordView.setCurrentInfoIndex(editRecordView.getCurrentInfoIndex()-1);

                    String textString = originator.restoreFromMemento(caretaker.getMemento(editRecordView.getCurrentInfoIndex()));

                    editRecordView.getTextArea().setText(textString);

                    editRecordView.getRedoButton().setEnabled(true);
                } else {
                    editRecordView.getUndoButton().setEnabled(false);
                }
            }
        });
        editRecordView.getSaveButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                String textInTextArea = editRecordView.getTextArea().getText();

                originator.set(textInTextArea);

                caretaker.addMemento(originator.storeInMemento());

                editRecordView.setSavedInfoIndex(editRecordView.getSavedInfoIndex()+1);
                editRecordView.setCurrentInfoIndex(editRecordView.getCurrentInfoIndex()+1);

                System.out.println("Saved Edits #" + editRecordView.getSavedInfoIndex());

                editRecordView.getUndoButton().setEnabled(true);
            }
        });
        editRecordView.getCont().getEditRecordView().getHomeButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainInterfaceView mainInterface = new MainInterfaceView();
                editRecordView.setVisible(false);
            }
        });
        editRecordView.getSaveRecordButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editRecordView.switchView();
            }
        });
    }
    
}
