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

public class DueñoEliminarVacaController {
    @FXML
    private AnchorPane anchorPaneEliminar;
    @FXML
    private Button buttonSalir;
    @FXML
    private Button buttonAgregar;

    @FXML
    private TextField textNombre;

    @FXML
    private TextField textPeso;

    @FXML
    private TextField textPremiada;

    @FXML
    private TextField textSalud;

    @FXML
    private TextField textTipo;
    Stage stage;

    @FXML
    boolean OnClickAgregar(MouseEvent event) {
        String nombre;
        float peso;
        String tipo;
        String salud;
        String premiada;
        boolean flag = false;

        if (textNombre.getText().trim().isEmpty() || textTipo.getText().trim().isEmpty() || textPeso.getText().trim().isEmpty()
                || textPremiada.getText().trim().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Agregar");
            alert.setContentText("Falta llenar un campo");
            alert.showAndWait();
        } else {
            String nombrenew = textNombre.getText();
            String tiponew = textTipo.getText();
            String saludnew = textSalud.getText();
            String premiadanew = textPremiada.getText();
            try {
                float pesonew = Integer.parseInt(textPeso.getText());
                ArrayList<Vacas> listvacas = App.getGanado().getVacas();

                for (short i = 0; i < listvacas.size(); i++) {
                    nombre = listvacas.get(i).getNombre();
                    peso = listvacas.get(i).getPeso();
                    tipo = listvacas.get(i).getTipo();
                    salud = listvacas.get(i).getSalud();
                    premiada = listvacas.get(i).getPremiada();

                    if (nombrenew.equals(nombre) && pesonew == peso && tiponew.equals(tipo) && saludnew.equals(salud) && premiadanew.equals(premiada)) {
                        flag = true;
                        listvacas.remove(i);
                    }
                }
                if (flag == true) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Eliminar");
                    alert.setContentText("se elimino");
                    alert.showAndWait();
                } else {
                    Alert alerterror = new Alert(Alert.AlertType.INFORMATION);
                    alerterror.setTitle("Eliminar");
                    alerterror.setContentText("No se logro eliminar");
                    alerterror.showAndWait();
                }
            } catch (Exception e) {
                Alert vaca = new Alert(Alert.AlertType.INFORMATION);
                vaca.setTitle("Eliminar");
                vaca.setContentText("Error, ingrese numeros");
                vaca.showAndWait();
            }

        }
        return flag;
    }
    @FXML
    void OnClickSalir(MouseEvent event) {
        stage = (Stage) anchorPaneEliminar.getScene().getWindow();
        stage.close();
    }
}
