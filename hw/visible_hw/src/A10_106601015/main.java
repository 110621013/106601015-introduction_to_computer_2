package A10_106601015;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class main extends Application {
	public static Stage currentStage;
	public static Scene menuScene;
	
    @Override
    public void start(Stage primaryStage) throws Exception{
    	currentStage = primaryStage;
    	Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
    	menuScene = new Scene(root);
    	
    	currentStage.setTitle("Greedy Snake");
    	currentStage.setScene(menuScene);
    	currentStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}