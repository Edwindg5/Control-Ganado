package com.example.demo.models;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;

import java.util.Random;

public class Becerro {
    private String id;
    private SimpleStringProperty nombre;
    private SimpleDoubleProperty peso;
    private SimpleStringProperty raza;
    private SimpleStringProperty sexo;

    public Becerro(String id, String nombre, double peso, String raza, String sexo) {
        this.id = id;
        this.nombre = new SimpleStringProperty(nombre);
        this.peso = new SimpleDoubleProperty(peso);
        this.raza = new SimpleStringProperty(raza);
        this.sexo = new SimpleStringProperty(sexo);
    }

    public Becerro(String nombre, double peso, String raza, String sexo) {
        this(generateRandomId(), nombre, peso, raza, sexo);
    }

    private static String generateRandomId() {
        StringBuilder sb = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre.get();
    }

    public double getPeso() {
        return peso.get();
    }

    public String getRaza() {
        return raza.get();
    }

    public String getSexo() {
        return sexo.get();
    }

    public ObservableValue<String> idProperty() {
        return new SimpleStringProperty(id);
    }

    public ObservableValue<String> nombreProperty() {
        return nombre;
    }

    public ObservableValue<Double> pesoProperty() {
        return peso.asObject();
    }

    public ObservableValue<String> razaProperty() {
        return raza;
    }

    public ObservableValue<String> sexoProperty() {
        return sexo;
    }
}
