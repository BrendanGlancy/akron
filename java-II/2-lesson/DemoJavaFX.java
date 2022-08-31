// Example JavaFX program

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class DemoJavaFX extends Application {
    // show a hello world message
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        Circle circle = new Circle(100);
        circle.setFill(Color.RED);
        root.getChildren().add(circle);
        Scene scene = new Scene(root, 200, 200);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
