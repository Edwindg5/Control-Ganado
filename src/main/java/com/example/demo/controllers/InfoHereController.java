package com.example.demo.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

public class InfoHereController {

    @FXML
    private AnchorPane ancHere;

    @FXML
    private TextArea txtInformacion;

    public void initialize() {
        // Configurar la información sobre la raza Hereford
        String informacion = "El Hereford es una raza bovina originaria de Inglaterra, conocida por su pelaje rojo y blanco y su habilidad para producir carne de alta calidad. Aquí algunas características principales:\n\n" +
                "- Pelaje: Tienen un pelaje rojo y blanco distintivo que les ayuda a resistir condiciones climáticas adversas.\n" +
                "- Temperamento dócil: Son conocidos por su temperamento tranquilo y fácil de manejar.\n" +
                "- Producción de carne: Son valorados por su capacidad para producir carne magra y de excelente calidad.\n" +
                "- Adaptabilidad: Se adaptan bien a diferentes climas y sistemas de manejo.\n\n" +
                "Estas son solo algunas de las características que hacen del Hereford una raza popular en la ganadería.";
        txtInformacion.setText(informacion);
    }
}
