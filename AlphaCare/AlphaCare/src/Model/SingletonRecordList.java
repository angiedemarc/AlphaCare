package Model;

import java.util.ArrayList;

/**
 *
 * @author Genesis
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
     * Method that will be used to access the single instance of this class
     * globally
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
     * Method that will be used to access ArrayList of records using the single
     * instance of this class
     *
     * @return recordList
     */
    public ArrayList<Record> getRecordList() {
        return this.recordList;
    }

    /**
     *
     * Method that adds new records to the list of records
     * @param newRecord
     */
    public void add(Record newRecord) {
        recordList.add(newRecord);
    }
}
