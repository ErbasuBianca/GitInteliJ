package com.skillbrain;

public class Main {
    public static void main(String[] args) {
        Persoana persoana = new Persoana();

        System.out.println(persoana.nume);
        System.out.println(persoana.varsta);
        System.out.println(persoana.adresa);

        persoana.plimbare();
        persoana.gateste();

        Persoana persoana2 = new Persoana("Ionut" , 20);
        System.out.println(persoana2.nume);
        System.out.println(persoana2.varsta);
        System.out.println(persoana2.adresa);

        System.out.println(Persoana.SPECIE);
        System.out.println(Persoana.respira(0));

        System.out.println(persoana.SPECIE);
        System.out.println(persoana.respira(0));
    }
}
