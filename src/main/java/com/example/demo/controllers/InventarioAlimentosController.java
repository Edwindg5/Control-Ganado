package com.example.demo.controllers;

import com.example.demo.App;
import com.example.demo.models.Alimento;
import com.example.demo.models.InventarioAlimentos;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class InventarioAlimentosController {

    public AnchorPane ancInventarioAlimentos;

    @FXML
    private Button btnVerSugeridos;

    @FXML
    private Button btnEliminar;

    @FXML
    private Button btnAgregar;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtCantidad;

    @FXML
    private TableView<Alimento> tablaAlimentos;

    @FXML
    private TableColumn<Alimento, String> columnaNombre;

    @FXML
    private TableColumn<Alimento, Integer> columnaCantidad;

    private ObservableList<Alimento> listaAlimentos = FXCollections.observableArrayList();

    private InventarioAlimentos inventario = new InventarioAlimentos();

    @FXML
    public void initialize() {
        System.out.println("Inicializando InventarioAlimentosController...");

        columnaNombre.setCellValueFactory(cellData -> cellData.getValue().nombreProperty());
        columnaCantidad.setCellValueFactory(cellData -> cellData.getValue().cantidadProperty().asObject());

        tablaAlimentos.setItems(listaAlimentos);
    }

    @FXML
    public void agregarAlimento() {
        String nombre = txtNombre.getText();
        String cantidadText = txtCantidad.getText();

        if (nombre.isEmpty() || cantidadText.isEmpty()) {
            mostrarMensaje("Por favor, complete todos los campos.");
            return;
        }

        int cantidad;
        try {
            cantidad = Integer.parseInt(cantidadText);
        } catch (NumberFormatException e) {
            mostrarMensaje("Por favor, ingrese una cantidad válida.");
            return;
        }

        Alimento alimento = new Alimento(nombre, cantidad);
        inventario.agregarAlimento(alimento);
        listaAlimentos.add(alimento);

        mostrarMensaje("Alimento agregado correctamente.");
    }


    @FXML
    public void eliminarAlimento() {
        int indiceSeleccionado = tablaAlimentos.getSelectionModel().getSelectedIndex();
        if (indiceSeleccionado >= 0) {
            listaAlimentos.remove(indiceSeleccionado);
            mostrarMensaje("Alimento eliminado correctamente.");
        } else {
            mostrarMensaje("Seleccione un alimento para eliminar.");
        }
    }

    private void mostrarMensaje(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Gestión de Inventario de Alimentos");
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    @FXML
    public void verAlimentosSugeridos() {
        App.newStage("verAlimentosSugeridos-view", "App VerAlimentosSugeridos-view");
    }

    public void onClickedSalir(MouseEvent event) {
        Stage stage = (Stage) ancInventarioAlimentos.getScene().getWindow();
        stage.close();
    }
}
