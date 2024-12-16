package com.skillbrain;

public class SubClasa extends SuperClasa{

    void metodaImplicita() {
        System.out.println("Metoda implicita din subclasa ");
    }

    protected void metodaProtected() {
        System.out.println("Metoda protected din subclasa ");
    }

    public void metodaPublica() {
        System.out.println("Metoda publica din subclasa ");
    }
}
