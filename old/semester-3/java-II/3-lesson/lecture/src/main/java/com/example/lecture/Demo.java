package com.example.lecture;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.Scene;
// import geometry classes
import javafx.geometry.Insets;
import javafx.geometry.Pos;


public class Demo extends Application {
    @Override
    public void start(Stage stage) {
        // Create a label.
        Label label = new Label("Hello, this is a label");
        // Create a button.
        Button button = new Button("Click me! I am a button");
        // Create a horizontal box.
        HBox hBox = new HBox();
        // Set the spacing between the nodes in the horizontal box to 10.
        hBox.setSpacing(10);
        // Set the alignment of the horizontal box to center.
        hBox.setAlignment(Pos.CENTER);
        // Add the label and button to the horizontal box.
        hBox.getChildren().addAll(label, button);
        // Create a vertical box.
        VBox vBox = new VBox();
        // Set the spacing between the nodes in the vertical box to 10.
        vBox.setSpacing(10);
        // Set the padding of the vertical box.
        vBox.setPadding(new Insets(50));
        // Set the alignment of the vertical box to center.
        vBox.setAlignment(Pos.CENTER);
        // Add the horizontal box to the vertical box.
        vBox.getChildren().add(hBox);
        // Create a scene.
        Scene scene = new Scene(vBox);
        // Set the scene to the stage.
        stage.setScene(scene);
        // Set the title of the stage.
        stage.setTitle("A simple JavaFX application.");
        // Display the stage.
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}