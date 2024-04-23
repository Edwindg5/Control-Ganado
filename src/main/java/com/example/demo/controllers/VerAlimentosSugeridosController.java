package com.example.demo.controllers;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class VerAlimentosSugeridosController {

    @FXML
    private TableView<Alimento> tablaAlimentosSugeridos;

    @FXML
    private TableColumn<Alimento, String> columnaNombreSugerido;

    @FXML
    private TableColumn<Alimento, Integer> columnaCantidadSugerida;

    @FXML
    private TableColumn<Alimento, Double> columnaPrecioSugerido;

    private ObservableList<Alimento> listaAlimentosSugeridos = FXCollections.observableArrayList();

    public void initialize() {
        columnaNombreSugerido.setCellValueFactory(cellData -> cellData.getValue().nombreProperty());
        columnaCantidadSugerida.setCellValueFactory(cellData -> cellData.getValue().cantidadProperty().asObject());
        columnaPrecioSugerido.setCellValueFactory(cellData -> cellData.getValue().precioProperty().asObject());

        cargarAlimentosSugeridos();
        tablaAlimentosSugeridos.setItems(listaAlimentosSugeridos);
    }

    private void cargarAlimentosSugeridos() {
        listaAlimentosSugeridos.add(new Alimento("Manzana", 5, 2.5));
        listaAlimentosSugeridos.add(new Alimento("Banana", 3, 1.8));
        listaAlimentosSugeridos.add(new Alimento("Naranja", 4, 3.0));
        listaAlimentosSugeridos.add(new Alimento("Pollinaza",2,500));
    }

    public static class Alimento {
        private final SimpleStringProperty nombre;
        private final SimpleIntegerProperty cantidad;
        private final SimpleDoubleProperty precio;

        public Alimento(String nombre, int cantidad, double precio) {
            this.nombre = new SimpleStringProperty(nombre);
            this.cantidad = new SimpleIntegerProperty(cantidad);
            this.precio = new SimpleDoubleProperty(precio);
        }

        public String getNombre() {
            return nombre.get();
        }

        public SimpleStringProperty nombreProperty() {
            return nombre;
        }

        public SimpleIntegerProperty cantidadProperty() {
            return cantidad;
        }

        public SimpleDoubleProperty precioProperty() {
            return precio;
        }
    }
}
