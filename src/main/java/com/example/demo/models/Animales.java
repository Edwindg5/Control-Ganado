package com.example.demo.models;

public class Animales {

     protected String nombre;
     protected String id;
     protected float peso;
     protected String tipo;
     protected String salud;
     private boolean status;
    public Animales(String nombre, String id, float peso, String tipo, String salud) {
        this.nombre = nombre;
        this.id = id;
        this.peso = peso;
        this.tipo = tipo;
        this.salud = salud;
        this.status = true;
    }
    public void setNombre(String nombre) {this.nombre=nombre;}
    public void setPeso(float peso) {this.peso =peso;}
    public void setTipo(float peso) {this.peso=peso;}
    public void setSalud(String salud) {this.salud=salud;}
    public void isStatus(boolean status) {this.status = status;}
    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public float getPeso() {
        return peso;
    }

    public String getTipo() {
        return tipo;
    }

    public String getSalud() {
        return salud;
    }
    public boolean getStatus() {return status;}
}
