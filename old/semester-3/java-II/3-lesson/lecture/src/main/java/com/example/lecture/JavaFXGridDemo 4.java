package com.example.lecture;/*
 * Demonstrate the basic concepts of JavaFX. In this application we will display controls in a GridPane Container
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
// import insets
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class JavaFXGridDemo extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        // Create 4 controls
        Label label = new Label("This is a label");
        Button button = new Button("This is a button");
        Label label2 = new Label("This is another label");
        Button button2 = new Button("This is another button");

        // Create a GridPane Container
        GridPane gridPane = new GridPane();

        // Add the controls to the GridPane Container
        gridPane.add(label, 0, 0); // Column 0, Row 0
        gridPane.add(button, 1, 0); // Column 1, Row 0
        gridPane.add(label2, 0, 1); // Column 0, Row 1
        gridPane.add(button2, 1, 1); // Column 1, Row 1

        // Create the scene, with gridPane as the root node
        Scene scene = new Scene(gridPane);
        // Set the scene to the stage
        stage.setScene(scene);
        // Set the title of the stage
        stage.setTitle("A simple JavaFX application.");
        // Display the stage
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
