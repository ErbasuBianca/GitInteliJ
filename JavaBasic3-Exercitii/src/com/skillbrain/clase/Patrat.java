package com.skillbrain.clase;

public class Patrat extends Forma{

    //atribute
    double latura;

    //constructor
    public Patrat(double latura){
        this.latura = latura;
    }

    //metode
    public double calculeazaAria() {
        return latura * latura;
    }
}
