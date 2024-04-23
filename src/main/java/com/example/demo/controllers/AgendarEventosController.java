package com.example.demo.controllers;

import com.example.demo.models.Eventos;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class AgendarEventosController {

    public AnchorPane ancEvento;
    @FXML
    private Button btnAgregarEvento;

    @FXML
    private DatePicker dateFecha;

    @FXML
    private TextField txtNombreEvento;

    @FXML
    private TextArea txtDescripcionEvento;

    @FXML
    private TableView<EventoController> tblEventos;

    @FXML
    private TableColumn<EventoController, String> colNombreEvento;

    @FXML
    private TableColumn<EventoController, LocalDateTime> colFechaEvento;

    @FXML
    private TableColumn<EventoController, String> colDescripcionEvento;

    private ObservableList<EventoController> listaEventos = FXCollections.observableArrayList();

    public void initialize() {
        colNombreEvento.setCellValueFactory(cellData -> cellData.getValue().nombreProperty());
        colFechaEvento.setCellValueFactory(cellData -> cellData.getValue().fechaHoraProperty());
        colDescripcionEvento.setCellValueFactory(cellData -> cellData.getValue().descripcionProperty());
        tblEventos.setItems(listaEventos);

        colFechaEvento.setCellFactory(new Callback<TableColumn<EventoController, LocalDateTime>, TableCell<EventoController, LocalDateTime>>() {
            @Override
            public TableCell<EventoController, LocalDateTime> call(TableColumn<EventoController, LocalDateTime> param) {
                return new TableCell<EventoController, LocalDateTime>() {
                    @Override
                    protected void updateItem(LocalDateTime item, boolean empty) {
                        super.updateItem(item, empty);
                        if (empty || item == null) {
                            setText(null);
                            setGraphic(null);
                        } else {
                            LocalDateTime ahora = LocalDateTime.now();
                            long diasRestantes = ChronoUnit.DAYS.between(ahora, item);
                            if (diasRestantes == 0) {
                                setText("¡Hoy!");
                            } else if (diasRestantes == 1) {
                                setText("Mañana");
                            } else {
                                setText(diasRestantes + " días");
                            }
                        }
                    }
                };
            }
        });
    }

    @FXML
    void agregarEvento(ActionEvent actionEvent) {
        try {
            String nombre = txtNombreEvento.getText();
            LocalDateTime fecha = dateFecha.getValue().atStartOfDay();
            String descripcion = txtDescripcionEvento.getText();
            EventoController nuevoEvento = new EventoController(nombre, fecha, descripcion);
            listaEventos.add(nuevoEvento);
            limpiarCampos();
        } catch (Exception e) {
            mostrarAlerta("Error", "Ingrese valores válidos para el evento.", AlertType.ERROR);
        }
    }

    private void limpiarCampos() {
        txtNombreEvento.clear();
        dateFecha.setValue(null);
        txtDescripcionEvento.clear();
    }

    private void mostrarAlerta(String titulo, String mensaje, AlertType tipoAlerta) {
        Alert alerta = new Alert(tipoAlerta);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }

    public void onClickedSalir(MouseEvent event) {
        Stage stage= (Stage) ancEvento.getScene().getWindow();
        stage.close();
    }
}
