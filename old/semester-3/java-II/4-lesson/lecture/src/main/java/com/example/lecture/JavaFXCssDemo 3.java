/*
 * Using Css with JavaFX example
 */

package com.example.lecture;

import javafx.application.Application;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class JavaFXCssDemo extends Application {
  @Override
  public void start(Stage stage) throws Exception {
    // Create a VBox and set the vbox as the root of the scene
    VBox vbox = new javafx.scene.layout.VBox(10);
    vbox.setAlignment(javafx.geometry.Pos.CENTER);

    // Create a Label and a Button
    Label label = new javafx.scene.control.Label("Hello, World!");
    Button button = new javafx.scene.control.Button("Click me.");

    // Create an event handler for the button that changes its color when the button is clicked
    button.setOnAction(e -> {
      if (button.getStyleClass().contains("button-clicked")) {
        button.setStyle("-fx-background-color: purple;");
        button.getStyleClass().remove("button-clicked");
      } else {
        button.setStyle("-fx-background-color: green;");
        button.getStyleClass().add("button-clicked");
      }
    });



    // Add the button to the vbox and set the vbox as the root of the scene
    vbox.getChildren().addAll(label, button);
    stage.setScene(new javafx.scene.Scene(vbox, 300, 100));

    // Set the title of the stage and show the stage
    stage.setTitle("CSS Example");
    stage.show();

    // Set the style of the label and button
    label.setStyle("-fx-font-size: 24px; -fx-text-fill: red;");
    button.setStyle("-fx-font-size: 24px; -fx-text-fill: blue;");
  }

  public static void main(String[] args) {
    launch(args);
  }


}
