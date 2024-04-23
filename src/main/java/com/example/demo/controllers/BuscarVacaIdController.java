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

public class BuscarVacaIdController {
    @FXML
    private AnchorPane anchorPaneBuscar;
    @FXML
    private Button buttonSalir;
    @FXML
    private Button buttonBuscar;
    @FXML
    private TextField textId;
    Stage stage;

    @FXML
    boolean OnClickBuscar(MouseEvent event) {
        String idnew;
        boolean flag = false;
        ArrayList<Vacas> listVacas = App.getGanado().getVacas();
        if(textId.getText().trim().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Buscar");
            alert.setContentText("Falta llenar un campo");
            alert.showAndWait();
        }else {
                idnew = textId.getText();
                int index=0;
                while(!flag && index < listVacas.size()) {
                    if (listVacas.get(index).getId().indexOf(idnew) >= 0) {
                        flag = true;
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("Econtrar");
                        alert.setContentText(String.valueOf(listVacas.get(index)));
                        alert.showAndWait();
                    }
                    index++;
                }
                 if(!flag) {
                    Alert alerterror = new Alert(Alert.AlertType.INFORMATION);
                    alerterror.setTitle("Encontrar");
                    alerterror.setContentText("No se logro encontrar");
                    alerterror.showAndWait();
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
