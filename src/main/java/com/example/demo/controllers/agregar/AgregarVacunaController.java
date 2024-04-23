package com.example.demo.controllers.agregar;

import com.example.demo.App;
import com.example.demo.models.Becerro;
import com.example.demo.models.Toros;
import com.example.demo.models.Vacas;
import com.example.demo.models.Vacunas;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class AgregarVacunaController implements Initializable {
    @FXML
    private AnchorPane anchorPaneVacunas;
    @FXML
    private Button buttonAgregar;
    @FXML
    private Button buttonSalir;
    @FXML
    private ChoiceBox<String> choiceBoxNombre;
    @FXML
    private DatePicker datePickerFecha;

    @FXML
    private ChoiceBox<String> choiceBoxAnimal;

    @FXML
    private TextField textVacuna;
    Stage stage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choiceBoxAnimal.getItems().add("vaca");
        choiceBoxAnimal.getItems().add("toro");
        choiceBoxAnimal.getItems().add("becerro");

        ArrayList<Toros> listtoros = App.getGanado().getToros();
        for (Toros listtoro : listtoros) {
            choiceBoxNombre.getItems().add(listtoro.getNombre());
        }

        ArrayList<Vacas> listvacas = App.getGanado().getVacas();
        for (Vacas listvaca : listvacas) {
            choiceBoxNombre.getItems().add(listvaca.getNombre());
        }
        ArrayList<Becerro> listabecerro = App.getGanado().getBecerros();
        for (Becerro becerro : listabecerro) {
            choiceBoxNombre.getItems().add(becerro.getNombre());
        }



    }
    @FXML
    void OnClickAgregar(MouseEvent event) {
        String animal;
        String vacuna;
        String nombre = null;
        if(textVacuna.getText().trim().isEmpty() || choiceBoxAnimal.getValue() == null ||datePickerFecha.getValue() == null
        || choiceBoxNombre.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Vacuna");
            alert.setContentText("Falta llenar un campo");
            alert.showAndWait();
        }else {

            try {
                LocalDate fecha = datePickerFecha.getValue();
                animal = choiceBoxAnimal.getValue();
                vacuna = textVacuna.getText();
                String patron = "dd MMMM, YYYY";
                String datopatron = fecha.format(DateTimeFormatter.ofPattern(patron));

                Vacunas vacunas = new Vacunas(nombre, animal, vacuna, fecha);

                if (App.getGanado().statusVacunas(vacunas)) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Vacuna");
                    alert.setContentText("Se agrego");
                    alert.showAndWait();
                }
            } catch (Exception e) {
                Alert vacunas = new Alert(Alert.AlertType.INFORMATION);
                vacunas.setTitle("Agregar");
                vacunas.setContentText("Error, ingrese numeros");
                vacunas.showAndWait();
            }
        }

    }
    @FXML
    void OnClickSalir(MouseEvent event) {
        stage = (Stage)anchorPaneVacunas.getScene().getWindow();
        stage.close();
    }


}