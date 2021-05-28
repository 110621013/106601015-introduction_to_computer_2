package A10_106601015;

import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class MazeController implements EventHandler<KeyEvent> {
	int row_index = 0, col_index = 0;
	
	@FXML
	Pane man;
	@FXML
	Pane exit;
	@FXML
	GridPane maze;
	@FXML
	Label successLabel;
	@FXML
	Button backButton;
	
	@FXML
	public void onBackPressed() {
		main.currentStage.setScene(main.menuScene);
	}
	
	@Override
	public void handle(KeyEvent e) {
		if(e.getCode() == KeyCode.UP) {
			row_index--;
		}
		else if(e.getCode() == KeyCode.DOWN) {
			row_index++;
		}
		else if(e.getCode() == KeyCode.LEFT) {
			col_index--;
		}
		else if(e.getCode() == KeyCode.RIGHT) {
			col_index++;
		}
		walkToNewPosition();
		
		int exit_row_index = GridPane.getRowIndex(exit);
		int exit_col_index = GridPane.getColumnIndex(exit);
		if(row_index == exit_row_index && col_index == exit_col_index) {
			successLabel.setVisible(true);
			backButton.requestFocus();
		}
	}
	
	private void walkToNewPosition() {
		int max_row_index = maze.getRowCount()-1, max_col_index = maze.getColumnCount()-1;
		if (row_index < 0) {row_index = 0;}
		if (row_index > max_row_index) {row_index = max_row_index;}
		if (col_index < 0) {col_index = 0;}
		if (col_index > max_col_index) {col_index = max_col_index;}
		GridPane.setRowIndex(man, row_index);
		GridPane.setColumnIndex(man, col_index);
	}
}
