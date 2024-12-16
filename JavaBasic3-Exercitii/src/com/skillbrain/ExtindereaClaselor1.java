package com.skillbrain;

import com.skillbrain.clase.Masina;

/*
- **Exercițiu**: Creează o clasă `Vehicul` cu atributele `marca` și `vitezaMaxima`, și o metodă `afiseazaDetalii()`.
Extinde această clasă într-o clasă `Masina` care adaugă atributul `numarUsi`. Suprascrie metoda `afiseazaDetalii()` pentru
 a include și `numarUsi`.
 */
public class ExtindereaClaselor1 {
    public static void main(String[] args) {
        Masina masina = new Masina("Toyota", 180, 4);
        masina.afiseazaDetalii();
    }
}
