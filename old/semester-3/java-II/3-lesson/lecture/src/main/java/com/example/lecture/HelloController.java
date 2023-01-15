package com.example.lecture;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    // add a background picture when the application starts
    @FXML
    private void initialize() {
        // the image is located in the resources folder
        // the image is named javafx.jpg
        welcomeText.setStyle("-fx-background-image: url('javafx.jpg')");
    }
}
