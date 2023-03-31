package Start;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author MUON
 */
public class StartController implements Initializable {
    @FXML Button startButton, exitButton;
    @FXML ImageView staff;
   
   @FXML public void startTitlePage(ActionEvent event) throws IOException {
 
            Node node = (Node) event.getSource();
            Scene currentScene = node.getScene();
            Stage currentStage = (Stage) currentScene.getWindow();

            Parent root = FXMLLoader.load(getClass().getResource("/Start/Main.fxml"));

            Scene mainScene = new Scene (root);
            currentStage.hide();
            currentStage.setScene(mainScene);
            currentStage.setTitle("Main");
            currentStage.show();
            
            System.out.println("is working" );}
   
    @FXML private void exitTitlePage(ActionEvent e) {
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }
    
    @FXML public void greeting() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Important Message");
        alert.setHeaderText("Hey! I'm Ana!");
        alert.setContentText("Welcome to the New Beginnings Cafe!");

        alert.showAndWait();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
