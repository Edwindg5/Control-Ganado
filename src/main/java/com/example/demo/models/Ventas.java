package com.example.demo.models;

import java.util.ArrayList;

public class Ventas {

    private String nombre;
    private int quesocosto ;
    private int cremacosto ;
    private int costo;
    private int cantidad;
    private int total;
    public Ventas(String nombre, int costo, int total, int cantidad) {
        this.nombre = nombre;
        quesocosto = 45;
        cremacosto = 35;
        this.cantidad = cantidad;
        this.costo = costo;
        this.total = total;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setQuesocosto(int quesocosto) {
        this.quesocosto = quesocosto;
    }

    public void setCremacosto(int cremacosto) {
        this.cremacosto = cremacosto;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getQuesoCosto() {return quesocosto;}
    public int getCremaCosto() {return cremacosto;}
    public String getQueso() {return nombre;}
    public int getCosto() {return costo;}
    public int getCantidad() {return cantidad;}
    public int getTotal(){return total;}
    @Override
    public String toString() {
        return "nombre: " + nombre  + " costo: " + costo + " total: " + total + " cantidad: " + cantidad;
    }

}
