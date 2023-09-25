package com.example.lecture;

/*
 * Example class to show how to use the Image class to display multiple
 * images on the screen, with JavaFX.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
// import insets
import javafx.geometry.Insets;

import java.io.InputStream;

public class MultipleImages extends Application {
    @Override
    public void start(Stage stage) {
        // Import the images
        InputStream input1 = getClass().getResourceAsStream("javafx.jpg");
        InputStream input2 = getClass().getResourceAsStream("example.jpeg");
        InputStream input3 = getClass().getResourceAsStream("example2.jpeg");

        // Create the image and set its properties
        // The images are located in this folder in the project
        // They are named example.jpeg and example2.jpeg and javafx.jpg
        Image image = new Image(input1);
        Image image2 = new Image(input2);
        Image image3 = new Image(input3);

        // Create the image view
        ImageView imageView = new ImageView(image);
        ImageView imageView2 = new ImageView(image2);
        ImageView imageView3 = new ImageView(image3);

        // Resize the images while preserving the ratio
        imageView.setFitWidth(200);
        imageView.setPreserveRatio(true);
        imageView2.setFitWidth(200);
        imageView2.setPreserveRatio(true);
        imageView3.setFitWidth(200);
        imageView3.setPreserveRatio(true);

        // Put them in a Vbox
        VBox vbox = new VBox(10, imageView, imageView2, imageView3);
        vbox.setPadding(new Insets(25));

        // Create the scene, and display the images
        Scene scene = new Scene(vbox);
        stage.setScene(scene);
        stage.setTitle("Multiple Images");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
