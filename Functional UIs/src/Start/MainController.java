package Start;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class MainController implements Initializable {
    @FXML Button menuStartButton;
    @FXML public void startMenu(ActionEvent event) throws IOException {
 
            Node node = (Node) event.getSource();
            Scene currentScene = node.getScene();
            Stage currentStage = (Stage) currentScene.getWindow();

            Parent root = FXMLLoader.load(getClass().getResource("/Menu/Menu.fxml"));

            Scene mainScene = new Scene (root);
            currentStage.hide();
            currentStage.setScene(mainScene);
            currentStage.setTitle("Menu");
            currentStage.show();
    }
    
    @FXML Button staffStartButton;
    @FXML public void startStaff(ActionEvent event) throws IOException {
 
            Node node = (Node) event.getSource();
            Scene currentScene = node.getScene();
            Stage currentStage = (Stage) currentScene.getWindow();

            Parent root = FXMLLoader.load(getClass().getResource("/EmployableStaff/fxEmployableStaff.fxml"));

            Scene mainScene = new Scene (root);
            currentStage.hide();
            currentStage.setScene(mainScene);
            currentStage.setTitle("Employable Staff");
            currentStage.show();
    }
    
    @FXML Button tableStatusStartButton;
    @FXML public void startTableStatus(ActionEvent event) throws IOException {
 
            Node node = (Node) event.getSource();
            Scene currentScene = node.getScene();
            Stage currentStage = (Stage) currentScene.getWindow();

            Parent root = FXMLLoader.load(getClass().getResource("/TableStatus/tableStatus.fxml"));

            Scene mainScene = new Scene (root);
            currentStage.hide();
            currentStage.setScene(mainScene);
            currentStage.setTitle("Table Status");
            currentStage.show();
    }
    
    @FXML Button mainExitButton;
    @FXML public void exitMain(ActionEvent event) throws IOException {
 
            Node node = (Node) event.getSource();
            Scene currentScene = node.getScene();
            Stage currentStage = (Stage) currentScene.getWindow();

            Parent root = FXMLLoader.load(getClass().getResource("/Start/Start.fxml"));

            Scene mainScene = new Scene (root);
            currentStage.hide();
            currentStage.setScene(mainScene);
            currentStage.setTitle("Start");
            currentStage.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
