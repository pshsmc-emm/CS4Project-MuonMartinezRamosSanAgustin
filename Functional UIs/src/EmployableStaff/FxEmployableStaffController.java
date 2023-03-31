/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployableStaff;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author MUON
 */
public class FxEmployableStaffController implements Initializable {

    @FXML Button staffExitButton;
    @FXML public void exitStaff(ActionEvent event) throws IOException {
 
            Node node = (Node) event.getSource();
            Scene currentScene = node.getScene();
            Stage currentStage = (Stage) currentScene.getWindow();

            Parent root = FXMLLoader.load(getClass().getResource("/Start/Main.fxml"));

            Scene mainScene = new Scene (root);
            currentStage.hide();
            currentStage.setScene(mainScene);
            currentStage.setTitle("Main");
            currentStage.show();
            
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
