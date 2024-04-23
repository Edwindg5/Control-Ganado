package com.example.demo.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

public class InfoAngusController {

    @FXML
    private AnchorPane ancAngus;

    @FXML
    private TextArea txtInformacion;

    public void initialize() {
        // Configurar la información sobre la raza Angus
        String informacion = "El Angus es una raza bovina originaria de Escocia, conocida por su pelaje negro y su calidad de carne. Aquí algunas características principales:\n\n" +
                "- Pelaje: Tienen un pelaje negro que les proporciona una apariencia distintiva y también les ayuda a resistir el calor y las quemaduras solares.\n" +
                "- Calidad de carne: Son valorados por su carne bien marmoleada y tierna, que es muy apreciada en la industria cárnica.\n" +
                "- Fertilidad: Tienen una alta tasa de fertilidad y una buena capacidad de reproducción.\n" +
                "- Adaptabilidad: Se adaptan bien a diferentes climas y condiciones de pastoreo.\n\n" +
                "Estas son solo algunas de las características que hacen del Angus una raza popular en la ganadería.";
        txtInformacion.setText(informacion);
    }
}
