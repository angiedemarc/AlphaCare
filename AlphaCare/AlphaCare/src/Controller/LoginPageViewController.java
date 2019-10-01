package Controller;

import View.LoginPageView;
import Model.Record;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author calvinho
 */
public class LoginPageViewController {
    
     // Attributes in order to develop controller for the LoginPageViewController.
    private LoginPageView loginPageView;
    private Record model;
    
    // Constructor for LoginPageViewController.
    public LoginPageViewController(LoginPageView loginPageView, Record model) {
        this.loginPageView = loginPageView;
        this.model = model;
        // Method in order to add createRecordView to the controller class. 
        addLoginPageView();
    }
    // Added view to the controller class. 
    public void addLoginPageView() {
        this.loginPageView = new LoginPageView();
    }
    
}
