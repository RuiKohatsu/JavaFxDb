module com.example.javafxdb {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.javafxdb to javafx.fxml;
    exports com.example.javafxdb;
}