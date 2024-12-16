package com.skillbrain.incapsularea;

public class Student {
    private String nume;
    private int varsta;
    private double medie;

    // Constructor
    Student(String nume, int varsta, double medie) {
        this.nume = nume;
        this.varsta = varsta;
        setMedie(medie);
    }

    // Getters
    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public double getMedie() {
        return medie;
    }

    // Setters
    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setMedie(double medie) {
        if (medie >= 1 && medie <= 10) {
            this.medie = medie;
        } else {
            System.out.println("Media trebuie să fie între 1 și 10. Setare implicită: 5.");
            this.medie = 5;
        }
    }
}
