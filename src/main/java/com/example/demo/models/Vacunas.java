package com.example.demo.models;

import java.time.LocalDate;

public class Vacunas {
    private String animal;
    private String vacuna;
    private LocalDate fecha;
    public boolean status;
    private String nombre;

    public Vacunas(String nombre, String animal, String vacuna, LocalDate fecha) {
        this.nombre = nombre;
        this.animal = animal;
        this.vacuna = vacuna;
        this.fecha = fecha;
        this.status = true;
    }
    public void setAnimal(String animal) {
        this.animal = animal;
    }
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setVacuna(String vacuna) {
        this.vacuna = vacuna;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public void setStatus(boolean status) {this.status =status;}
    public boolean isStatus() {return status;}
    public String getAnimal() {
        return animal;
    }

    public String getVacuna() {
        return vacuna;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    public String getNombre() {return nombre;}
    @Override
    public String toString() {
        return "Vacunas{" +
                "animal='" + animal + '\'' +
                ", vacuna='" + vacuna + '\'' +
                ", fecha=" + fecha +
                '}';
    }

}
