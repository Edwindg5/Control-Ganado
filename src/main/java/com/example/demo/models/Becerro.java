package com.example.demo.models;

import javafx.beans.binding.BooleanExpression;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;

import java.util.Random;

public class Becerro {
    private String id;
    private String nombre;
    private double peso;
    private String raza;
    private String sexo;

    public Becerro(String nombre, double peso, String raza, String sexo) {
        this.id = generateRandomId();
        this.nombre = nombre;
        this.peso = peso;
        this.raza = raza;
        this.sexo = sexo;
    }

    private String generateRandomId() {
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
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public String getRaza() {
        return raza;
    }

    public String getSexo() {
        return sexo;
    }

    public ObservableValue<String> idProperty() {
        return new SimpleStringProperty(id);
    }

    public ObservableValue<String> nombreProperty() {
        return new SimpleStringProperty(nombre);
    }

    public ObservableValue<Double> pesoProperty() {
        return new SimpleDoubleProperty(peso).asObject();
    }

    public ObservableValue<String> razaProperty() {
        return new SimpleStringProperty(raza);
    }

    public ObservableValue<String> sexoProperty() {
        return new SimpleStringProperty(sexo);
    }
}
