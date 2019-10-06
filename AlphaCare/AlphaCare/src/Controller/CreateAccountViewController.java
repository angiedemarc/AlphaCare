package Controller;

import View.CreateAccountView;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author calvinho
 */
public class CreateAccountViewController {
    
    private CreateAccountView createAccountView;
    
    public CreateAccountViewController() {
        CreateAccountView createAccountView = new CreateAccountView();
    }
    
    public void addCreateAccountViewController() {
        this.createAccountView = createAccountView;
    }

    public CreateAccountView getCreateAccountView() {
        return createAccountView;
    }
    
}

    

