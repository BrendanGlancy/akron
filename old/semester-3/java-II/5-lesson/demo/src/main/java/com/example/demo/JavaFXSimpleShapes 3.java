package com.example.demo;

/*
 * Description: Show how to make simple shapes in JavaFX
 */

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class JavaFXSimpleShapes extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    // Set the size of the scene
    primaryStage.setWidth(400);
    primaryStage.setHeight(400);

    // Set three points
    final double TOPX = 160.0, TOPY = 20.0;
    final double BOTTOMLEFTX = 20.0, BOTTOMLEFTY = 360.0;
    final double BOTTOMRIGHTX = 300.0, BOTTOMRIGHTY = 360.0;

    // Connect the points with lines to make a triangle
    Line line1 = new Line(TOPX, TOPY, BOTTOMLEFTX, BOTTOMLEFTY);
    Line line2 = new Line(BOTTOMLEFTX, BOTTOMLEFTY, BOTTOMRIGHTX, BOTTOMRIGHTY);
    Line line3 = new Line(BOTTOMRIGHTX, BOTTOMRIGHTY, TOPX, TOPY);

    //
    Pane pane = new Pane(line1, line2, line3);

    // Create the scene and display it
    Scene scene = new Scene(pane);
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
