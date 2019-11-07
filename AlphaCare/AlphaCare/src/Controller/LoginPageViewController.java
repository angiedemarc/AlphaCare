package Controller;

import Model.Account;
import Model.AccountList;
import View.LoginPageView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

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
    private AccountList accountList;

    public LoginPageViewController(AccountList list) {
        this.accountList = list;
        loginPageView = new LoginPageView();
        CreateTextfieldListeners();
        CreateButtonListeners();
    }

    private void CreateButtonListeners() {
        JButton login = loginPageView.getLoginButton();
        login.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("I logged in");

                //For authentication
                String password = String.valueOf(loginPageView.getPasswordField().getPassword());
                Account account = new Account(loginPageView.getUserNameField().getText(), password);

               // AccountList accList = new AccountList(); //should make this global?

                if (accountList.getAccountList().contains(account)) {
                    MainInterfaceViewController mainInterface = new MainInterfaceViewController();
                    loginPageView.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(loginPageView, "Incorrect username/password - try again");
                }
            }
        });
        JButton reg = loginPageView.getRegisterButton();
        reg.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreateAccountViewController registration = new CreateAccountViewController(accountList);
                loginPageView.setVisible(false);
            }
        });

    }

    private void CreateTextfieldListeners() {
        JTextField un = loginPageView.getUserNameField();
        un.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e);
            }
        });

        JTextField pass = loginPageView.getPasswordField();
        pass.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e);
            }
        });

    }

    public LoginPageView getLoginPageView() {
        return loginPageView;
    }

    public void setLoginPageView(LoginPageView loginPageView) {
        this.loginPageView = loginPageView;
    }

}
