package com.skillbrain.clase;

public class Carte1 {
    private String titlu;
    private String autor;

    public Carte1(String titlu, String autor) {
        this.titlu = titlu;
        this.autor = autor;
    }
    public void afiseazaDetalii() {
        System.out.println("Titlu:" +titlu+ "Autor:" +autor);
    }

}
