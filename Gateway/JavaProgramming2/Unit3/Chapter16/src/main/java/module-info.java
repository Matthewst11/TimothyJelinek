module com.example.chapter16 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.chapter16 to javafx.fxml;
    exports com.example.chapter16;
}