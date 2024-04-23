package com.example.demo.models;

import com.example.demo.controllers.EventoController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Eventos {
    private static ObservableList<EventoController> listaEventos = FXCollections.observableArrayList();

    public static void agregarEvento(EventoController evento) {
        listaEventos.add(evento);
    }

    public static ObservableList<EventoController> obtenerEventos() {
        return listaEventos;
    }
}