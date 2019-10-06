package Controller;

import Model.Account;
import View.LoginPageView;
import Model.Record;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author calvinho
 */
public class LoginPageViewController implements ActionListener {
    
    private LoginPageView loginPageView;
    private Account test;

    public LoginPageViewController() {
        loginPageView = new LoginPageView();
        loginPageView.addLoginListener(this);
        loginPageView.addRegisterListener(this);
        ArrayList<String> permissions = new ArrayList<String>();
        permissions.add("Test");
        permissions.add("Test1");
        permissions.add("Test2");
        test = new Account("Test", "Password", "Patient", permissions);
    }

    public LoginPageView getLoginPageView() {
        return loginPageView;
    }

    public void setLoginPageView(LoginPageView loginPageView) {
        this.loginPageView = loginPageView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginPageView.getLoginButton()) {
            MainInterfaceViewController main = new MainInterfaceViewController();
        }
        else if (e.getSource() == loginPageView.getRegisterButton()) {
            CreateAccountViewController registration = new CreateAccountViewController();
        }
        else {
            System.out.println("Test has failed!");
        }
    }
    
     public Account getTest() {
        return test;
    }
    
}
