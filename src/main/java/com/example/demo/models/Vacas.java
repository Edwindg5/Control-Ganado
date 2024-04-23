package com.example.demo.models;

public class Vacas extends Animales {
    private String premiada;
    public Vacas(String nombre, String id, float peso, String tipo, String salud, String premiada) {
        super(nombre, id, peso, tipo, salud);
        this.premiada = premiada;
    }
    public void setPremiada(String premiada) {this.premiada = premiada;}
    public String getPremiada() {return premiada;}

    @Override
    public String toString() {
        return "{" + "nombre: " + nombre + "\n" +  " id: " + id + "\n" + " peso: " + peso + "\n" +
                " tipo: " +tipo + "\n" + " salud: " + salud + "\n" + " premiada: " + premiada + "}";
    }

}
