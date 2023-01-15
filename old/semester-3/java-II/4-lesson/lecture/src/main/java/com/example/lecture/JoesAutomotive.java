/*
 * Filename: JoesAutomotive.java
 * Name: Brendan Glancy
 * Desc: This is a solution to the Programming Challenge 8 in Chapter 12.
 * The layout can be arranged in many different ways.
 * I am using a very simple layout for the specific purpose of demonstrating the use of multiple event and event handlers.
 *
 */

package com.example.lecture;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;

public class JoesAutomotive extends Application{
      @Override
      public void start(Stage stage) throws Exception {
        // Named Constants
        final double OIL = 35.00;
        final double LUBE = 25.00;
        final double RADIATOR = 50.00;
        final double TRANSMISSION_FLUID = 120.00;
        final double INSPECTION = 35.00;
        final double MUFFLER = 200.00;
        final double TIRE_ROTATION = 20.00;
        final double LABOR_HOURLY = 60.00;

        // Create a button for each service
        Button oilChangeButton = new Button("Oil Change ---- $" + OIL);
        Button lubeJobButton = new Button("Lube Job ---- $" + LUBE);
        Button radiatorFlushButton = new Button("Radiator Flush ---- $" + RADIATOR);
        Button transmissionFlushButton = new Button("Transmission Flush ---- $" + TRANSMISSION_FLUID);
        Button inspectionButton = new Button("Inspection ---- $" + INSPECTION);
        Button mufflerReplacementButton = new Button("Muffler Replacement ---- $" + MUFFLER);
        Button tireRotationButton = new Button("Tire Rotation ---- $" + TIRE_ROTATION);

        // Vbox for the buttons
        // Align the buttons to the center
        VBox buttonVBox = new VBox(10, oilChangeButton, lubeJobButton, radiatorFlushButton, transmissionFlushButton, inspectionButton, mufflerReplacementButton, tireRotationButton);
        buttonVBox.setAlignment(Pos.CENTER);

        // Create Controls for the parts charges
        Label partsChargesLabel = new Label("Parts Charges:");
        TextField partsChargesTextField = new TextField("0.00");
        Button partsButton = new Button("Calculate Parts Charges");
        HBox partsHBox = new HBox(10, partsChargesLabel, partsChargesTextField, partsButton);
        partsHBox.setAlignment(Pos.CENTER);

        // Create Controls for the labor charges
        Label laborChargesLabel = new Label("Labor Charges:");
        TextField laborChargesTextField = new TextField("0.00");
        Button laborButton = new Button("Calculate Final Total");
        HBox laborHBox = new HBox(10, laborChargesLabel, laborChargesTextField, laborButton);

        // Create labels for output
        Label totalChargesLabel = new Label("Total Charges:");
        TextField totalChargesTextField = new TextField("0.00");
        HBox totalChargesHBox = new HBox(10, totalChargesLabel, totalChargesTextField);
        totalChargesHBox.setAlignment(Pos.CENTER);


        // Set the event handlers for the buttons
        oilChangeButton.setOnAction(event -> {
          double partsCharges = Double.parseDouble(partsChargesTextField.getText());
          partsCharges += OIL;
          partsChargesTextField.setText(String.format("%.2f", partsCharges));
        });

        lubeJobButton.setOnAction(event -> {
          double partsCharges = Double.parseDouble(partsChargesTextField.getText());
          partsCharges += LUBE;
          partsChargesTextField.setText(String.format("%.2f", partsCharges));
        });

        radiatorFlushButton.setOnAction(event -> {
          double partsCharges = Double.parseDouble(partsChargesTextField.getText());
          partsCharges += RADIATOR;
          partsChargesTextField.setText(String.format("%.2f", partsCharges));
        });

        transmissionFlushButton.setOnAction(event -> {
          double partsCharges = Double.parseDouble(partsChargesTextField.getText());
          partsCharges += TRANSMISSION_FLUID;
          partsChargesTextField.setText(String.format("%.2f", partsCharges));
        });

        inspectionButton.setOnAction(event -> {
          double partsCharges = Double.parseDouble(partsChargesTextField.getText());
          partsCharges += INSPECTION;
          partsChargesTextField.setText(String.format("%.2f", partsCharges));
        });

        mufflerReplacementButton.setOnAction(event -> {
          double partsCharges = Double.parseDouble(partsChargesTextField.getText());
          partsCharges += MUFFLER;
          partsChargesTextField.setText(String.format("%.2f", partsCharges));
        });

        tireRotationButton.setOnAction(event -> {
          double partsCharges = Double.parseDouble(partsChargesTextField.getText());
          partsCharges += TIRE_ROTATION;
          partsChargesTextField.setText(String.format("%.2f", partsCharges));
        });

        partsButton.setOnAction(event -> {
          double partsCharges = Double.parseDouble(partsChargesTextField.getText());
          double laborCharges = Double.parseDouble(laborChargesTextField.getText());
          double totalCharges = partsCharges + laborCharges;
          totalChargesTextField.setText(String.format("%.2f", totalCharges));
        });

        laborButton.setOnAction(event -> {
          double partsCharges = Double.parseDouble(partsChargesTextField.getText());
          // Get the number of hours of labor, times it by the hourly rate, and add it to the parts charges
          double laborCharges = Double.parseDouble(laborChargesTextField.getText()) * LABOR_HOURLY;
          double totalCharges = partsCharges + laborCharges;
          totalChargesTextField.setText(String.format("%.2f", totalCharges));
        });

        // Set the stage
        VBox root = new VBox(10, buttonVBox, partsHBox, laborHBox, totalChargesHBox);
        root.setAlignment(Pos.CENTER);
        stage.setScene(new Scene(root, 500, 500));
        stage.setTitle("Joe's Automotive");
        stage.show();
      }




      public static void main(String[] args) {
        launch(args);
      }
    }
