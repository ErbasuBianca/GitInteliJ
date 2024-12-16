package com.skillbrain.suprascriere;

/*
### 7. **Suprascriere (Override)**

- **Exercițiu**: Creează o clasă `Instrument` cu metoda `canta()`. Creează clasele `Chitara` și `Pian` care extind `Instrument`
și suprascriu metoda `canta()`. Instanțiază obiecte din fiecare clasă și cheamă metoda `canta()`.
 */

public class Suprascriere {
    public static void main(String[] args) {
        Instrument chitara = new Chitara();
        Instrument pian = new Pian();

        System.out.println("Apeland chitara.canta() primim rezultatul");
        chitara.canta();
        System.out.println("Apeland pian.canta() primim rezultatul");
        pian.canta();
    }
}
