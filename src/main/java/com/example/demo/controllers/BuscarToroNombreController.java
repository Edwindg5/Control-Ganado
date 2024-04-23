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

public class BuscarToroNombreController {

    @FXML
    private AnchorPane anchorPaneBuscar;
    @FXML
    private Button buttonSalir;
    @FXML
    private Button buttonNuscarNombre;

    @FXML
    private TextField textNombre;
    Stage stage;

    @FXML
    boolean OnClickNombre(MouseEvent event) {
        String nombre;
        String nombrenew;
        ArrayList<Toros> listtoros = App.getGanado().getToros();
        boolean flag = false;
       if(textNombre.getText().trim().isEmpty()) {
           Alert alert = new Alert(Alert.AlertType.INFORMATION);
           alert.setTitle("Buscar");
           alert.setContentText("Falta llenar un campo");
           alert.showAndWait();
       }else {

               nombrenew = textNombre.getText();
               int i=0;
               while(i<listtoros.size()) {
                   nombre = listtoros.get(i).getNombre();
                   if (nombrenew.equals(nombre)) {
                       flag = true;
                           Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                           alert1.setTitle("Buscar");
                           alert1.setContentText(String.valueOf(listtoros.get(i)));
                           alert1.showAndWait();
                   }
                   i++;
                   }
                   if(!flag){
                       Alert alert2= new Alert(Alert.AlertType.INFORMATION);
                       alert2.setTitle("Econtrar");
                       alert2.setContentText("no se encontro");
                       alert2.showAndWait();
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
