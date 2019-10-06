package Controller;

import View.MainInterfaceView;
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
public class MainInterfaceViewController {
    
    private MainInterfaceView mainInterfaceView;

    public MainInterfaceViewController() {
        mainInterfaceView = new MainInterfaceView();
    }

    public MainInterfaceView getMainInterfaceView() {
        return mainInterfaceView;
    }

    public void setMainInterfaceView(MainInterfaceView mainInterfaceView) {
        this.mainInterfaceView = mainInterfaceView;
    }
    
}

