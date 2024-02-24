package com.scholarwise.scholarwise;
	


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
	    try {

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/com/scholarwise/scholarwise/LoginMain.fxml"));


			Parent root = loader.load();

	        Scene scene = new Scene(root);

	        primaryStage.setScene(scene);
	        Image icon = new Image(String.valueOf(getClass().getResource("/com/scholarwise/scholarwise/images/logo_icon.png")));



	        primaryStage.getIcons().add(icon);
	        primaryStage.setTitle("ScholarWise");
	        primaryStage.setResizable(false);
	        primaryStage.show();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	

	





	public static void main(String[] args) {
		launch(args);
	}
}