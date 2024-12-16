package com.skillbrain;

import accese.Caine;

public class Labrador extends Caine {

    public String rasa = "labrador";
    String culoare = "maro";

    public String rasa(){
        return rasa;
    }

    String returneazaCuloare(){
        return culoare;
    }

    public void mananca() {
        System.out.println("Eu sunt labrador si imi place Pedigree");
    }

    public int afiseazaSiReturneaza(){
        System.out.println(numarPicioare);
        return getNumarPicioare();
    }
}
