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

public class VerVacasController implements Initializable {

    @FXML
    private AnchorPane anchorPaneVacas;
    @FXML
    private Button buttonSalir;

    @FXML
    private TableColumn<?, ?> idColumn;

    @FXML
    private TableColumn<?, ?> nombreColumn;

    @FXML
    private TableColumn<?, ?> pesoColumn;

    @FXML
    private TableColumn<?, ?> premiadaColumn;

    @FXML
    private TableColumn<?, ?> saludColumn;

    @FXML
    private TableView<Vacas> tableVacas;

    @FXML
    private TableColumn<?, ?> tipoColumn;
    ObservableList<Vacas> vacas;
    Stage stage;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        vacas = FXCollections.observableArrayList();
        ArrayList<Vacas> listvacas;
        listvacas = App.getGanado().getVacas();
        this.nombreColumn.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        this.pesoColumn.setCellValueFactory(new PropertyValueFactory<>("peso"));
        this.tipoColumn.setCellValueFactory(new PropertyValueFactory<>("tipo"));
        this.saludColumn.setCellValueFactory(new PropertyValueFactory<>("salud"));
        this.premiadaColumn.setCellValueFactory(new PropertyValueFactory<>("premiada"));
        for(short i=0;i<listvacas.size();i++) {
            if(listvacas.get(i).getStatus()) {
                vacas.add(listvacas.get(i));
            }
        }
        tableVacas.setItems(vacas);
    }

    @FXML
    void OnClickSalir(MouseEvent event) {
       stage = (Stage) anchorPaneVacas.getScene().getWindow();
       stage.close();
    }
}
