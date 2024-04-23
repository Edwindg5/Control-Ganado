package com.example.demo.controllers;

import com.example.demo.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class UserVacasController {
    @FXML
    private AnchorPane ancUserVacas;

    @FXML
    private Button buttonBuscarNombre;

    @FXML
    private Button buttonBuscarPeso;

    @FXML
    private Button buttonBuscarPremiada;

    @FXML
    private Button buttonBuscarTipo;
    @FXML
    private Button buttonBuscarId;
    @FXML
    private Button buttonSalir;

    @FXML
    private Button buttonVerSalud;
    @FXML
    private Button buttonVacasv;
    Stage stage;

    @FXML
    void OnClickBuscarNombre(MouseEvent event) {
        App.newStage("buscarvacanombre-view", "App BuscarVacaNombre-view");
    }

    @FXML
    void OnClickBuscarPeso(MouseEvent event) {
        App.newStage("buscarvacapeso-view", "App BuscarVacaPeso-view");
    }

    @FXML
    void OnClickBuscarPremiada(MouseEvent event) {
        App.newStage("buscarvacapremiada-view", "App BuscarVacaPremiada-view");
    }

    @FXML
    void OnClickBuscarTipo(MouseEvent event) {
        App.newStage("buscarvacatipo-view", "App BuscarVacaTipo-view");
    }

    @FXML
    void OnClickVerSalud(MouseEvent event) {
        App.newStage("vervacaestadosalud-view", "App VerVacaEstadoSalud-view");
    }
    @FXML
    void OnClickBuscarId(MouseEvent event) {
        App.newStage("buscarvacaid-view", "App BuscarVacaId-view");
    }
    @FXML
    void OnClickVerVacas(MouseEvent event) {
        App.newStage("vervacas-view", "App VerVacas-view");
    }
    @FXML
    void OnClickSalir(MouseEvent event) {
        stage = (Stage)ancUserVacas.getScene().getWindow();
        stage.close();
    }
}