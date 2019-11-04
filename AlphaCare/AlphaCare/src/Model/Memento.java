/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Joey
 */
public class Memento {
    private String info;
    
    public Memento(String mementoInfo){
        this.info = mementoInfo;
    }
    
    public String getSavedInfo(){
        return this.info;
    }
}
