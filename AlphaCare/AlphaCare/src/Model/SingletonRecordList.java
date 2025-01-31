package Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Genesis
 * 
 * I used this resource to help me structure this class:
 * https://stackoverflow.com/questions/40152454/arraylist-initialized-accessed-using-singleton-class
 * 
 */
public class SingletonRecordList implements Serializable {

    public void setRecordList(ArrayList<Record> recordList) {
        this.recordList = recordList;
    }

    private static SingletonRecordList instance;
    private ArrayList<Record> recordList = null;

    /**
     *
     * Empty constructor automatically creates ArrayList of records
     */
    public SingletonRecordList() {
        this.recordList = new ArrayList<>();
        createRecords();
    }

    /**
     *
     *This method populates the ArrayList of records
     */
    public void createRecords() {
        this.getRecordList().add(new Record());
        this.getRecordList().add(new Record());
        this.getRecordList().add(new Record());
        this.getRecordList().add(new Record(1, "Sammy Jones", 456789087, "9087 Nowhere Avenue", "AZ", "diabetic", "cardiovascular disease",
                "Allegra", "allergy shots"));
        this.getRecordList().add(new Record(2, "Genesis DuBon", 567893456, "10 Disappointment Street", "FL", "healthy", "diabetes",
                "none", "Claritin"));
    }

    /**
     *
     * This method is used to access the single instance of this class globally
     *
     * @return instance
     */
    public static SingletonRecordList getInstance() {
        if (instance == null) {
            instance = new SingletonRecordList();
        }

        return instance;
    }

    /**
     *
     * This method is used to access the ArrayList of records through the single instance of this class
     *
     * @return recordList
     */
    public ArrayList<Record> getRecordList() {
        return this.recordList;
    }

    /**
     *
     * This method adds a new record to the ArrayList of records using the single instance of this class
     * @param newRecord
     */
    public void add(Record newRecord) {
        this.getRecordList().add(newRecord);
    }
    
    public Record getRecord(int patientId){
        for (Record r: this.recordList){
            if (r.getPatientId() == patientId){
                return r;
            }
        }
        return new Record();
    }
}
