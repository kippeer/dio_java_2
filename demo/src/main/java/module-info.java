module com.aulas.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.aulas.demo to javafx.fxml;
    exports com.aulas.demo;
}