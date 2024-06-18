package com.example.demo.controllers;

import com.example.demo.models.Becerro;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class BecerroController {

    public AnchorPane ancBecerro;
    public Button btnEliminar;
    public Button btnAgregar;
    public Button btnSalir;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtPeso;
    @FXML
    private TextField txtRaza;
    @FXML
    private TextField txtSexo;
    @FXML
    private TableView<Becerro> tablaBecerros;
    @FXML
    private TableColumn<Becerro, String> colNombre;
    @FXML
    private TableColumn<Becerro, Double> colPeso;
    @FXML
    private TableColumn<Becerro, String> colRaza;
    @FXML
    private TableColumn<Becerro, String> colSexo;

    private ObservableList<Becerro> listaBecerros = FXCollections.observableArrayList();

    private static ObservableValue<Double> call(TableColumn.CellDataFeatures<Becerro, Double> cellData) {
        return cellData.getValue().pesoProperty();
    }

    @FXML
    public void agregarBecerro() {
        String nombre = txtNombre.getText();
        double peso = Double.parseDouble(txtPeso.getText());
        String raza = txtRaza.getText();
        String sexo = txtSexo.getText();

        Becerro becerro = new Becerro(nombre, peso, raza, sexo);
        listaBecerros.add(becerro);

        limpiarCampos();
    }

    @FXML
    public void eliminarBecerro() {
        Becerro selectedItem = tablaBecerros.getSelectionModel().getSelectedItem();
        if (selectedItem != null) {
            listaBecerros.remove(selectedItem);
        }
    }

    @FXML
    public void salir() {
        Stage stage = (Stage) ancBecerro.getScene().getWindow();
        stage.close();
    }

    private void limpiarCampos() {
        txtNombre.clear();
        txtPeso.clear();
        txtRaza.clear();
        txtSexo.clear();
    }
}
