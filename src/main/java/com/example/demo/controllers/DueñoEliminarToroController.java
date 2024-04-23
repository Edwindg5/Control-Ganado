package com.example.demo.controllers;

import com.example.demo.App;
import com.example.demo.models.Toros;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class DueñoEliminarToroController implements Initializable {

    @FXML
    private AnchorPane anchorPaneEliminar;
    @FXML
    private Button buttonSalir;
    @FXML
    private Button buttonEliminar;

    @FXML
    private TextField textCuernos;

    @FXML
    private TextField textLomo;

    @FXML
    private TextField textNombre;

    @FXML
    private TextField textPeso;

    @FXML
    private ChoiceBox<String> choiceBoxSalud;

    @FXML
    private TextField textTipo;
    Stage stage;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
       choiceBoxSalud.getItems().add("optimo");
       choiceBoxSalud.getItems().add("no optimo");
    }
    @FXML
    boolean OnClickEliminar(MouseEvent event) {
        String nombre;
        float peso;
        String tipo;
        String salud;

        boolean flag = false;

        ArrayList<Toros> listtoros = App.getGanado().getToros();
        if (textNombre.getText().trim().isEmpty() || textTipo.getText().trim().isEmpty() || textPeso.getText().trim().isEmpty()
                ||choiceBoxSalud.getValue()==null) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Agregar");
            alert.setContentText("Falta llenar un campo");
            alert.showAndWait();
        } else {
           String nombrenew = textNombre.getText();
           String tiponew = textTipo.getText();
           String saludnew = choiceBoxSalud.getValue();
            try {
                float pesonew = Integer.parseInt(textPeso.getText());
                for (short i = 0; i < listtoros.size(); i++) {
                    nombre = listtoros.get(i).getNombre();
                    peso = listtoros.get(i).getPeso();
                    tipo = listtoros.get(i).getTipo();
                    salud = listtoros.get(i).getSalud();
                    if (nombrenew.equals(nombre) && pesonew == peso && tiponew.equals(tipo) && saludnew.equals(salud)) {
                        flag = true;
                        listtoros.remove(i);
                    }
                }
                if (flag == true) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Eliminar");
                    alert.setContentText("se logro eliminar");
                    alert.showAndWait();
                } else {
                    Alert alerterror = new Alert(Alert.AlertType.INFORMATION);
                    alerterror.setTitle("Eliminar");
                    alerterror.setContentText("No se logro eliminar");
                    alerterror.showAndWait();
                }

            } catch (Exception e) {
                Alert toro = new Alert(Alert.AlertType.INFORMATION);
                toro.setTitle("Eliminar");
                toro.setContentText("Errror, ingrese numeros");
                toro.showAndWait();
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
