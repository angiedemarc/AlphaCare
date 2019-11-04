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
public class Originator {
    private String info;
    
    public void set(String currentInfo){
        System.out.println("From Originator: Current Version of the information \n" + currentInfo + "\n");
        
        this.info = currentInfo;
    }
    
    public Memento storeInMemento(){
        System.out.println("From Originator: Saving to Memento");
        
        return new Memento(info);
    }
    
    public String restoreFromMemento(Memento mementoInfo){
        info = mementoInfo.getSavedInfo();
        
        System.out.println("From Originator: Previous information saved in Memento \n" + info + "\n");
        
        return info;
    }
}
