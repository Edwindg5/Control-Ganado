package com.example.demo.controllers;


import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class InformacionDueñoController {

    public AnchorPane ancInformacion;
    @FXML
    private Text textoInformacion;

    public void initialize() {
        String informacion = "Soy Arnulfo Diaz Lopez, dueño del ganado y puedo ofrecerte lo mejor de mis ganados." +
                "-Me encuentro en Bochil, Chiapas, col. Las Limas" +
                "-Rancho ''Lopez''";
        textoInformacion.setText(informacion);
    }
}
