package com.example.demo.controllers;

import com.example.demo.App;
import com.example.demo.models.Ventas;
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

public class DueñoComprasController implements Initializable {

    @FXML
    private AnchorPane anchorPaneCompra;

    @FXML
    private Button buttonGuardarCompra;

    @FXML
    private Button buttonSalida;

    @FXML
    private ChoiceBox<String> choiceBoxNombre;

    @FXML
    private TextField textCantidad;
    Stage stage;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choiceBoxNombre.getItems().add("Pasto");
        choiceBoxNombre.getItems().add("Pollinaza");
        choiceBoxNombre.getItems().add("Liquidos");
        choiceBoxNombre.getItems().add("Lazos");
        choiceBoxNombre.getItems().add("Area");
    }
    @FXML
    void OnClickSalida(MouseEvent event) {
      stage = (Stage) anchorPaneCompra.getScene().getWindow();
      stage.close();
    }

    @FXML
    void OnClickompra(MouseEvent event) {
        ArrayList<Ventas> listventa = App.getGanado().getVentas();
        int cantidad;
        int total = 0;
      if(textCantidad.getText().trim().isEmpty() || choiceBoxNombre.getValue() == null) {
          Alert alert = new Alert(Alert.AlertType.INFORMATION);
          alert.setTitle("Compra");
          alert.setContentText("Falta llenar un campo");
          alert.showAndWait();
      }else {
         try {
             choiceBoxNombre.getItems();
             cantidad = Integer.parseInt(textCantidad.getText());

             String nombre = choiceBoxNombre.getValue();
             int costo = 0;
             if (nombre.equals("Pasto")) {
                 costo = 45;
                 total = cantidad * costo;

             } else if (nombre.equals("Pollinaza")) {
                 costo = 35;
                 total = cantidad * costo;
             } else if (nombre.equals("Liquidos")) {
                 costo= 45;
                 total =cantidad* costo;
             } else if (nombre.equals("Lazos")) {
                 costo = 100;
                 total = cantidad*costo;
             } else if (nombre.equals("Area")) {
                 costo = 1000;
                 total = cantidad*costo;
             } else {
                 Alert alert = new Alert(Alert.AlertType.INFORMATION);
                 alert.setTitle("Compra");
                 alert.setContentText("No exister el producto");
                 alert.showAndWait();
             }


             Ventas venta = new Ventas(nombre, costo, total, cantidad);

             if (App.getGanado().statusVentas(venta)) {
                     Alert alert = new Alert(Alert.AlertType.INFORMATION);
                     alert.setTitle("Compra");
                     alert.setContentText("Compra realizada");
                     alert.showAndWait();
             } else {
                 Alert alerterror = new Alert(Alert.AlertType.INFORMATION);
                 alerterror.setTitle("Compra");
                 alerterror.setContentText("No se logro la compra");
                 alerterror.showAndWait();
             }
         }catch (Exception e) {
             Alert alert = new Alert(Alert.AlertType.INFORMATION);
             alert.setTitle("Compra");
             alert.setContentText("Error, ingrese numeros");
             alert.showAndWait();
         }
      }
    }


}
