/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Genesis
 */
public class RecordList {

    private ArrayList<Record> recordList;

    /**
     *
     * Empty constructor that automatically creates ArrayList of records
     */
    public RecordList() {
        this.recordList = new ArrayList<>();
        createRecords();
    }

    /**
     *
     * Method that populates ArrayList of records
     */
    public void createRecords() {
        this.recordList.add(new Record());
        this.recordList.add(new Record());
        this.recordList.add(new Record());
        this.recordList.add(new Record("Sammy Jones", 456789087, "9087 Nowhere Avenue", "AZ", "diabetic", "cardiovascular disease",
                "Allegra", "allergy shots"));
        this.recordList.add(new Record("Genesis DuBon", 567893456, "10 Disappointment Street", "FL", "healthy", "diabetes",
                "none", "Claritin"));
    }

    /**
     *
     * getter for ArrayList of records
     *
     * @return recordList
     */
    public ArrayList<Record> getRecordList() {
        return recordList;
    }

     /**
     *
     * setter for ArrayList of records
     *
     * @param recordList
     */
    public void setRecordList(ArrayList<Record> recordList) {
        this.recordList = recordList;
    }

}
