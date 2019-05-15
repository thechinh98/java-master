package com.java.model;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class JavaFX extends Application {

	@Override
	public void start(Stage primaryStage) {
		HBox root = new HBox();
		Scene scene = new Scene(root,300,300);
		
		ToggleGroup group = new ToggleGroup();
		RadioButton btn1 = new RadioButton("Male");
		btn1.setToggleGroup(group);
		
		RadioButton btn2 = new RadioButton("Female");
		btn2.setToggleGroup(group);
		
		RadioButton btn3 = new RadioButton("Other");
		btn3.setToggleGroup(group);
		
		group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {

			@Override
			public void changed(ObservableValue<? extends Toggle> gp, Toggle old_t, Toggle new_t) {
				System.out.println("OLD TOGGLE: " + old_t);
				System.out.println("NEW TOGGLE: " + new_t);
				
			}
			
		});
		
		root.getChildren().addAll(btn1,btn2,btn3);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
