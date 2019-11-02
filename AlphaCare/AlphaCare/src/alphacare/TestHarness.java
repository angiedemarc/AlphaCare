/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;

import javax.sound.sampled.SourceDataLine;

import Controller.*;
import Model.*;

/**
 *
 * @author Genesis
 */
public class TestHarness {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Shows the functionality of the 'createRecord' which in turn can view a record
       // CreateRecordViewController createRecord = new CreateRecordViewController();
        // This tests to see the application work flow from the Login. It should display all of our view classes from just initially the login process. 
        LoginPageViewController loginPage = new LoginPageViewController(); // We have not yet added authentication functionality to the application yet!
        
        
        // Here, we will test to see the attributes in our model class. 

        System.out.println(loginPage.getTest().toString());
        //System.out.println(createRecord.getCreateRecordView().getMedicalRecord());
        
        for(Record r: SingletonRecordList.getInstance().getRecordList()){
            System.out.println("From the singleton class: " + r.getPatientName());
        }
        
    }
    
}
