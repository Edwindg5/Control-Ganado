package com.example.demo.controllers;

import com.example.demo.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class UserTorosController {

    @FXML
    private AnchorPane anchorPaneUserToros;
    @FXML
    private Button buttonVerSalud;
    @FXML
    private Button buttonBuscarCuernos;

    @FXML
    private Button buttonBuscarLomo;

    @FXML
    private Button buttonBuscarNombre;

    @FXML
    private Button buttonBuscarPeso;
    @FXML
    private Button buttonBuscarId;
    @FXML
    private Button buttonSalir;
    @FXML
    private Button buttonTorosv;
    @FXML
    private Button buttonBuscarTipo;
    Stage stage;


    @FXML
    void OnClickBuscarNombre(MouseEvent event) {
        App.newStage("buscartoronombre-view", "App BuscarToroNombre-view");
    }

    @FXML
    void OnClickBuscarPeso(MouseEvent event) {
        App.newStage("buscartoropeso-view", "App BuscarToroPeso-view");
    }

    @FXML
    void OnClickBuscarTipo(MouseEvent event) {
        App.newStage("buscartorotipo-view", "App BuscarToroTipo-view");
    }
    @FXML
    void OnClickVerSalud(MouseEvent event) {
        App.newStage("vertoroestadosalud-view", "App VerToroEstadoSalud-view");
    }
    @FXML
    void OnClickBuscarId(MouseEvent event) {
        App.newStage("buscartoroid-view", "App BuscarToroId-view");
    }
    @FXML
    void OnClickToros(MouseEvent event) {
     App.newStage("vertoros-view", "App VerToros-view");
    }
    @FXML
    void OnClickSalir(MouseEvent event) {
        stage = (Stage)anchorPaneUserToros.getScene().getWindow();
        stage.close();
    }
}