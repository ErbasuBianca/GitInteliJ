package com.skillbrain.clase;

public class Masina extends Vehicul{

    //atribute
    int numarUsi;
    //constructor
    public Masina(String marca, int vitezaMaxima, int numarUsi) {
        super(marca, vitezaMaxima);
        this.numarUsi = numarUsi;
    }
    //

    @Override
    public void afiseazaDetalii() {
        super.afiseazaDetalii();
        System.out.println(" numar de usi: " + numarUsi);
    }
}
