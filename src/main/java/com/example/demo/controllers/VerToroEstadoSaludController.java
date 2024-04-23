package com.example.demo.controllers;

import com.example.demo.App;
import com.example.demo.models.Toros;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
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

public class VerToroEstadoSaludController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> IdColumn;

    @FXML
    private TableColumn<?, ?> NombreColumn;

    @FXML
    private TableColumn<?, ?> SaludColumn;

    @FXML
    private Button buttonSalir;

    @FXML
    private TableView<Toros> tblToros;
    private ObservableList<Toros> toros;

    @FXML
    private AnchorPane anchorPaneToros;
    Stage stage;

    @FXML
    void OnClickSalir(MouseEvent event) {
       stage = (Stage)anchorPaneToros.getScene().getWindow();
       stage.close();
    }

    @FXML
    void initialize() {
        toros = FXCollections.observableArrayList();
        ArrayList<Toros> listoros;
        listoros = App.getGanado().getToros();
        this.NombreColumn.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.IdColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        this.SaludColumn.setCellValueFactory(new PropertyValueFactory<>("salud"));
        for(short i=0;i<listoros.size();i++) {
            if(listoros.get(i).getStatus()) {
                toros.addAll(listoros.get(i));
                System.out.println(listoros.get(i));
            }
        }
        tblToros.setItems(toros);

    }

}