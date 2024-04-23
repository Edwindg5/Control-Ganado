package com.example.demo.controllers;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.util.ArrayList;
import java.util.List;

public class VerTablaVacunasSugeridasController {

    @FXML
    private TableView<VacunaSugerida> tblVacunasSugeridas;

    @FXML
    private TableColumn<VacunaSugerida, String> colNombreVacuna;

    @FXML
    private TableColumn<VacunaSugerida, String> colDescripcion;

    private ObservableList<VacunaSugerida> listaVacunasSugeridas = FXCollections.observableArrayList();

    public void initialize() {
        colNombreVacuna.setCellValueFactory(cellData -> cellData.getValue().nombreVacunaProperty());
        colDescripcion.setCellValueFactory(cellData -> cellData.getValue().descripcionProperty());

        cargarDatosVacunasSugeridas();
        tblVacunasSugeridas.setItems(listaVacunasSugeridas);
    }

    private void cargarDatosVacunasSugeridas() {
        List<VacunaSugerida> vacunasSugeridas = new ArrayList<>();
        vacunasSugeridas.add(new VacunaSugerida("Vacuna contra la Fiebre Aftosa", "Descripción:Esta vacuna protege al ganado contra la fiebre aftosa, una enfermedad viral altamente contagiosa que afecta a los animales de pezuña hendida, como vacas, cerdos, ovejas y cabras. La fiebre aftosa puede causar fiebre, ampollas en la boca y las pezuñas, lo que lleva a cojera y pérdida de apetito. La vacunación es crucial para prevenir la propagación de la enfermedad y proteger la salud del ganado."));
        vacunasSugeridas.add(new VacunaSugerida("Vacuna contra la Brucelosis ", "Descripción:La brucelosis es una enfermedad bacteriana que afecta al ganado, causando abortos espontáneos, infertilidad y disminución de la producción de leche. Esta vacuna protege contra la brucelosis bovina y ayuda a prevenir la transmisión de la bacteria Brucella abortus entre el ganado y a los humanos. "));
        vacunasSugeridas.add(new VacunaSugerida("Vacuna contra la Rabia", "Descripción:La rabia es una enfermedad viral mortal que afecta al sistema nervioso de los mamíferos, incluido el ganado. Se transmite a través de la saliva de animales infectados, como zorros, murciélagos y perros. La vacunación contra la rabia es esencial para prevenir esta enfermedad, que puede causar síntomas neurológicos, agresión y eventualmente la muerte. "));
        vacunasSugeridas.add(new VacunaSugerida("Vacuna contra la Clostridiosis","Descripcion:La clostridiosis es una enfermedad causada por diversas bacterias del género Clostridium, que pueden estar presentes en el suelo y en los intestinos de los animales. La vacuna contra la clostridiosis protege al ganado contra las enfermedades como el edema maligno, la enterotoxemia y la gangrena gaseosa, que pueden ser mortales si no se tratan adecuadamente."));
        vacunasSugeridas.add(new VacunaSugerida("Vacuna contra el Carbunco o Ántrax","Descripcion:El carbunco o ántrax es una enfermedad infecciosa causada por la bacteria Bacillus anthracis, que puede afectar al ganado y a otros animales, así como a los humanos. La vacuna contra el carbunco protege al ganado contra esta enfermedad grave, que puede causar fiebre alta, edema, dificultad respiratoria y la muerte en casos severos."));

        listaVacunasSugeridas.addAll(vacunasSugeridas);
    }

    public static class VacunaSugerida {
        private final SimpleStringProperty nombreVacuna;
        private final SimpleStringProperty descripcion;

        public VacunaSugerida(String nombreVacuna, String descripcion) {
            this.nombreVacuna = new SimpleStringProperty(nombreVacuna);
            this.descripcion = new SimpleStringProperty(descripcion);
        }

        public String getNombreVacuna() {
            return nombreVacuna.get();
        }

        public SimpleStringProperty nombreVacunaProperty() {
            return nombreVacuna;
        }

        public String getDescripcion() {
            return descripcion.get();
        }

        public SimpleStringProperty descripcionProperty() {
            return descripcion;
        }
    }
}
