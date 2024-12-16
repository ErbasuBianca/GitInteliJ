package com.skillbrain.modificatorideaccess1;

public class Persoana {
    //atribute
    public String nume; //Public
    protected int varsta; //Protected
    private String adresa; //Private
    String telefon; //Default

    //Constructoru
    Persoana(String nume, int varsta, String adresa, String telefon) {
        this.nume = nume;
        this.varsta = varsta;
        this.adresa = adresa;
        this.telefon = telefon;
    }

    // Metoda pentru accesarea adresei (getter)
    public String getAdresa(){
        return adresa;
    }

    // Metoda pentru setarea adresei (setter)
    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }



}
