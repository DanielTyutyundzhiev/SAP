package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class salesRepMenuController {
    @FXML
    private Button logoutButton;

   public void logoutOnAction(ActionEvent event){
       Stage stage=(Stage) logoutButton.getScene().getWindow();
       stage.close();

   }

}
