package com.example.demo.controllers;

import com.example.demo.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class DueñoVacasController {
    @FXML
    private AnchorPane anchorPaneVacas;
    @FXML
    private Button buttonBuscarPremiada;
    @FXML
    private Button buttonAgregarVacas;
    @FXML
    private Button buttonVacasv;
    @FXML
    private Button buttonBuscarId;
    @FXML
    private Button buttonTorosv;
    @FXML
    private Button buttonBuscarNombre;

    @FXML
    private Button buttonBuscarPeso;

    @FXML
    private Button buttonBuscarTipo;

    @FXML
    private Button buttonEliminarVaca;

    @FXML
    private Button buttonVerSaludVaca;
    @FXML
    private Button buttonSalir;


    Stage stage;
    @FXML
    void OnClickBuscarId(MouseEvent event) {
          App.newStage("buscarVacaId-view", "App BuscarVacaId-view");
    }

    @FXML
    void OnClickBuscarNombre(MouseEvent event) {
          App.newStage("buscarVacaNombre-view", "App BuscarVacaNombre-view");
    }

    @FXML
    void OnClickBuscarPeso(MouseEvent event) {
          App.newStage("buscarVacaPeso-view", "App BuscarVacaPeso-view");
    }

    @FXML
    void OnClickEliminarVaca(MouseEvent event) {
         App.newStage("dueñoEliminarVaca-view", "App DueñoEliminarVaca-view");
    }

    @FXML
    void OnClickVerSalud(MouseEvent event) {
         App.newStage("verVacaEstadoSalud-view", "App VerVacaEstadoSalud-view");
    }

    @FXML
    void OnclickAgregarVaca(MouseEvent event) {
        App.newStage("Agregarvaca-view", "App AgregarVaca-view");
    }

    @FXML
    void OnClickVacas(MouseEvent event) {
        App.newStage("verVacas-view", "App VerVacas-view");
    }


    @FXML
    void OnClickSalir(MouseEvent event) {
        stage = (Stage)anchorPaneVacas.getScene().getWindow();
        stage.close();
    }
}