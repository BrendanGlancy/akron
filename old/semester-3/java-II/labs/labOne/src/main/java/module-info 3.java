module com.example.labone {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;


    opens com.example.labone to javafx.fxml;
    exports com.example.labone;
}