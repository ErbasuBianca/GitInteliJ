package com.skillbrain.clase;

public class Contor {

    //atribute
    private static int numarObiecte = 0;
    //constructor
    public Contor(){
        numarObiecte++;
    }
    //metode
    public static void afiseazaNumarObiecte(){
        System.out.println("Numarul total de obiecte create: " + numarObiecte);
    }
}
