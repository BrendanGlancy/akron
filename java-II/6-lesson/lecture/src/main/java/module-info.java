module com.example.lecture {
  requires javafx.controls;
  requires javafx.fxml;
  requires javafx.media;


  opens com.example.lecture to javafx.fxml;
  exports com.example.lecture;
}