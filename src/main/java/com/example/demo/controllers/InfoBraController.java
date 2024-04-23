package com.example.demo.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

public class InfoBraController {

    @FXML
    private AnchorPane ancBra;

    @FXML
    private TextArea txtInformacion;

    public void initialize() {
        // Configurar la información sobre la raza Brahman
        String informacion = "El Brahman es una raza bovina originaria de Estados Unidos, desarrollada a partir de razas asiáticas. Es conocida por su resistencia al calor y su adaptabilidad a diferentes condiciones ambientales. Aquí algunas características principales:\n\n" +
                "- Tolerancia al calor: El Brahman es famoso por su capacidad para resistir altas temperaturas y climas tropicales.\n" +
                "- Capacidad lechera: Aunque su principal uso es en la producción de carne, las vacas Brahman también pueden tener una buena producción de leche.\n" +
                "- Resistencia a enfermedades: Son resistentes a muchas enfermedades comunes en el ganado.\n" +
                "- Pelaje: Tienen un pelaje corto y denso que les ayuda a protegerse del sol y los insectos.\n\n" +
                "Estas son solo algunas de las características que hacen del Brahman una raza popular en la ganadería.";
        txtInformacion.setText(informacion);
    }
}
