package com.example.demo.controllers;

import com.example.demo.App;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class UserVacunasController {

    @FXML
    private AnchorPane ancUserVacunas;
    @FXML
    private Button buttonMostrar;
    @FXML
    private Button buttonSalir;
    Stage stage;

    @FXML
    void OnClickSalir(MouseEvent event) {
        stage = (Stage)ancUserVacunas.getScene().getWindow();
        stage.close();
    }

    @FXML
    void OnClickVacunas(MouseEvent event) {
        App.newStage("vervacunas-view", "App VerVacunas-view");
    }

}
