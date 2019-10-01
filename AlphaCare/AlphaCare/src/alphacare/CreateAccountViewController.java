package alphacare;



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
    
      // Attributes in order to develop controller for the LoginPageViewController.
    private CreateAccountView createAccountView;
    private Record model;
    
    // Constructor for LoginPageViewController.
    public CreateAccountViewController(CreateAccountView createAccountView, Record model) {
        this.createAccountView = createAccountView;
        this.model = model;
        // Method in order to add createRecordView to the controller class. 
        addCreateAccountView();
    }
    // Added view to the controller class. 
    public void addCreateAccountView() {
        this.createAccountView = new CreateAccountView();
    }
    
}

    

