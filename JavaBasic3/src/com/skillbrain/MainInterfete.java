package com.skillbrain;

import accese.Caine;

public class MainInterfete {

    public static void main(String[] args) {
        Caine caine = new Caine();

        caine.mananca();
        caine.sunet();

        System.out.println(caine.inteligenta);
        //caine.inteligenta = "crescuta";
        caine.reproducere();
        caine.vaneaza();

        Labrador labrador = new Labrador();
        labrador.mananca();
        labrador.sunet();
        labrador.reproducere();
        labrador.vaneaza();
        System.out.println(labrador.rasa());
    }
}
