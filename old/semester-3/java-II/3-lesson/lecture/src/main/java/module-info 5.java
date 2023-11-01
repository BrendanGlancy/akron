module com.example.lecture {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.lecture to javafx.fxml;
    exports com.example.lecture;
}