package com.example.demo.controllers.agregar;

import com.example.demo.App;
import com.example.demo.models.Vacas;
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
import java.util.ResourceBundle;
import java.util.UUID;

public class DueñoAgregarVacaController implements Initializable {
    @FXML
    private ChoiceBox<String> choiceBoxSalud;
    @FXML
    private AnchorPane anchorPaneVaca;

    @FXML
    private Button buttonAgregar;
    @FXML
    private Button buttonSalir;

    @FXML
    private TextField textNombre;

    @FXML
    private TextField textPeso;


    @FXML
    private ChoiceBox<String> choiceBoxPremiada;

    @FXML
    private TextField textTipo;
    Stage stage;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choiceBoxSalud.getItems().add("optimo");
        choiceBoxSalud.getItems().add("no optimo");

        choiceBoxPremiada.getItems().add("si");
        choiceBoxPremiada.getItems().add("no");
    }
    @FXML
    void OnClickAgregar(MouseEvent event) {
        if(textNombre.getText().trim().isEmpty() || textTipo.getText().trim().isEmpty() || textPeso.getText().trim().isEmpty()
                || choiceBoxPremiada.getValue() == null || choiceBoxSalud.getValue() == null ) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Agregar");
            alert.setContentText("Falta llenar un campo");
            alert.showAndWait();
        }else {

            try {
                UUID idvaca = UUID.randomUUID();
                String uuidvaca = idvaca.toString();
                UUID newidvaca = UUID.fromString(uuidvaca);
                String id = String.valueOf(newidvaca);
                String nombre = textNombre.getText();
                String tipo = textTipo.getText();
                String salud = choiceBoxSalud.getValue();
                String premiada = choiceBoxPremiada.getValue();
                float peso = Integer.parseInt(textPeso.getText());
                Vacas vaca = new Vacas(nombre, id, peso, tipo, salud, premiada);

                if (App.getGanado().statusVacas(vaca)) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Agregar");
                    alert.setContentText("Se logro agregar");
                    alert.showAndWait();
                } else {
                    Alert alerterror = new Alert(Alert.AlertType.INFORMATION);
                    alerterror.setTitle("Agregar");
                    alerterror.setContentText("no se logro agregar");
                    alerterror.showAndWait();
                }
            } catch (Exception e) {
                Alert vaca = new Alert(Alert.AlertType.INFORMATION);
                vaca.setTitle("Agregar");
                vaca.setContentText("Error, ingrese numeros");
                vaca.showAndWait();
            }
        }
    }

    @FXML
    void btnSalir(MouseEvent event) {
        stage = (Stage)anchorPaneVaca.getScene().getWindow();
        stage.close();
    }

}
