package com.skillbrain.clase;

public class Vehicul {
    //atribute
    String marca;
    int vitezaMaxima;

    //constructor
    public Vehicul(String marca, int vitezaMaxima){
        this.marca = marca;
        this.vitezaMaxima = vitezaMaxima;
    }

    //metode
    public void afiseazaDetalii(){
        System.out.print("Marca: " + marca + ", viteza maxima: " + vitezaMaxima + " km/h");
    }
}
