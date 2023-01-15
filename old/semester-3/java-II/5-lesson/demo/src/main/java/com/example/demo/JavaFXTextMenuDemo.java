package com.example.demo;

/*
 * Demonstrate menus in javafx, including a menu bar, a menu, and menu items
 * The menubar will allow users to change the color of a label in the center of the application
 * The menu will allow users to change the font of the label
 * The menu items will allow users to change the font size of the label
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class JavaFXTextMenuDemo extends Application {
  // Declare and create a label
  private Label lblMessage = new Label("Programming is fun");
  // Declare and create a menu bar
  private MenuBar mnuBar = new MenuBar();
  // Declare and create a menu
  private Menu mnuColor = new Menu("Color");
  // Declare and create menu items
  private MenuItem mnuRed = new MenuItem("Red");
  private MenuItem mnuOrange = new MenuItem("Orange");
  private MenuItem mnuYellow = new MenuItem("Yellow");
  private MenuItem mnuGreen = new MenuItem("Green");
  private MenuItem mnuBlue = new MenuItem("Blue");

  // Declare and create a menu
  private Menu mnuFont = new Menu("Font");
  // Declare and create menu items
  private RadioMenuItem mnuTimes = new RadioMenuItem("Times");
  private RadioMenuItem mnuCourier = new RadioMenuItem("Courier");
  private RadioMenuItem mnuArial = new RadioMenuItem("Arial");




  // Main
  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage stage) throws Exception {
    // Set the size of the stage
    stage.setWidth(400);
    stage.setHeight(400);

    // Create a toggle group for the radio menu items
    ToggleGroup group = new ToggleGroup();
    mnuTimes.setToggleGroup(group);
    mnuCourier.setToggleGroup(group);
    mnuArial.setToggleGroup(group);

    // Add menu items to the menu
    mnuColor.getItems().addAll(mnuRed, mnuOrange, mnuYellow, mnuGreen, mnuBlue);
    mnuFont.getItems().addAll(mnuTimes, mnuCourier, mnuArial);

    // Add a separator to the menu
    mnuFont.getItems().add(new SeparatorMenuItem());

    // Create check menu items
    CheckMenuItem mnuBold = new CheckMenuItem("Bold");
    CheckMenuItem mnuItalic = new CheckMenuItem("Italic");

    // Add check menu items to the menu
    mnuFont.getItems().addAll(mnuBold, mnuItalic);

    // Add menus to the menu bar
    mnuBar.getMenus().addAll(mnuColor, mnuFont);

    // Create a border pane
    BorderPane pane = new BorderPane();

    // Add the label and menu bar to the border pane
    pane.setCenter(lblMessage);
    pane.setTop(mnuBar);

    // Create a scene and place it in the stage
    Scene scene = new Scene(pane);
    stage.setScene(scene);
    stage.show();
  }

  
}
