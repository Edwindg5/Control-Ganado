package com.example.demo.controllers;

import com.example.demo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class DueñoController {
    public ImageView imageVacas;
    public ImageView imgCompras;
    public ImageView imgVacunas;
    public ImageView imageToro;
    public Button buttonEventos;
    public ImageView buttonInventarioAlimentos;
    public ImageView imageBecerros;
    @FXML
    private Button buttonCompra;
    @FXML
    private Button buttonSalir;
    @FXML
    private Button buttonToros;

    @FXML
    private Button buttonVacas;

    @FXML
    private Button buttonVacunas;
    Stage stage;

    @FXML
    private AnchorPane ancToros;

    @FXML
    void OnClickToros(MouseEvent event) {
        App.newStage("dueñoToros-view", "App DueñoToros-view");
    }


    @FXML
    void OnClickVacunas(MouseEvent event) {
        App.newStage("dueñoVacunas-view", "App DueñoVacunas-view");
    }
    @FXML
    void OnClickCompras(MouseEvent event) {App.newStage("dueñoCompra-view", "App DueñoCompra-view");}
    @FXML
    void OnClickSalir(MouseEvent event) {
        stage = (Stage)ancToros.getScene().getWindow();
        stage.close();
    }


    public void OnClickEventos(ActionEvent actionEvent) {App.newStage("agendarEventos-view","App AgendarEventos-view");
    }

    public void onClickedInventarioAlimentos(MouseEvent contextMenuEvent) { App.newStage("inventarioAlimentos-view","App inventarioAlimentos-view");
    }


    public void onClickedBecerros(MouseEvent event) {App.newStage("agregarBecerros-view","App agregarBecerros-view");
    }

    public void OnClickVacasP(MouseEvent event) {App.newStage("dueñoVacas-view","App DueñoVacas-view");
    }
}