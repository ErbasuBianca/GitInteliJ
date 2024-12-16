package com.skillbrain;

public class Persoana {

    public static String SPECIE = "homo-sapiens";

    //attribute
    String nume;
    int varsta;
    String adresa;

    //constructori
    Persoana() {
        nume = "Maria";
        varsta = 24;
        adresa = "Str. Tesla, nr 20";
    }

    Persoana(String nume, int varsta){
        this.nume = nume ;
        this.varsta = varsta;
    }

    //metode
    void plimbare(){
        System.out.println("Eu ma plimb in parc");
    }

    void gateste(){
        System.out.println("Eu gatesc cina");
    }

    public static boolean respira(int dataDecedarii) {
        return dataDecedarii > 0 ? false : true;
    }
}
