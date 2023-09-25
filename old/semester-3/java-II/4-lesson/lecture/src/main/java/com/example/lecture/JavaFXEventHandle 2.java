package com.example.lecture;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class JavaFXEventHandle extends Application {

  @Override
  public void start(Stage stage) {
    Label label = new Label("0");
    Button button = new Button("Click me.");

    // Lambda expression for the event handler
    // This could be an inner class as well
    button.setOnAction(event -> {
      int count = Integer.parseInt(label.getText());
      count++;
      label.setText(Integer.toString(count));
    });

    // Create a VBox and set the vbox as the root of the scene
    VBox vbox = new VBox(10);
    vbox.setAlignment(Pos.CENTER);

    // Add the button to the vbox and set the vbox as the root of the scene
    vbox.getChildren().addAll(label, button);
    stage.setScene(new javafx.scene.Scene(vbox, 300, 100));
    // Set the title of the stage and show the stage
    stage.setTitle("Event Handler Example");
    stage.show();
  }

  // main method
  public static void main(String[] args) {
    launch(args);
  }
}