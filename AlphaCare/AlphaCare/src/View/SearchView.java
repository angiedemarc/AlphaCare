/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

/**
 *
 * @author Joey
 */
public class SearchView extends JFrame {
    private JPanel searchPanel;
    private JPanel buttonPanel;
    private JLabel resultLabel;
    private JList resultsList;
    private JButton viewRecordButton;
    private JButton cancelButton;
    
    public SearchView(){
        searchUI();
    }
    
    private void searchUI(){
        setTitle("Search Results");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setViewRecordButton(new JButton("View Record"));
        viewRecordButton.setEnabled(false);
        
        setCancelButton(new JButton("Cancel"));
        
        setResultLabel(new JLabel());
        
        searchPanel = new JPanel(new BorderLayout());
        
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(getViewRecordButton());
        buttonPanel.add(getCancelButton());
        
        searchPanel.add(getResultLabel(), BorderLayout.NORTH);
        searchPanel.add(buttonPanel, BorderLayout.SOUTH);
        
        getContentPane().add(searchPanel);
        
        setVisible(true);
    }
    
    public void setViewRecordButton(JButton viewRecordButton){
        this.viewRecordButton = viewRecordButton;
    }
    
    public JButton getViewRecordButton(){
        return viewRecordButton;
    }
    
    public void setCancelButton(JButton cancelButton){
        this.cancelButton = cancelButton;
    }
    
    public JButton getCancelButton(){
        return cancelButton;
    }
    
    public void setResultsList(JList resultsList){
        this.resultsList = resultsList;
    }
    
    public JList getResultsList(){
        return resultsList;
    }
    
    public void setResultLabel(JLabel resultLabel){
        this.resultLabel = resultLabel;
    }
    
    public JLabel getResultLabel(){
        return resultLabel;
    }
    
    public void setSearchPanel(JPanel searchPanel){
        this.searchPanel = searchPanel;
    }
    
    public JPanel getSearchPanel(){
        return searchPanel;
    }
}
