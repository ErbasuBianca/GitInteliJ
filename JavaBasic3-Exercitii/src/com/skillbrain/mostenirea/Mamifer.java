package com.skillbrain.mostenirea;

public class Mamifer extends Animal{
    Mamifer(String nume) {
        super(nume);
    }

    void alapteaza() {
        System.out.println(nume + " alăptează.");
    }
}
