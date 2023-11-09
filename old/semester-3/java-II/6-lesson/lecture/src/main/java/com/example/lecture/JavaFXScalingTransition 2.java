package com.example.lecture;

import javafx.animation.Interpolator;
import javafx.animation.ScaleTransition;
import javafx.animation.StrokeTransition;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;


public class JavaFXScalingTransition extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    // Scene Constants
    // ----------------
    // Pane
    final double PANE_WIDTH = 400;
    final double PANE_HEIGHT = 400;

    // Circle
    // ----------------
    Text text = new Text("Circle");
    Circle circle = new Circle(100, 100, 50, Color.RED);
    final double CIRCLE_RADIUS = 50;

    // Transition Constants
    // ----------------
    final double DURATION = 5000;
    final double START_SCALE = 1;
    final double END_SCALE = 5;


    // Scale Transition
    // ----------------
    ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(DURATION), text);
    scaleTransition.setFromX(START_SCALE);
    scaleTransition.setToX(END_SCALE);
    scaleTransition.setFromY(START_SCALE);
    scaleTransition.setToY(END_SCALE);

    // Stroke Transition
    // ----------------
    StrokeTransition strokeTransition = new StrokeTransition(Duration.millis(DURATION), circle);
    strokeTransition.setFromValue(Color.RED);
    strokeTransition.setToValue(Color.BLUE);
    strokeTransition.setCycleCount(2);
    strokeTransition.setAutoReverse(true);

    // Set Interpolator
    // ----------------
    scaleTransition.setInterpolator(Interpolator.EASE_BOTH);

    // Add the HBox to the VBox
    // ----------------
    VBox vBox = new VBox(40, text, circle);
    vBox.setAlignment(Pos.CENTER);

    // Create the Scene
    // ----------------
    Scene scene = new Scene(vBox, PANE_WIDTH, PANE_HEIGHT);

    // Set the Scene
    // ----------------
    primaryStage.setTitle("Scaling Transition");
    primaryStage.setScene(scene);
    primaryStage.show();

    // Play the Animation
    // ----------------
    scaleTransition.play();
    strokeTransition.play();
  }
}
