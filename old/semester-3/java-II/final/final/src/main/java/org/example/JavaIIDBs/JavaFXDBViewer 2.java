import java.sql.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class JavaFXDBViewer extends Application {
  final String DB_URL = "jdbc:derby:CoffeeDB";

  TextArea queryTextArea;
  TextArea resultsTextArea;

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    final int COLSIZE = 50;
    final int ROWSIZE = 10;
    final double SPACING = 10.0;

    // build the query entry area
    queryTextArea = new TextArea();
    queryTextArea.setPrefColumnCount(COLSIZE);
    queryTextArea.setPrefRowCount(ROWSIZE);

    // build the results display area
    resultsTextArea = new TextArea();
    resultsTextArea.setPrefColumnCount(COLSIZE);
    resultsTextArea.setPrefRowCount(ROWSIZE);

    // build the button
    Button submitButton = new Button("Submit Query");
    submitButton.setOnAction(new SubmitButtonHandler());

    // build the VBox
    VBox vbox = new VBox(SPACING, queryTextArea, submitButton, resultsTextArea);
    vbox.setPadding(new Insets(SPACING));
    vbox.setAlignment(Pos.CENTER);

    // build the scene
    Scene scene = new Scene(vbox);

    // set the stage
    primaryStage.setScene(scene);
    primaryStage.setTitle("JavaFX DB Viewer");
    primaryStage.show();
  }

  // submit button handler
  class SubmitButtonHandler implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent event) {
      try {
        // Clear the previous results
        resultsTextArea.setText("");

        Connection conn = DriverManager.getConnection(DB_URL);
        Statement stmt = conn.createStatement();

        ResultSet result = stmt.executeQuery(queryTextArea.getText());
        ResultSetMetaData rsmd = result.getMetaData();

        String output = "";
        while (result.next()) {
          for (int i = 1; i <= rsmd.getColumnCount(); i++) {
            output += result.getString(i) + "\t";
          }
          output += "\n";
        }

        resultsTextArea.setText(output);
        stmt.close();
        conn.close();
      } catch (SQLException ex) {
        resultsTextArea.setText(ex.getMessage());
        System.exit(0);
      }
    }
  }
}
