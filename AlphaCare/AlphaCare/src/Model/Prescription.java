package Model;

/**
 *
 * @author angie
 */
public class Prescription {
    private int patientId;
    private String fName;
    private String lName;
    private String hospitalName;
    private int amountTakenInADay;
    private int daysTakenInAWeek;
    private int quantityTaken;
    private String overdoseWarnings;

    public Prescription(int patientId, String fName, String lName, String hospitalName, int amountTakenInADay, int daysTakenInAWeek, int quantityTaken, String overdoseWarnings) {
        this.patientId = patientId;
        this.fName = fName;
        this.lName = lName;
        this.hospitalName = hospitalName;
        this.amountTakenInADay = amountTakenInADay;
        this.daysTakenInAWeek = daysTakenInAWeek;
        this.quantityTaken = quantityTaken;
        this.overdoseWarnings = overdoseWarnings;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public int getAmountTakenInADay() {
        return amountTakenInADay;
    }

    public void setAmountTakenInADay(int amountTakenInADay) {
        this.amountTakenInADay = amountTakenInADay;
    }

    public int getDaysTakenInAWeek() {
        return daysTakenInAWeek;
    }

    public void setDaysTakenInAWeek(int daysTakenInAWeek) {
        this.daysTakenInAWeek = daysTakenInAWeek;
    }

    public int getQuantityTaken() {
        return quantityTaken;
    }

    public void setQuantityTaken(int quantityTaken) {
        this.quantityTaken = quantityTaken;
    }

    public String getOverdoseWarnings() {
        return overdoseWarnings;
    }

    public void setOverdoseWarnings(String overdoseWarnings) {
        this.overdoseWarnings = overdoseWarnings;
    }

    @Override
    public String toString() {
        return "Prescription " + "patientId: " + patientId + " fName: " + fName + ", lName=" + lName + ", hospitalName=" + hospitalName + ", amountTakenInADay=" + amountTakenInADay + ", daysTakenInAWeek=" + daysTakenInAWeek + ", quantityTaken=" + quantityTaken + ", overdoseWarnings=" + overdoseWarnings;
    }
    
}
