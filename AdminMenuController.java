package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminMenuController {
    @FXML
    private Button logouButt;
    @FXML
    private Button addSPButt;


    public void logoutOnAction(ActionEvent event){
        Stage stage=(Stage) logouButt.getScene().getWindow();
        stage.close();
    }
    public void addSP(){
        try{
            Parent root = FXMLLoader.load(getClass().getResource("adduser.fxml"));
            Stage addSPStage=new Stage();
            addSPStage.setTitle("");
            addSPStage.setScene(new Scene(root, 600, 534));
            addSPStage.show();

        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
    }
    public void deleteSP(){
        try{
            Parent root = FXMLLoader.load(getClass().getResource("deleteSP.fxml"));
            Stage addSPStage=new Stage();
            addSPStage.setTitle("");
            addSPStage.setScene(new Scene(root, 600, 400));
            addSPStage.show();

        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
    }
    public void editSP() throws IOException {
        try {


            Parent root = FXMLLoader.load(getClass().getResource("editSP1.fxml"));
            Stage addSPStage = new Stage();
            addSPStage.setTitle("");
            addSPStage.setScene(new Scene(root, 730, 400));
            addSPStage.show();
        }
        catch (Exception e){
            e.getCause();
        }


    }


}
