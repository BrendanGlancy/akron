package com.example.demo;

/*
 * Description: Example of using the JavaFX ListView Control
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXListViewSingleSelect extends Application {
  @Override
  public void start(Stage stage) throws Exception {
    // Create a ListView control
    ListView<String> listView = new ListView<String>();
    listView.setPrefSize(200, 100);
    listView.getItems().addAll("Apple", "Orange", "Banana", "Pear", "Grape");

    // Create a label to display the selection
    Label selectionLbl = new Label("Select an item");

    // Create an event handler for the ListView
    listView.getSelectionModel().selectedItemProperty().addListener(
      event -> {
        // Get the selected item
        String selected = listView.getSelectionModel().getSelectedItem();
        selectionLbl.setText("Selected: " + selected);
      }
    );

    // Create a VBox to hold the ListView and Label
    VBox vbox = new VBox(listView, selectionLbl);
    vbox.setPadding(new Insets(10));
    vbox.setAlignment(Pos.CENTER);

    // set the scene
    Scene scene = new Scene(vbox);
    stage.setScene(scene);
    stage.setTitle("JavaFX ListView Single Select");
    stage.show();
  }

  // main
  public static void main(String[] args) {
    launch(args);
  }
}
