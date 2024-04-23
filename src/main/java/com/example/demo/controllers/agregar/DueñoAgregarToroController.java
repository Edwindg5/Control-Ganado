package com.example.demo.controllers.agregar;

import com.example.demo.App;
import com.example.demo.models.Toros;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.UUID;

public class DueñoAgregarToroController implements Initializable {

    @FXML
    private AnchorPane anchorPaneToro;
    @FXML
    private Button buttonSalir;

    @FXML
    private ImageView AgregarFondo;

    @FXML
    private Button buttonAregar;

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
    void OnClickAgregar(MouseEvent event){
        if(textNombre.getText().trim().isEmpty() || textTipo.getText().trim().isEmpty() || textPeso.getText().trim().isEmpty()
         || choiceBoxSalud.getValue() ==null) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Agregar");
            alert.setContentText("Falta llenar un campo");
            alert.showAndWait();
        }else {

            try {
                String nombre = textNombre.getText();
                UUID randoom = UUID.randomUUID();
                String uuidAsString = randoom.toString();
                UUID sameuuid = UUID.fromString(uuidAsString);
                String id = String.valueOf(sameuuid);
                String tipo = textTipo.getText();
                String salud = choiceBoxSalud.getValue();
                float peso = Integer.parseInt(textPeso.getText());

                Toros toro = new Toros(nombre, id, peso, tipo, salud);

                if (App.getGanado().statusToros(toro)) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Agregar");
                    alert.setContentText("se agrego");
                    alert.showAndWait();
                } else {
                    Alert alerterror = new Alert(Alert.AlertType.INFORMATION);
                    alerterror.setTitle("Agregar");
                    alerterror.setContentText("No se logro agregar");
                    alerterror.showAndWait();
                }
            } catch (Exception e) {
                Alert toro = new Alert(Alert.AlertType.INFORMATION);
                toro.setTitle("Agregar");
                toro.setContentText("Error, ingrese numeros");
                toro.showAndWait();
               }
            }
        }
    @FXML
    void OnClickSalir(MouseEvent event) {
        stage = (Stage)anchorPaneToro.getScene().getWindow();
        stage.close();
    }


}
