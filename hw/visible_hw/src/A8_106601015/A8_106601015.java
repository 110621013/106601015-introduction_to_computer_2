package A8_106601015;

import java.io.FileInputStream;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

public class A8_106601015 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("/hw0_test.fxml"));
        
        // image part
        Image image = new Image(new FileInputStream("C:\\Users\\user\\Desktop\\introduction_to_computer_2\\hw\\visible_hw\\src\\hehehe.png"));
        ImageView imageView = new ImageView(image);
        imageView.setX(50);
        imageView.setY(50);
        imageView.setFitHeight(350);
        imageView.setFitWidth(450);
        imageView.setPreserveRatio(true);
        
        // label part
        Label label = new Label("<-- he is hehe boi");
        label.setTextFill(Color.RED);
        label.setTranslateX(400);
        label.setTranslateY(50);
        label.setFont(Font.font("Cambria", 32));
        
        // check Box part
        CheckBox checkBox = new CheckBox();
        checkBox.setText("you know hehe boi meme?");
        checkBox.setTranslateX(400);
        checkBox.setTranslateY(125);
        checkBox.setFont(Font.font("Cambria", 20));
        
        // label2 part
        Label label2 = new Label("really black?");
        label2.setTextFill(Color.BLACK);
        label2.setTranslateX(400);
        label2.setTranslateY(200);
        label2.setFont(Font.font("Cambria", 32));
        
        // RadioButton part
        RadioButton yes = new RadioButton("yesyesyes");
        yes.setTranslateX(400);
        yes.setTranslateY(250);
        yes.setFont(Font.font("Cambria", 20));
        yes.setSelected(true);
        RadioButton no = new RadioButton("nonono");
        no.setTranslateX(600);
        no.setTranslateY(250);
        no.setFont(Font.font("Cambria", 20));
        Group RadioButton_group = new Group(yes, no);
        
        // button part
        Button button= new Button();
        button.setText("gas gas gas");
        button.setTranslateX(500);
        button.setTranslateY(350);
        button.setFont(Font.font("Cambria", 20));
        
        // Group set
        Group root = new Group(imageView, label, checkBox, label2, button, RadioButton_group);
        //root.getChildren().add(label);
        
        
        // Stage
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 800, 450));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
