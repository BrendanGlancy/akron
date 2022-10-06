module com.example.lecture {
  requires javafx.controls;
  requires javafx.fxml;


  opens com.example.lecture to javafx.fxml;
  exports com.example.lecture;
}