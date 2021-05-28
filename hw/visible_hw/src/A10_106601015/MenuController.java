package A10_106601015;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class MenuController {
	@FXML
	public void onStartPressed() throws IOException{
		Parent maze = FXMLLoader.load(getClass().getResource("maze.fxml"));
		Scene mazeScene = new Scene(maze);
		mazeScene.getRoot().requestFocus();
		main.currentStage.setScene(mazeScene);
	}
	
	@FXML
	public void onExitPressed() {
		main.currentStage.close();
	}
}
