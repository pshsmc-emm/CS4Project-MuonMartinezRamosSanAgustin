/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.Event;
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
public class StartController implements Initializable {
    @FXML  Button startButton;
    @FXML private void start(Event event) throws IOException {
        try {
            Node node = (Node) event.getSource();
            Scene currentScene = node.getScene();
            Stage currentStage = (Stage) currentScene.getWindow();

            Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));

            Scene subjectScene = new Scene (root);
            currentStage.hide();
            currentStage.setScene(subjectScene);
            currentStage.show();
        } 
        catch (Exception e) {
            System.out.println("Main screen not found.");            
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
