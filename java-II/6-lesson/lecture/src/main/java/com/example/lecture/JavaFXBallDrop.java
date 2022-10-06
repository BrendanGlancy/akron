package com.example.lecture;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class JavaFXBallDrop extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    final double SWIDTH = 200.0;
    final double SHEIGHT = 200.0;

    // Constants for the ball
    final double STARTX = 100.0, STARTY = 40.0;
    final double ENDX = 100.0, ENDY = 160.0;
    final double RADIUS = 40.0;

    // Constant for animation duration
    final double ONESEC = 1000.0;

    Circle ball = new Circle(RADIUS);

    // Transition object
    TranslateTransition ttrans = new TranslateTransition(new Duration(ONESEC), ball);
    ttrans.setFromX(STARTX);
    ttrans.setFromY(STARTY);
    ttrans.setToX(ENDX);
    ttrans.setToY(ENDY);

    // Add the ball to the pane
    Pane pane = new Pane();
    pane.getChildren().add(ball);

    primaryStage.setScene(new javafx.scene.Scene(pane, SWIDTH, SHEIGHT));
    primaryStage.setTitle("Ball Drop");
    primaryStage.show();

    // Start the animation
    ttrans.play();

  }

  public static void main() {
    launch();
  }
}
