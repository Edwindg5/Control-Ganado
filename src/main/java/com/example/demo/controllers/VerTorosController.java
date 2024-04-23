package com.example.demo.controllers;

import com.example.demo.App;
import com.example.demo.models.Toros;
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

public class VerTorosController implements Initializable {
    public Button buttonSalir;
    @FXML
    private AnchorPane anchorPaneToros;
    @FXML
    private TableColumn<?, ?> cuernosColumn;

    @FXML
    private TableColumn<?, ?> idColumn;

    @FXML
    private TableColumn<?, ?> lomoColumn;

    @FXML
    private TableColumn<?, ?> nombreColumn;

    @FXML
    private TableColumn<?, ?> pesoColumn;

    @FXML
    private TableColumn<?, ?> saludColumn;

    @FXML
    private TableView<Toros> tableToros;

    @FXML
    private TableColumn<?, ?> tipoColumn;

    ObservableList<Toros> toros;
    Stage stage;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        toros = FXCollections.observableArrayList();
        ArrayList<Toros> listoros;
        listoros = App.getGanado().getToros();
        this.nombreColumn.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        this.pesoColumn.setCellValueFactory(new PropertyValueFactory<>("peso"));
        this.tipoColumn.setCellValueFactory(new PropertyValueFactory<>("tipo"));
        this.saludColumn.setCellValueFactory(new PropertyValueFactory<>("salud"));
        for(short i=0;i<listoros.size();i++) {
            if(listoros.get(i).getStatus()) {
                toros.addAll(listoros.get(i));
                System.out.println(listoros.get(i));
            }
        }
        tableToros.setItems(toros);

    }

    @FXML
    void OnClickSalir(MouseEvent event) {
     stage = (Stage) anchorPaneToros.getScene().getWindow();
     stage.close();
    }


}
