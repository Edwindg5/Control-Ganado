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

public class BuscarVacaNombreController {
    @FXML
    private AnchorPane anchorPaneBuscar;
    @FXML
    private Button buttonSalir;
    @FXML
    private Button buttonBuscar;
    @FXML
    private TextField textNombre;
    Stage stage;

    @FXML
    boolean OnClickBuscar(MouseEvent event) {
        String nombre;
        String nombrenew;
        boolean flag = false;
        ArrayList<Vacas> listvacas = App.getGanado().getVacas();
        if(textNombre.getText().trim().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Buscar");
            alert.setContentText("Falta llenar un campo");
            alert.showAndWait();
        }else {
                nombrenew = textNombre.getText();
                int i=0;
                while(i<listvacas.size()) {
                    nombre = listvacas.get(i).getNombre();
                    if (nombrenew.equals(nombre)) {
                        flag = true;
                        Alert alertfound = new Alert(Alert.AlertType.INFORMATION);
                        alertfound.setTitle("Encontrar");
                        alertfound.setContentText(String.valueOf(listvacas.get(i)));
                        alertfound.showAndWait();
                    }
                    i++;
                }
                if(!flag) {
                    Alert alerterror = new Alert(Alert.AlertType.INFORMATION);
                    alerterror.setTitle("Encontar");
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
