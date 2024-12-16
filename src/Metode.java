package com.skillbrain;

public class Metode {
    public static void main(String[] arg) {
        System.out.println("Salut");
        afiseazaSalut();
        afiseazaSalut("Ana");

    }

    public static void afiseazaSalut() {
        System.out.println("Salut din metoda");
    }
    public static void afiseazaSalut(String numeleUneiPersoane) {
        System.out.println("Salut din metoda pentru " + numeleUneiPersoane );
    }
}