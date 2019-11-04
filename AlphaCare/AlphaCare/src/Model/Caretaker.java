/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Joey
 */
public class Caretaker {
    ArrayList<Memento> savedInformation = new ArrayList<Memento>();
    
    public void addMemento(Memento info){
        savedInformation.add(info);
    }
    
    public Memento getMemento(int index){
        return savedInformation.get(index);
    }
}
