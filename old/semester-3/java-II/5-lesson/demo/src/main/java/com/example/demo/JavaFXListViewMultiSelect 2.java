package com.example.demo;

/*
 * Description: Example of using the JavaFX ListView Control with multiple selections
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.List;


public class JavaFXListViewMultiSelect extends Application {
  @Override
  public void start(Stage stage) {
    // Create a ListView control
    ListView<String> listView = new ListView<String>();
    listView.setPrefSize(200, 100);
    listView.getItems().addAll("Apple", "Orange", "Banana", "Pear", "Grape");

    // Set the selection mode to multiple
    listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    listView.getItems().addAll("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");

    ListView<String> listView2 = new ListView<String>();
    listView2.setPrefSize(200, 100);
    listView2.getItems().addAll();

    // Create a button to get the selected items
    Button getBtn = new Button("Get Selected Items");

    // Register the button to an event handler
    getBtn.setOnAction(event -> {
      // Clear the selected items before adding more
      listView2.getItems().clear();

      // Get the selected items
      List<String> selected = listView.getSelectionModel().getSelectedItems();
      listView2.getItems().addAll(selected);
    });


    // VBox to hold the ListView and Button
    VBox vbox = new VBox(10, listView, listView2, getBtn);
    vbox.setPadding(new Insets(10));
    vbox.setAlignment(Pos.CENTER);

    Scene scene = new Scene(vbox);
    stage.setScene(scene);
    stage.setTitle("JavaFX ListView Multi Select");
    stage.show();

  }

  // main
  public static void main(String[] args) {
    launch(args);
  }
}
