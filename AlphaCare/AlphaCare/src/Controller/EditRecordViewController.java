/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Account;
import Model.Caretaker;
import Model.Memento;
import Model.Originator;
import Model.Record;
import View.*;


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
    
}
