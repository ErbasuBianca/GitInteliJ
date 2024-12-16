package com.skillbrain;

/*
    - **Exercițiu**: Creează o clasă abstractă `Forma` cu o metodă abstractă `calculeazaAria()`. Extinde această clasă în
    două clase `Patrat` și `Cerc`, fiecare implementând `calculeazaAria()` conform formulelor matematice. Creează obiecte
    ale acestor clase și afișează aria fiecărei forme.
 */

import com.skillbrain.clase.Cerc;
import com.skillbrain.clase.Patrat;

public class ClaseAbstracte1 {
    public static void main(String[] args) {
        Patrat patrat = new Patrat(4);
        Cerc cerc = new Cerc(3);

        System.out.println("Aria patratului: " + patrat.calculeazaAria());
        System.out.println("Aria cercului: " + cerc.calculeazaAria());
    }
}
