
public class MedicalRecord {
    private String firstName;
    private String lastName;
    private int age;
    private ArrayList<String> habits; // ex smoking, exercise, diet
    private ArrayList<String> immunizationRecords;
    private ArrayList<String> allergies;
    private ArrayList<String, Date> operations;

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<String> getHabits()

    {
    	return this.habits;
    }
    public void setHabits (ArrayList<String> habits)
    {
    	this.habits = habits;
    }

    public ArrayList<String> getImmunizationRecords() {
        return this.immunizationRecords;
    }

    public void setImmunizationRecords(ArrayList<String> immunizationRecords) {
        this.immunizationRecords = immunizationRecords;
    }

    public ArrayList<String> getAllergies() {
        return this.allergies;
    }

    public void setAllergies(ArrayList<String> allergies) {
        this.allergies = allergies;
    }

    public ArrayList<String, Date> getOperations()

    {
    	return this.operations;
    }
    public void setOperations (ArrayList<String,Date> operations)
    {
    	this.operations = operations;
    }

}