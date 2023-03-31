/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package TableStatus;

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
 *
 * @author Basti San Agustin
 */
public class TableStatusController implements Initializable {
   
    @FXML Button tableStatusExitButton;
    @FXML public void exitTableStatus(ActionEvent event) throws IOException {
 
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
