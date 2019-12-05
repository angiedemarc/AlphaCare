/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AccountList;
import View.SearchView;
import View.ViewRecordView;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Joey
 */
public class SearchViewController {
    private SearchView searchView;
    private AccountList accountList;
    private String searchedAttribute;
    private JList list;
    
    public SearchViewController(String searchedAttribute) {
        this.searchView = new SearchView();
        accountList = new AccountList();
        this.searchedAttribute = searchedAttribute;
        list = searchView.getResultsList();
        populateResultList(list);
        CreateButtonListeners();
    }
    
    private void populateResultList(JList resultsList){
        searchView.getResultLabel().setText("Showing username results for " + "\"" + searchedAttribute + "\"");
        
        DefaultListModel<String> model = new DefaultListModel<>();
        for(int i = 0; i < accountList.getAccountList().size(); i++){
            if(searchedAttribute.equalsIgnoreCase(accountList.getAccountList().get(i).getUserName())){
                model.addElement(accountList.getAccountList().get(i).getUserName() + ", " + accountList.getAccountList().get(i).getRole());
            }
        }
        
        resultsList = new JList(model);
        resultsList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        resultsList.setLayoutOrientation(JList.VERTICAL);
        resultsList.setVisibleRowCount(-1);
        
        searchView.getSearchPanel().add(resultsList, BorderLayout.CENTER);
        
        resultsList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e){
                searchView.getViewRecordButton().setEnabled(true);
            }
        });
    }
    
    private void CreateButtonListeners(){
        JButton viewRecord = searchView.getViewRecordButton();
        viewRecord.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                ViewRecordView recordView = new ViewRecordView();
                searchView.setVisible(false);
            }
        });
        
        JButton cancel = searchView.getCancelButton();
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                MainInterfaceViewController mainInterface = new MainInterfaceViewController();
                searchView.setVisible(false);
            }
        });
    }
    
    public void setSearchView(SearchView searchView){
        this.searchView = searchView;
    }
    
    public SearchView getSearchView() {
        return searchView;
    }
}
