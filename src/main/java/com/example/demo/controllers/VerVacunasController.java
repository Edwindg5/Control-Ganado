package com.example.demo.controllers;

import com.example.demo.App;
import com.example.demo.models.Vacunas;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class VerVacunasController implements Initializable {
    @FXML
    private AnchorPane anchorPaneVacunas;
    @FXML
    private Button buttonSalir;
    @FXML
    private TableColumn AnimalColumn;

    @FXML
    private TableColumn FechaColumn;

    @FXML
    private TableColumn VacunaColumn;

    @FXML
    private TableView<Vacunas> tblVacunas;
    private ObservableList<Vacunas> vacunas;
    Stage stage;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        vacunas = FXCollections.observableArrayList();
        ArrayList<Vacunas> listvacunas = App.getGanado().getVacunas();
        this.AnimalColumn.setCellValueFactory(new PropertyValueFactory("animal"));
        this.VacunaColumn.setCellValueFactory(new PropertyValueFactory("vacuna"));
        this.FechaColumn.setCellValueFactory(new PropertyValueFactory("fecha"));
        for(short i=0;i<listvacunas.size();i++) {
            if(listvacunas.get(i).isStatus()) {
                vacunas.add(listvacunas.get(i));
            }
        }
        tblVacunas.setItems(vacunas);
    }

    @FXML
    void OnClickSalir(MouseEvent event) {
     stage = (Stage)anchorPaneVacunas.getScene().getWindow();
     stage.close();
    }
}
