package com.skillbrain.abstractizare;

/*
### 9. **Abstractizare**

- **Exercițiu**: Creează o clasă abstractă `Joc` cu metoda abstractă `joaca()`. Extinde clasa în `Fotbal` și `Sah`, implementând
`joaca()` pentru fiecare. Creează un obiect pentru fiecare joc și afișează comportamentul.
 */

public class Abstractizare {
    public static void main(String[] args) {
        Joc fotbal = new Fotbal();
        Joc sah = new Sah();

        System.out.print("fotbal.joaca() imi returneaza -> ");
        fotbal.joaca();
        System.out.print("sah.joaca() imi returneaza -> ");
        sah.joaca();
    }
}
