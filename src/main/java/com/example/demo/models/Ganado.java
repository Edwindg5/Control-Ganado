package com.example.demo.models;

import java.util.ArrayList;

public class Ganado {

    public ArrayList<Animales> listAnimales = new ArrayList<>();
    public ArrayList<Toros> listToro = new ArrayList<>();
    public ArrayList<Vacas> listVaca = new ArrayList<>();
    public ArrayList<Becerro> listBecerro = new ArrayList<>();
    public ArrayList<Vacunas> listVacuna = new ArrayList<>();
    public ArrayList<Ventas> listVenta = new ArrayList<>();

    public void setListAnimales(ArrayList<Animales> listAnimales) {
        this.listAnimales = listAnimales;
    }

    public void setListToro(ArrayList<Toros> toro) {
        this.listToro = toro;
    }

    public void setListVaca(ArrayList<Vacas> vaca) {
        this.listVaca = vaca;
    }

    public void setListBecerro(ArrayList<Becerro> becerro) {
        this.listBecerro = becerro;
    }

    public void setListVacuna(ArrayList<Vacunas> vacuna) {
        this.listVacuna = vacuna;
    }

    public void setListVenta(ArrayList<Ventas> venta) {
        this.listVenta = venta;
    }

    public boolean statusToros(Toros toro1) {
        return listToro.add(toro1);
    }

    public boolean statusVacas(Vacas vaca1) {
        return listVaca.add(vaca1);
    }

    public boolean statusBecerro(Becerro becerro1) {
        return listBecerro.add(becerro1);
    }

    public boolean statusVacunas(Vacunas vacuna1) {
        return listVacuna.add(vacuna1);
    }

    public boolean statusVentas(Ventas venta1) {
        return listVenta.add(venta1);
    }

    public boolean statusAnimales(Animales animales1) {
        return listAnimales.add(animales1);
    }

    public ArrayList<Toros> getToros() {
        return listToro;
    }

    public ArrayList<Vacas> getVacas() {
        return listVaca;
    }

    public ArrayList<Vacunas> getVacunas() {
        return listVacuna;
    }

    public ArrayList<Ventas> getVentas() {
        return listVenta;
    }

    public ArrayList<Animales> getListAnimales() {
        return listAnimales;
    }

    public ArrayList<Becerro> getBecerros() {
        return listBecerro;
    }
}
