/*
 * This application will accept an input from the user and use a button to the calculation of the input, converting miles to kilometers.
 */

package com.example.lecture;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXCalc extends Application {
  // Init
  private TextField milesTextField;
  private Label resultLabel;
  private Label promptLabel;

  // Boilerplate to start the application
  public static void main(String[] args) {
    launch(args);
  }

  // Application code
  @Override
  public void start(Stage primaryStage) {
    // Create the text field and label
    milesTextField = new TextField();
    resultLabel = new Label("0.0");
    promptLabel = new Label("Enter miles: ");


    // Create the button
    Button calcButton = new Button("Calculate");

    // Prompt the user to enter a value
    // lamda expression
    milesTextField.setPromptText("Enter miles, then click the button.");
    calcButton.setOnAction(event -> {
      double miles = Double.parseDouble(milesTextField.getText());
      double kilometers = miles * 1.609;
      resultLabel.setText(String.format("%.3f", kilometers));
    });


    // Add the button to the vbox and set the vbox as the root of the scene
    VBox vbox = new VBox(10, promptLabel, milesTextField, calcButton, resultLabel);
    primaryStage.setScene(new Scene(vbox, 300, 200));

    // Set the title of the stage and show the stage
    primaryStage.setTitle("Miles to Kilometers");
    primaryStage.show();
  }
}
