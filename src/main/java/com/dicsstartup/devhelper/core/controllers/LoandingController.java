package com.dicsstartup.devhelper.core.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ProgressBar;

/**
 * FXML Controller class
 *
 * @author Didier Piracoca
 */
public class LoandingController implements Initializable {

    @FXML
    private ProgressBar progressBar;
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.progressBar= new ProgressBar();
        this.progressBar.setProgress(ProgressBar.INDETERMINATE_PROGRESS);
    }    
    
}
