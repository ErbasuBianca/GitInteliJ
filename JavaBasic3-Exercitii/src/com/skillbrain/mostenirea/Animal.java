package com.skillbrain.mostenirea;

public class Animal {
    String nume;

    Animal(String nume) {
        this.nume = nume;
    }

    void mananca() {
        System.out.println(nume + " mănâncă.");
    }
}
