package com.skillbrain.clase;

public class Cerc extends Forma{

    //atribute
    double raza;

    //constructor
    public Cerc(double raza){
        this.raza = raza;
    }

    //metoda
    public double calculeazaAria() {
        return Math.PI * raza * raza;
    }
}
