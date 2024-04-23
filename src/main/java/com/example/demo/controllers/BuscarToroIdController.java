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

public class BuscarToroIdController {

    @FXML
    private AnchorPane anchorPaneBuscar;
    @FXML
    private Button buttonSalir;
    @FXML
    private Button buttonBuscarId;

    @FXML
    private TextField textId;
    Stage stage;
    @FXML
    boolean OnClickBuscarId(MouseEvent event) {
        String newid;
        ArrayList<Toros> listtoros = App.getGanado().getToros();
        boolean flag = false;
        if(textId.getText().trim().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Buscar");
            alert.setContentText("Falta llenar un campo");
            alert.showAndWait();
        }else {
            newid = textId.getText();
            int index = 0;
            while (!flag && index < listtoros.size()) {
                System.out.println(listtoros.get(index).getId().indexOf(textId.getText()));
                if (listtoros.get(index).getId().indexOf(newid) >= 0) {
                    flag = true;
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Encontrar");
                    alert.setContentText(String.valueOf(listtoros.get(index)));
                    alert.showAndWait();
                }
                index++;
            }
            if(!flag){
                Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                alert1.setTitle("Buscqueda");
                alert1.setContentText("No se logro encontrar");
                alert1.showAndWait();
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
