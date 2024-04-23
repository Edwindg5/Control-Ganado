module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;


    opens com.example.demo.Estilos to javafx.base;
    opens com.example.demo.models to javafx.base;
    opens com.example.demo to javafx.fxml;
    exports com.example.demo;
    exports com.example.demo.controllers;
    opens com.example.demo.controllers to javafx.fxml;
    exports com.example.demo.controllers.agregar;
    opens com.example.demo.controllers.agregar to javafx.fxml;
}