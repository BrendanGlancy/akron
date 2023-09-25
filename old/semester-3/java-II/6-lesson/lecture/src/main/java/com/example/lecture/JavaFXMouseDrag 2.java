package com.example.lecture;

/**
 * Description: This program demonstrates how to use mouse events.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class JavaFXMouseDrag extends Application {

  @Override
  public void start(Stage primaryStage) {
      // Constants
      final double PANE_WIDTH = 400;
      final double PANE_HEIGHT = 400;

      // Create a pane
      Pane pane = new Pane();

      // Create a circle and add it to pane
      Circle circle = new Circle(50);
      circle.setCenterX(PANE_WIDTH / 2);
      circle.setCenterY(PANE_HEIGHT / 2);
      pane.getChildren().add(circle);

      // Create and register the handler
      circle.setOnMouseDragged(e -> {
          circle.setCenterX(e.getX());
          circle.setCenterY(e.getY());
      });

      // If the Circle is dragged outside the pane, it will be moved back to the center
      circle.setOnMouseReleased(e -> {
          if (e.getX() < 0 || e.getX() > PANE_WIDTH || e.getY() < 0 || e.getY() > PANE_HEIGHT) {
              circle.setCenterX(PANE_WIDTH / 2);
              circle.setCenterY(PANE_HEIGHT / 2);
          }
      });

      // Create a scene and place it in the stage
      Scene scene = new Scene(pane, PANE_WIDTH, PANE_HEIGHT);
      primaryStage.setTitle("Mouse Drag");

      primaryStage.setScene(scene);
      primaryStage.show();
  }

  public static void main() {
    launch();
  }
}
