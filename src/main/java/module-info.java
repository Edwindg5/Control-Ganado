module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;


    opens com.example.demo.Estilos to javafx.base;
    exports com.example.demo;
    exports com.example.demo.controllers;
    opens com.example.demo.controllers to javafx.fxml;
    exports com.example.demo.controllers.agregar;
    opens com.example.demo.controllers.agregar to javafx.fxml;
    opens com.example.demo to javafx.base, javafx.fxml;
    exports com.example.demo.models;
    opens com.example.demo.models to javafx.base, javafx.fxml;
}