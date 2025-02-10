module com.aulas.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;


    opens com.aulas.demo to javafx.fxml;
    exports com.aulas.demo;
}