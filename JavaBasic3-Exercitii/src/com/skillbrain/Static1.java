package com.skillbrain;

/*
    - **Exercițiu**: Creează o clasă `Contor` care are o variabilă statică `numarObiecte`. Incrementați această variabilă de
    fiecare dată când se creează un nou obiect din această clasă. Creează mai multe obiecte și afișează valoarea lui `numarObiecte`.
 */

import com.skillbrain.clase.Contor;

public class Static1 {

    public static void main(String[] args) {
        Contor c1 = new Contor();
        Contor c2 = new Contor();
        Contor c3 = new Contor();
        Contor c4 = new Contor();
        Contor c5 = new Contor();

        Contor.afiseazaNumarObiecte();
    }
}
