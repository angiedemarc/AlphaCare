/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Owner
 */
public class SingletonRecordList {

    private static SingletonRecordList instance;
    private ArrayList<Record> recordList = null;

    public static SingletonRecordList getInstance() {
        if (instance == null) {
            instance = new SingletonRecordList();
        }

        return instance;
    }

    private SingletonRecordList() {
        recordList = new ArrayList<>();
        createRecords();
    }

    public ArrayList<Record> getRecordList() {
        return this.recordList;
    }

    public void createRecords() {
        this.recordList.add(new Record());
        this.recordList.add(new Record());
        this.recordList.add(new Record());
        this.recordList.add(new Record("Sammy Jones", 456789087, "9087 Nowhere Avenue", "AZ", "diabetic", "cardiovascular disease",
                "Allegra", "allergy shots"));
        this.recordList.add(new Record("Genesis DuBon", 567893456, "10 Disappointment Street", "FL", "healthy", "diabetes",
                "none", "Claritin"));
    }
    //Add element to array

    public void add(Record newRecord) {
        recordList.add(newRecord);
    }
}
