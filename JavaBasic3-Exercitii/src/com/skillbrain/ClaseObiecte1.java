package com.skillbrain;

/*
- **Exercițiu**: Creează o clasă `Carte` care să aibă următoarele atribute: `titlu`, `autor`, `numarPagini`. Creează o metodă
`afiseazaInformatii()` care să afișeze toate detaliile despre carte. Instanțiază două obiecte ale clasei `Carte` și afișează
informațiile despre ele.
 */

import com.skillbrain.clase.Carte;

public class ClaseObiecte1 {

    public static void main(String[] args) {
        Carte carte1 = new Carte("Micul Print", "Antoine de Saint-Exupery", 96);
        Carte carte2 = new Carte("1984", "George Orwell", 328);

        carte1.afiseazaInformatii();
        carte2.afiseazaInformatii();
    }
}
