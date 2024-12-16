package com.skillbrain;

public class Cerc extends ObiectGrafic {

    double raza;

    Cerc(double raza, double x, double y) {
        super(x, y); // new com.skillbrain.ObiectGrafic(x, y)
        this.raza = raza;
    }

    public double aria() {
        return Math.PI * raza * raza;
    }

    public double perimetru() {
        return 2 * Math.PI * raza;
    }
}
