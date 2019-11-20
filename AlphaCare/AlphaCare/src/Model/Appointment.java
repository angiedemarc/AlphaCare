/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Owner
 */
public class Appointment {
    private String fullName;
    private String birthDate;
    private int ssn;
    private String phoneNum;
    private String email;
    private String apptDate;
    private String symptoms;

    public Appointment(String fullName, String birthDate, int ssn, String phoneNum, String email, String apptDate, String symptoms) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.ssn = ssn;
        this.phoneNum = phoneNum;
        this.email = email;
        this.apptDate = apptDate;
        this.symptoms = symptoms;
    }

    public String getApptDate() {
        return apptDate;
    }

    public void setApptDate(String apptDate) {
        this.apptDate = apptDate;
    }
    

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getSsn() {
        return this.ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSymptoms() {
        return this.symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    @Override
    public String toString() {
        return "Name: " + this.fullName + ", DOB: " + this.birthDate + ", SSN: " + this.ssn + ", Phone Number: " + this.phoneNum + 
                ", E-mail: " + this.email + ", Symptoms: " + this. symptoms;
    }
    
    
    
}
