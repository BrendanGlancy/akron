package com.example.lecture;// Example of event handling in JavaFX

// Imports

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;

public class JavaFXEventHandlerExample extends Application {
  // Field for the Label control
  private Label label;

  @Override
  public void start(Stage stage) {
    // Create the label control
    label = new Label("Click the button to see a message!");
    Button button = new Button("Click me.");

    // Inner class for the event handler
    class SimpleEventHandler implements EventHandler<ActionEvent> {
      @Override
      public void handle(ActionEvent event) {
        JOptionPane.showMessageDialog(null, "Hello, World!");
        label.setText("Hello, World!");
      }
    }

    // Register the event handler with the button
    button.setOnAction(new SimpleEventHandler());
    // Create a VBox and set the vbox as the root of the scene
    VBox vbox = new VBox(10, label, button);
    vbox.setAlignment(Pos.CENTER);
    // Add the button to the vbox and set the vbox as the root of the scene
    vbox.getChildren().addAll(label, button);
    stage.setScene(new javafx.scene.Scene(vbox, 300, 100));

    stage.setTitle("Event Handler Example");
    stage.show();
  }

  // main method
  public static void main(String[] args) {
    launch(args);
  }



}
