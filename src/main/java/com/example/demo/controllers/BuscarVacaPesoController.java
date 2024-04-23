package com.example.demo.controllers;

import com.example.demo.App;
import com.example.demo.models.Vacas;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class BuscarVacaPesoController {
    @FXML
    private AnchorPane anchorPaneBuscar;
    @FXML
    private Button buttonBuscar;
    @FXML
    private Button buttonSalir;
    @FXML
    private TextField textPeso;
    Stage stage;

    @FXML
    boolean OnClickBuscar(MouseEvent event) {
        float peso;
        float pesonew;
        boolean flag = false;
        ArrayList<Vacas> listVacas = App.getGanado().getVacas();

        if(textPeso.getText().trim().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Buscar");
            alert.setContentText("Falta llenar un campo");
            alert.showAndWait();
        }else {
            try {
                pesonew = Integer.parseInt(textPeso.getText());
                int i=0;
                while(!flag && i < listVacas.size()){
                    peso = listVacas.get(i).getPeso();
                    if (pesonew == peso) {
                        flag = true;
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("Encontrar");
                        alert.setContentText(String.valueOf(listVacas.get(i)));
                        alert.showAndWait();
                    }
                    i++;
                }
                 if(!flag) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Encontrar");
                    alert.setContentText("No se logro encontrar");
                    alert.showAndWait();
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
