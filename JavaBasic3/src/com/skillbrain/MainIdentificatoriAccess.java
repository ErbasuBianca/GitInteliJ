package com.skillbrain;

public class MainIdentificatoriAccess {

    public static void main(String[] args) {
        Labrador labrador = new Labrador();

        System.out.println(labrador.rasa);
        System.out.println(labrador.rasa());


        System.out.println(labrador.culoare);
        System.out.println(labrador.returneazaCuloare());

//        System.out.println(labrador.numarPicioare);
//        System.out.println(labrador.getNumarPicioare());
        System.out.println("---------");
        System.out.println(labrador.afiseazaSiReturneaza());
    }
}
