module com.example.chapter33 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chapter33 to javafx.fxml;
    exports com.example.chapter33;
}