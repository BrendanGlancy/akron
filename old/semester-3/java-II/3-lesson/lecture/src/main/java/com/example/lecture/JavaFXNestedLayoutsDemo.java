package com.example.lecture;
/*
 * Demonstrate how to use Nested Layouts
 */

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.application.Application;

import java.io.InputStream;

public class JavaFXNestedLayoutsDemo extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        // Create image object
        InputStream input1 = getClass().getResourceAsStream("example.jpeg");
        InputStream input2 = getClass().getResourceAsStream("example2.jpeg");

        // Create the image and set its properties
        Image image = new Image(input1);
        Image image2 = new Image(input2);

        // Create the image view
        ImageView imageView = new ImageView(image);
        ImageView imageView2 = new ImageView(image2);

        // Resize the images while preserving the ratio
        imageView.setFitWidth(300);
        imageView.setPreserveRatio(true);
        imageView2.setFitWidth(300);
        imageView2.setPreserveRatio(true);

        // Create the labels
        Label label1 = new Label("Two example images");

        // Put the images in a VBox
        VBox vbox = new VBox(10, imageView, imageView2);

        // Create GridPane
        GridPane gridPane = new GridPane();
        gridPane.add(label1, 0, 0);
        gridPane.add(vbox, 0, 1);
        // Set the size of the gap between the columns
        gridPane.setHgap(10);
        // Set the gridPane's padding
        gridPane.setPadding(new Insets(10));


        // Create the scene, and display the images
        Scene scene = new Scene(gridPane);
        stage.setScene(scene);
        stage.setTitle("Nested Layouts");
        stage.show();

    }
}