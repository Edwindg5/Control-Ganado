package com.example.demo.models;

public class Toros extends Animales {
    public Toros(String nombre, String id, float peso, String tipo, String salud) {
        super(nombre, id, peso, tipo, salud);
    }

    @Override
    public String toString() {
        return "{" + "nombre: " + nombre + "\n" + " id: " + id + "\n" + " peso: " + peso + "\n" +
                " tipo: " + tipo + "\n" +
                " salud: " + salud +  "\n" +"}";
    }


}
