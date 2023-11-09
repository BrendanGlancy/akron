package com.example.lecture;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
// import the Label and button
import javafx.scene.control.Label;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    // The start method is the main entry point for all JavaFX applications.
    public void start(Stage stage) throws IOException {
        // Load the FXML file.
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        // Create the scene.
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        // Set the scene to the stage.
        stage.setScene(scene);
        // Set the title of the stage.
        stage.setTitle("Hello!");
        // Show the stage.
        stage.show();
    }



    public static void main(String[] args) {
        launch();
    }
}
