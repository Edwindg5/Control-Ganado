package com.example.demo.controllers;

import com.example.demo.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class DueñoTorosController {
    @FXML
    private Button buttonToros;

    @FXML
    private AnchorPane ancToros;

    @FXML
    private Button buttonAgregarToros;

    @FXML
    private Button buttonBuscarId;

    @FXML
    private Button buttonBuscarNombre;

    @FXML
    private Button buttonBuscarPeso;

    @FXML
    private Button buttonBuscarTipo;

    @FXML
    private Button buttonEliminarToros;

    @FXML
    private Button buttonVerSalud;
    @FXML
    private Button buttonSalir;
    Stage stage;
    @FXML
    void OnClickBuscarId(MouseEvent event) {
        App.newStage("buscarToroId-view", "App BuscarToroId-view");
    }

    @FXML
    void OnClickBuscarNombre(MouseEvent event) {
        App.newStage("buscarToroNombre-view", "App BuscarToroNommbre-view");
    }

    @FXML
    void OnClickBuscarPeso(MouseEvent event) {
        App.newStage("buscarToroPeso-view", "App BuscarTororPeso-view");
    }

    @FXML
    void OnClickEliminarToro(MouseEvent event) {
        App.newStage("dueñoEliminartoro-view", "App DueñoEliminarToro-view");
    }

    @FXML
    void OnClickVerSalud(MouseEvent event) {
        App.newStage("verToroEstadoSalud-view", "App VerToroEstadoSalud-view");
    }

    @FXML
    void OnclickAgregarToro(MouseEvent event) {
        App.newStage("agregarToro-view", "App AgregarToro-view");
    }

    @FXML
    void OnClickVerTorosv(MouseEvent event) {
        App.newStage("verToros-view", "App VerToros-view");
    }
    @FXML
    void OnClcikSalir(MouseEvent event) {
        stage = (Stage)ancToros.getScene().getWindow();
        stage.close();
    }

}