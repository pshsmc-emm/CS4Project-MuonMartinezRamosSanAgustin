/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

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
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author MUON
 */
public class MenuController implements Initializable {

    @FXML Button menuExitButton;
    @FXML public void exitMenu(ActionEvent event) throws IOException {
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
    @FXML ImageView latte;
    @FXML ImageView fries;
    @FXML ImageView cookie;
    
    @FXML public void latteDesc(MouseEvent event) {
        description.setText("Our milk and our dark, rich espresso are poured over ice. A delicious milk-based cooldown.");
    }
    @FXML public void friesDesc(MouseEvent event) {
        description.setText("These amazing fries are golden and crispy on the exterior and fluffy on the interior.");
    }
    @FXML public void cookieDesc(MouseEvent event) {
        description.setText("A thick, chewy cookie with semisweet chocolate chips that has a soft interior and a crispy exterior.");
    }
    @FXML public void descExit(MouseEvent event) {
        description.setText(" ");
    }
    
    @FXML Text description;
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
