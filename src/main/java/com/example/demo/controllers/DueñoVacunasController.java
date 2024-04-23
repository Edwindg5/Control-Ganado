package com.example.demo.controllers;



import com.example.demo.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class DueñoVacunasController {
    @FXML
    private AnchorPane anchorPaneVacunas;
    @FXML
    private Button buttonAgregar;
    @FXML
    private Button buttonVer;
    @FXML
    private Button buttonSalir;
    Stage stage;

    @FXML
    void OnClickVer(MouseEvent event) {
        App.newStage("vervacunas-view", "App VerVacunas-view");
    }

    @FXML
    void btnAgregar(MouseEvent event) {
       App.newStage("agregarvacuna-view", "App AgregarVacuna-view");
    }
    @FXML
    void OnClickSalir(MouseEvent event) {
        stage = (Stage)anchorPaneVacunas.getScene().getWindow();
        stage.close();
    }

    public void onClickedVerTablas(MouseEvent event) {App.newStage("verTablaVacunasSugeridas","App VerTablaVacunasSugeridas");
    }
}
