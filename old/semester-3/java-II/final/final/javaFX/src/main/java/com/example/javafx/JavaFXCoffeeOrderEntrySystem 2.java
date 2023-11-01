package com.example.javafx;

import java.sql.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class JavaFXCoffeeOrderEntrySystem extends Application {
  final String DB_URL = "jdbc:derby:CoffeeDB";

  private ListView<String> customerListView;
  private ListView<String> coffeeListView;
  private TextField qtyTF;
  private TextField orderDateTF;

  final int LV_WIDTH = 150;
  final int LV_HEIGHT = 75;
  final double SPACING = 10;

  private void buildGUI(Stage stage) {
    Label customerPrompt = new Label("Customer:");
    customerListView = new ListView<String>();
    customerListView.setPrefSize(LV_WIDTH, LV_HEIGHT);
    VBox customerVBox = new VBox(SPACING, customerPrompt, customerListView);
    customerVBox.setAlignment(Pos.CENTER);
    customerVBox.setPadding(new Insets(SPACING));

    Label coffeePrompt = new Label("Coffee:");
    coffeeListView = new ListView<String>();
    coffeeListView.setPrefSize(LV_WIDTH, LV_HEIGHT);
    VBox coffeeVBox = new VBox(SPACING, coffeePrompt, coffeeListView);
    coffeeVBox.setAlignment(Pos.CENTER);
    coffeeVBox.setPadding(new Insets(SPACING));

    /**
     * @Quantity and data entry area
     */
    Label qtyPrompt = new Label("Quantity:");
    qtyTF = new TextField();
    Label datePrompt = new Label("Order Date:");
    orderDateTF = new TextField();
    VBox qtyVBox = new VBox(SPACING, qtyPrompt, qtyTF, datePrompt, orderDateTF);
    qtyVBox.setAlignment(Pos.CENTER);
    qtyVBox.setPadding(new Insets(SPACING));

    /**
     * @Buttons
     */
    Button addBtn = new Button("Add");
    Button deleteBtn = new Button("Delete");
    Button updateBtn = new Button("Update");
    Button exitBtn = new Button("Exit");

    /**
     * @Button event handlers
     */
    addBtn.setOnAction(new AddButtonHandler());
    updateBtn.setOnAction(new UpdateButtonHandler());
    exitBtn.setOnAction(new ExitButtonHandler());

    /**
     * @Button HBox
     */
    HBox buttonHBox = new HBox(SPACING, addBtn, deleteBtn, updateBtn, exitBtn);
    buttonHBox.setAlignment(Pos.CENTER);
    buttonHBox.setPadding(new Insets(SPACING));

    /**
     * @Add all the VBoxes to the BorderPane
     */
    BorderPane borderPane = new BorderPane();
    borderPane.setLeft(customerVBox);
    borderPane.setCenter(coffeeVBox);
    borderPane.setRight(qtyVBox);
    borderPane.setBottom(buttonHBox);

    /**
     * @Create the scene and add it to the stage
     */
    Scene scene = new Scene(borderPane);
    stage.setScene(scene);
    stage.setTitle("Coffee Order Entry System");
    stage.show();
  }

  /**
   * @The start method
   */
  public void start(Stage stage) {
    buildGUI(stage);
    loadCustomerData();
    loadCoffeeData();
  }

  /**
   * @Load the customer data into the ListView
   */
  private void loadCustomerData() {
    try {
      Connection conn = DriverManager.getConnection(DB_URL);
      Statement stmt = conn.createStatement();
      String sqlStatement = "SELECT * FROM Customer";
      ResultSet result = stmt.executeQuery(sqlStatement);
      while (result.next()) {
        String customer = result.getString("Name");
        customerListView.getItems().add(customer);
      }
      conn.close();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * @Load the coffee data into the ListView
   */
  private void loadCoffeeData() {
    try {
      Connection conn = DriverManager.getConnection(DB_URL);
      Statement stmt = conn.createStatement();
      String sqlStatement = "SELECT * FROM Coffee";
      ResultSet result = stmt.executeQuery(sqlStatement);
      while (result.next()) {
        String coffee = result.getString("Description");
        coffeeListView.getItems().add(coffee);
      }
      conn.close();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * @Add button event handler
   */
  class AddButtonHandler implements EventHandler<ActionEvent> {
    public void handle(ActionEvent event) {
      String customer = customerListView.getSelectionModel().getSelectedItem();
      String coffee = coffeeListView.getSelectionModel().getSelectedItem();
      String quantity = qtyTF.getText();
      String orderDate = orderDateTF.getText();
      try {
        Connection conn = DriverManager.getConnection(DB_URL);
        Statement stmt = conn.createStatement();
        String sqlStatement = "INSERT INTO CoffeeOrders VALUES ('" + customer + "', '" + coffee + "', " + quantity + ", '" + orderDate + "')";
        stmt.executeUpdate(sqlStatement);
        conn.close();
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
  }

  /**
   * @Delete button event handler
   */
  class DeleteButtonHandler implements EventHandler<ActionEvent> {
    public void handle(ActionEvent event) {
      String customer = customerListView.getSelectionModel().getSelectedItem();
      String coffee = coffeeListView.getSelectionModel().getSelectedItem();
      String quantity = qtyTF.getText();
      String orderDate = orderDateTF.getText();
      try {
        Connection conn = DriverManager.getConnection(DB_URL);
        Statement stmt = conn.createStatement();
        String sqlStatement = "DELETE FROM CoffeeOrders WHERE Customer = '" + customer + "' AND Coffee = '" + coffee + "' AND Quantity = " + quantity + " AND OrderDate = '" + orderDate + "'";
        stmt.executeUpdate(sqlStatement);
        conn.close();
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
  }

  /**
   * @Update button event handler
   */
  class UpdateButtonHandler implements EventHandler<ActionEvent> {
    public void handle(ActionEvent event) {
      String customer = customerListView.getSelectionModel().getSelectedItem();
      String coffee = coffeeListView.getSelectionModel().getSelectedItem();
      String quantity = qtyTF.getText();
      String orderDate = orderDateTF.getText();
      try {
        Connection conn = DriverManager.getConnection(DB_URL);
        Statement stmt = conn.createStatement();
        String sqlStatement = "UPDATE CoffeeOrders SET Quantity = " + quantity + " WHERE Customer = '" + customer + "' AND Coffee = '" + coffee + "' AND OrderDate = '" + orderDate + "'";
        stmt.executeUpdate(sqlStatement);
        conn.close();
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
  }

  /**
   * @Exit button event handler
   */
    class ExitButtonHandler implements EventHandler<ActionEvent> {
    public void handle(ActionEvent event) {
      System.exit(0);
    }
  }
}
