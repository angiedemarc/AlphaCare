package Model;

import java.util.ArrayList;

/**
 *
 * @author Genesis
 * I used this resource to help me structure this class:
 * https://stackoverflow.com/questions/40152454/arraylist-initialized-accessed-using-singleton-class
 */
public class SingletonRecordList {

    private static SingletonRecordList instance;
    private ArrayList<Record> recordList = null;

    /**
     *
     * Constructor automatically creates ArrayList of records
     */
    private SingletonRecordList() {
        recordList = new ArrayList<>();
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
     * Method used to access single instance of this class globally
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
     * Method used to access ArrayList of records through the single instance of this class
     *
     * @return recordList
     */
    public ArrayList<Record> getRecordList() {
        return this.recordList;
    }

    /**
     *
     * Method that adds a new record to the ArrayList of records using the single instance of this class
     * @param newRecord
     */
    public void add(Record newRecord) {
        recordList.add(newRecord);
    }
}
