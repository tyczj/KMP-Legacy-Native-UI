module com.example.desktop.demo2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.desktop.demo2 to javafx.fxml;
    exports com.example.desktop.demo2;
}