package A11_106601015;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("pic.fxml"));
		primaryStage.setTitle("GAME");
		Scene window = new Scene(root, 400, 300);
		window.getRoot().requestFocus();
		primaryStage.setScene(window);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
        launch(args);
    }
}