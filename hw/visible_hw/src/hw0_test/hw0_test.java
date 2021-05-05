package hw0_test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class hw0_test extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/hw0_test.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}