package com.skillbrain.ex3;

public class Angajat {
    private String nume;
    private double salariu;

    public Angajat(String nume, double salariu) throws SalariuInvalidException {
        this.nume = nume;
        setSalariu(salariu);

    }
    public void setSalariu(double salariu) throws SalariuInvalidException {
        if (salariu <=0){
            throw new SalariuInvalidException("Salariul trebuie sa fie pozitiv!");
        }
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "nume='" + nume + '\'' +
                ", salariu=" + salariu +
                '}';
    }
}
