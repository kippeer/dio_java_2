module com.aulas.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;


    opens com.aulas.demo to javafx.fxml;
    exports com.aulas.demo;
    exports com.aulas.demo.interfaces;
    opens com.aulas.demo.interfaces to javafx.fxml;
}