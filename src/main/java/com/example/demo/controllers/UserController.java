package com.example.demo.controllers;

import com.example.demo.App;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class UserController {
    public ImageView imageDueño;
    public ImageView imageBecerros;
    public ImageView imageToro;
    public ImageView imageVacas;
    @FXML
    private AnchorPane anchorPaneUser;
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
    void OnClickToros(MouseEvent event) {
        App.newStage("usuarioToros-view", "App UsuarioToros-view");
    }

    @FXML
    void OnClickVacas(MouseEvent event) {
       App.newStage("usuarioVacas-view", "App UsuarioVacas-view");
    }

    @FXML
    void OnClickVacunas(MouseEvent event) {
       App.newStage("usuarioVacunas-view", "App UsuarioVacunas-view");
    }


    @FXML
    void OnClickSalir(MouseEvent event) {
         stage = (Stage) anchorPaneUser.getScene().getWindow();
         stage.close();
    }

    public void onClickedDueño(MouseEvent event) {App.newStage("informacionDueño-view","App InformacionDueño-view");
    }

    public void onClickedBecerro(MouseEvent event) {App.newStage("usuarioBecerro-view","App UsuarioBecerro-view");
    }
}