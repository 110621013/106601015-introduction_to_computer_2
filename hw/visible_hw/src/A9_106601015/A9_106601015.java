package A9_106601015;

import java.io.FileInputStream;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class A9_106601015 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
    	// textField and button1 part
    	TextField textField  = new TextField();
    	textField.setTranslateX(200);
    	textField.setTranslateY(50);
    	
        Button button1 = new Button();
        button1.setText("press1");
        button1.setTranslateX(400);
        button1.setTranslateY(50);
        button1.setFont(Font.font("Cambria", 20));
        
        button1.setOnAction(action -> {
            System.out.println(textField.getText());
        });
        
        Group g1 = new Group(textField, button1);
        
        // RadioButton and button2 part
        RadioButton radioButton1 = new RadioButton("A");
        RadioButton radioButton2 = new RadioButton("B");
        radioButton1.setTranslateX(200);
        radioButton1.setTranslateY(150);
        radioButton2.setTranslateX(300);
        radioButton2.setTranslateY(150);
        radioButton1.setFont(Font.font("Cambria", 20));
        radioButton2.setFont(Font.font("Cambria", 20));
        
        ToggleGroup radioGroup = new ToggleGroup();
        radioButton1.setToggleGroup(radioGroup);
        radioButton2.setToggleGroup(radioGroup);
    	
        Button button2 = new Button();
        button2.setText("press2");
        button2.setTranslateX(400);
        button2.setTranslateY(150);
        button2.setFont(Font.font("Cambria", 20));
        
        button2.setOnAction(action -> {
        	if(radioButton1.isSelected()) {
        		System.out.println("user chooses A");
        	}
        	else if(radioButton2.isSelected()) {
        		System.out.println("user chooses B");
        	}
        	else {
        		System.out.println("None of AB was selected");
        	}
        });
        Group g2 = new Group(radioButton1, radioButton2, button2);
    	
        // CheckBox and button3 part
        CheckBox checkBox = new CheckBox();
        checkBox.setText("CheckBox");
        checkBox.setTranslateX(200);
        checkBox.setTranslateY(250);
        checkBox.setFont(Font.font("Cambria", 20));
        
        Button button3 = new Button();
        button3.setText("press3");
        button3.setTranslateX(400);
        button3.setTranslateY(250);
        button3.setFont(Font.font("Cambria", 20));
        
        button3.setOnAction(action -> {
        	boolean CheckBoxisSelected = checkBox.isSelected();
        	System.out.println(CheckBoxisSelected);
        });
        Group g3 = new Group(checkBox, button3);
    	
        
        // all group set
        Group root = new Group(g1, g2, g3);
        // Stage
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 800, 450));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}