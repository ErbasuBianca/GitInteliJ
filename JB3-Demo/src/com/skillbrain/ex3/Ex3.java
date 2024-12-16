package com.skillbrain.ex3;
/*
Exceptii personalizate**: Creeaza o clasa de exceptie "SalariuInvalidException". Creeaza o clasa "Angajati" care
valideaza salariul (trebuie sa fie pozitiv). Arunca exceptia persoanlizata daca salariul este invalid.
 */
public class Ex3 {
    public static void main(String[] args) {
        try {
            Angajat angajat = new Angajat("Ion", 2000);
            System.out.println(angajat);
            angajat.setSalariu(-100); // Arunce o exceptie
           // System.out.println(angajat);
        }catch (SalariuInvalidException e){
            System.out.println("Eroare :" + e.getMessage());
        }

    }
}
