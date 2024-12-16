package com.skillbrain.mostenirea;

public class Pasare extends Animal{
    Pasare(String nume) {
        super(nume);
    }

    void zboara() {
        System.out.println(nume + " zboară.");
    }
}
