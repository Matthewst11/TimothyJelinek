module com.example.chapter32 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chapter32 to javafx.fxml;
    exports com.example.chapter32;
}