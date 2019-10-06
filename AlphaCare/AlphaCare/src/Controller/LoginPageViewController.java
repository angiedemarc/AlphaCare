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
    
    private LoginPageView loginPageView;

    public LoginPageViewController() {
        loginPageView = new LoginPageView();
    }

    public LoginPageView getLoginPageView() {
        return loginPageView;
    }

    public void setLoginPageView(LoginPageView loginPageView) {
        this.loginPageView = loginPageView;
    }
    
}
