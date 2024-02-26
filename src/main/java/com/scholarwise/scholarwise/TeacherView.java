package com.scholarwise.scholarwise;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class TeacherView {

    @FXML
    private Button Course_Button;

    @FXML
    private Button Marks_Button;

    @FXML
    private Button Profile_Button;

    @FXML
    private Button TimeTable_Button;

    @FXML
    private Button logout_btn;
    @FXML
    void logoutBtn(ActionEvent event) throws IOException {
    	Stage primaryStage;
    	primaryStage=(Stage)logout_btn.getScene().getWindow();
    	primaryStage.close();
    	
    	
    	
    	Stage mainstage=new Stage();

		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/com/scholarwise/scholarwise/LoginMain.fxml"));


		Parent root = loader.load();
		Scene scene =new Scene(root);
		scene.getStylesheets().add(getClass().getResource("/com/scholarwise/scholarwise/style.css").toExternalForm());
		mainstage.setScene(scene);
		
		Image icon= new Image(String.valueOf(getClass().getResource("images/logo_icon.png")));
		mainstage.getIcons().add(icon);
		mainstage.setTitle("ScholarWise");
		mainstage.setScene(scene);
		mainstage.setResizable(true);
		mainstage.setX(1);
		mainstage.setY(1);
//		mainstage.setFullScreen(true);
//		mainstage.setFullScreenExitHint("Press ESC to escape");
//		mainstage.setFullScreenExitKeyCombination(KeyCombination.valueOf("esc"));
		mainstage.show();

    }

}
