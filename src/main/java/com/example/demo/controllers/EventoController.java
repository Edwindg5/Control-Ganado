package com.example.demo.controllers;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

import java.time.LocalDateTime;

public class EventoController {
    private SimpleStringProperty nombre;
    private SimpleObjectProperty<LocalDateTime> fechaHora;
    private SimpleStringProperty descripcion;

    public EventoController(String nombre, LocalDateTime fecha, String descripcion) {
        this.nombre = new SimpleStringProperty(nombre);
        this.fechaHora = new SimpleObjectProperty<>(fecha);
        this.descripcion = new SimpleStringProperty(descripcion);
    }

    public SimpleStringProperty nombreProperty() {
        return nombre;
    }

    public SimpleObjectProperty<LocalDateTime> fechaHoraProperty() {
        return fechaHora;
    }

    public SimpleStringProperty descripcionProperty() {
        return descripcion;
    }
}
