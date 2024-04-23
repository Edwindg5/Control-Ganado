package com.example.demo.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

public class InfoLimController {

    @FXML
    private AnchorPane ancLim;

    @FXML
    private TextArea txtInformacion;

    public void initialize() {
        // Configurar la información sobre la raza Limousin
        String informacion = "El Limousin es una raza bovina originaria de Francia. Es conocida por su buen rendimiento en la producción de carne, siendo una de las razas más populares en la ganadería de carne.\n\n" +
                "Características principales:\n" +
                "- Color: Su color predominante es el rojo dorado, aunque también pueden ser blancos o negros.\n" +
                "- Fertilidad: Son animales fértiles y tienen una buena tasa de concepción.\n" +
                "- Adaptabilidad: Son resistentes y se adaptan bien a diferentes condiciones climáticas y terrenos.\n" +
                "- Calidad de la carne: La carne de Limousin es reconocida por su terneza y sabor.\n\n" +
                "Estas son solo algunas de las características destacadas de la raza Limousin.";
        txtInformacion.setText(informacion);
    }
}
