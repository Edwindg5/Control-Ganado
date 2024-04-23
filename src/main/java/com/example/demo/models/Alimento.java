package com.example.demo.models;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Alimento {
    private final StringProperty nombre;
    private final IntegerProperty cantidad;

    public Alimento(String nombre, int cantidad) {
        this.nombre = new SimpleStringProperty(nombre);
        this.cantidad = new SimpleIntegerProperty(cantidad);
    }

    public StringProperty nombreProperty() {
        return nombre;
    }

    public IntegerProperty cantidadProperty() {
        return cantidad;
    }
}
