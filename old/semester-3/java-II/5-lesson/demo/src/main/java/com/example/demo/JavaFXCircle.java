package com.example.demo;

/*
 * Description: Show how to make a circle in JavaFX
 */

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class JavaFXCircle extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    // Set the size of the scene
    primaryStage.setWidth(400);
    primaryStage.setHeight(400);

    // Create a circle and set its properties
    Circle circle = new Circle();
    circle.setCenterX(200);
    circle.setCenterY(200);
    circle.setRadius(100);
    circle.setStroke(Color.BLACK);
    circle.setFill(Color.WHITE);

    // Create a group and add the circle to it
    Group group = new Group(circle);

    // Create the scene and display it
    Scene scene = new Scene(group);
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
