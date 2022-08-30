/*
 * Name: Brendan Glancy
 * Date: 08/30/22
 * Description: Simple JavaFX App
 */

import javafx.application.Application;
import javafx.scene.Scene;

public class SimpleJavaFXApp extends Application {
  // The main method is the starting point for the JavaFX application.
  public static void main(String[] args) {
    launch(args);
  }

  // Override the start method in the Application class.k
  @Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("Hello World");
    primaryStage.setScene(new Scene(new HelloWorld(), 200, 100));
    primaryStage.show();
  }
}
