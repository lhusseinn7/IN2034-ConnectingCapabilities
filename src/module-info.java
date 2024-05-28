module com.example.searchapp {
    requires javafx.controls;
    requires javafx.fxml;
//    requires org.controlsfx.controls;

    opens com.example.searchapp to javafx.fxml;
    exports com.example.searchapp;
}