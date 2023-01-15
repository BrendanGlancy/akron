package com.example.demo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXComboBox extends Application {

  public void start(Stage stage) {
    // Create a combobox and put some items in it
    ComboBox<String> comboBox = new ComboBox<String>();
    comboBox.getItems().addAll("Apple", "Orange", "Banana", "Pear", "Grape");

    // Label
    Label label = new Label("Select an item");

    // Register an event handler for the combobox
    comboBox.setOnAction(event -> {
      // Get the selected item
      String selected = comboBox.getSelectionModel().getSelectedItem();
      label.setText("Selected: " + selected);
    });

    VBox vBox = new VBox(10, comboBox, label);
    vBox.setAlignment(Pos.CENTER);

    Scene scene = new Scene(vBox);
    stage.setScene(scene);
    stage.setTitle("JavaFX ComboBox");
    stage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
