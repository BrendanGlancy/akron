package com.example.lecture;/*
 * Demonstrate how to use a BorderPane Container
 */

import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.application.Application;

public class JavaFXBorderPaneDemo extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Create 4 labels and one button
        Label label1 = new Label("This is top/north");
        Label label2 = new Label("This is left/west");
        Label label3 = new Label("This is right/east");
        Label label4 = new Label("This is bottom/south");
        Button button = new Button("This is center");

        HBox centerBox = new HBox(button);
        HBox topBox = new HBox(label1);
        HBox bottomBox = new HBox(label4);
        HBox leftBox = new HBox(label2);
        HBox rightBox = new HBox(label3);

        // Set the alignment for the top and bottom
        topBox.setAlignment(Pos.CENTER);
        bottomBox.setAlignment(Pos.CENTER);

        // Create a BorderPane Container
        BorderPane borderPane = new BorderPane();

        // Add the controls to the BorderPane Container
        borderPane.setTop(topBox);
        borderPane.setBottom(bottomBox);
        borderPane.setLeft(leftBox);
        borderPane.setRight(rightBox);

        // Add the centerBox to the center of the BorderPane Container
        borderPane.setCenter(centerBox);
        borderPane.setTop(topBox);
        borderPane.setBottom(bottomBox);
        borderPane.setLeft(leftBox);
        borderPane.setRight(rightBox);

        // Create the scene, with borderPane as the root node
        Scene scene = new Scene(borderPane);
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
