/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author angie
 */
public class Prescription {
    private int patientId;
    private String fName;
    private String lName;
    private int age;
    private String gender;
    private String address;
    private String hospitalName;
    private int amountTakenInADay;
    private int daysTakenInAWeek;
    private int quantityTaken;
    private String overdoseWarnings;

    public Prescription(int patientId, String fName, String lName, int age, String gender, String address, String hospitalName, int amountTakenInADay, int daysTakenInAWeek, int quantityTaken, String overdoseWarnings) {
        this.patientId = patientId;
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.gender = gender;
        this.address = address;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
    
}
