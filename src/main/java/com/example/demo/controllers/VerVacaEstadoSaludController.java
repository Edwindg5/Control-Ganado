package com.example.demo.controllers;

import com.example.demo.App;
import com.example.demo.models.Vacas;
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

public class VerVacaEstadoSaludController implements Initializable {
    @FXML
    private Button buttonSalir;
    @FXML
    private AnchorPane anchorPaneVacas;

    @FXML
    private TableColumn IdColumn;

    @FXML
    private TableColumn NombreColumn;

    @FXML
    private TableColumn SaludColumn;

    @FXML
    private TableView<Vacas> tblVacas;
    private ObservableList<Vacas> vacas;
    Stage stage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        vacas = FXCollections.observableArrayList();
        ArrayList<Vacas> listvacas;
        listvacas= App.getGanado().getVacas();
        this.NombreColumn.setCellValueFactory(new PropertyValueFactory("nombre"));
        this.IdColumn.setCellValueFactory(new PropertyValueFactory("id"));
        this.SaludColumn.setCellValueFactory(new PropertyValueFactory("salud"));
        for(short i=0;i<listvacas.size();i++) {
            if(listvacas.get(i).getStatus()) {
                vacas.add(listvacas.get(i));
            }
        }
        tblVacas.setItems(vacas);
    }
    @FXML
    void OnClickSalir(MouseEvent event) {
        stage = (Stage)anchorPaneVacas.getScene().getWindow();
        stage.close();
    }
}
