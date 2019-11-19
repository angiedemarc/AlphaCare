package Controller;

import Model.Account;
import Model.AccountList;
import View.CreateAccountView;
import View.LoginPageView;
import Controller.LoginPageViewController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.collections.ObservableList;
import javax.swing.JButton;
import javax.swing.JOptionPane;

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
    private AccountList list;
    //private ObservableList<Account> listOfAccounts;

    public CreateAccountViewController(AccountList acct) {
        createAccountView = new CreateAccountView();
        this.list = acct;
       // listOfAccounts = PersistentDataCntl.getPersistentDataCntl().getPeristentDataCollection().getAccountList().getAccountData();
        CreateSubmitButtonListener();
    }

    private void CreateSubmitButtonListener() {
        JButton submit = createAccountView.getSubmitButton();
        submit.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // System.out.println("Testing: Submission sent!");

                String username = String.valueOf(createAccountView.getUserField().getText());
                String password = String.valueOf(createAccountView.getPassField().getPassword());
                String confirmPass = String.valueOf(createAccountView.getConfirmPassField().getPassword());
                String role = String.valueOf(createAccountView.getRoleSelection().getSelectedItem().toString());
                String firstName = String.valueOf(createAccountView.getFirstNameField().getText());
                String lastName = String.valueOf(createAccountView.getLastNameField().getText());

                System.out.println("userField: " + username + "passField: " + password + "confirmPass: " + confirmPass);
                if (username == null || password == null
                        || !password.equals(confirmPass)) {
                    JOptionPane.showMessageDialog(createAccountView,
                            "Something went wrong! Try re-entering username/password");
                } else {
                    Account account = new Account(username, password, role, firstName, lastName);
    
                    list.addAccount(account);
                    
                    LoginPageViewController loginPageCntl = new LoginPageViewController(list);
                    loginPageCntl.getLoginPageView();
                    
                    createAccountView.setVisible(false);
                }
                //loginPage.setVisible(true);
            }
        });
    }

    public void addCreateAccountViewController() {
      //  this.createAccountView = createAccountView;
    }

    public CreateAccountView getCreateAccountView() {
        return createAccountView;
    }

}
