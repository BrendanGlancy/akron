package com.example.lecture;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.scene.Scene;

import java.io.File;

public class JavaFXAudioPlayer extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    // Load a sound file
    // ----------------
    File file = new File("audio/Welcome.wav");
    Media media = new Media(file.toURI().toString());
    MediaPlayer mediaPlayer = new MediaPlayer(media);

    // Buttons for play pause and stop
    // -------------------------------
    Button playButton = new Button("Play");
    playButton.setOnAction(e -> mediaPlayer.play());
    Button pauseButton = new Button("Pause");
    pauseButton.setOnAction(e -> mediaPlayer.pause());
    Button stopButton = new Button("Stop");
    stopButton.setOnAction(e -> mediaPlayer.stop());


    // Media setONEndOfMedia
    // ---------------------
    mediaPlayer.setOnEndOfMedia(() -> {
      playButton.setDisable(false);
      pauseButton.setDisable(true);
      stopButton.setDisable(true);
    });


    // Put the buttons in an HBox
    // --------------------------
    HBox hBox = new HBox(10, playButton, pauseButton, stopButton);
    hBox.setAlignment(Pos.CENTER);
    hBox.setPadding(new Insets(10));


    // Create a scene and place it in the stage
    // ----------------------------------------
    Scene scene = new Scene(hBox, 300, 100);
    primaryStage.setTitle("Audio Player");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
