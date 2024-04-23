package com.example.demo.controllers;

import com.example.demo.App;
import com.example.demo.models.Toros;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class BuscarToroPesoController {
    @FXML
    private AnchorPane anchorPaneBuscar;
    @FXML
    private Button buttonSalir;
    @FXML
    private Button buttonBuscarPeso;
    @FXML
    private TextField textPeso;
    Stage stage;

    @FXML
    boolean OnClickBuscarPeso(MouseEvent event) {
        float peso;
        float pesonew;
        ArrayList<Toros> listtoros = App.getGanado().getToros();
        boolean flag = false;
        if(textPeso.getText().trim().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Buscar");
            alert.setContentText("Falta llenar un campo");
            alert.showAndWait();
        }else {
            try {
                pesonew = Integer.parseInt(textPeso.getText());
                int i=0;
                while(i<listtoros.size()) {
                    peso = listtoros.get(i).getPeso();
                    if (pesonew == peso) {
                        flag = true;
                            Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                            alert1.setTitle("Encontrar");
                            alert1.setContentText(String.valueOf(listtoros.get(i)));
                            alert1.showAndWait();
                    }
                    i++;
                }
                if(!flag) {
                    Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
                    alert2.setTitle("Encontrar");
                    alert2.setContentText("No se logro encontrar");
                    alert2.showAndWait();
                }
            } catch (Exception e) {
                Alert buscar = new Alert(Alert.AlertType.INFORMATION);
                buscar.setTitle("Buscar");
                buscar.setContentText("Error, ingrese numeros");
                buscar.showAndWait();
            }
        }
        return flag;
    }

    @FXML
    void OnClickSalir(MouseEvent event) {
        stage = (Stage) anchorPaneBuscar.getScene().getWindow();
        stage.close();
    }

}
