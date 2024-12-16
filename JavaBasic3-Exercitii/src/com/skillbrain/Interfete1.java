package com.skillbrain;

/*
- **Exercițiu**: Creează o interfață `Animal` cu metodele `mananca()` și `scoateSunet()`. Implementează această interfață
în două clase `Pisica` și `Caine`. Creează obiecte ale celor două clase și apelează metodele definite.
 */

import com.skillbrain.clase.Animal;
import com.skillbrain.clase.Caine;
import com.skillbrain.clase.Pisica;

public class Interfete1 {
    public static void main(String[] args) {
        Animal pisica = new Pisica();
        Animal caine = new Caine();

        pisica.mananca();
        pisica.scoateSunet();

        caine.mananca();
        caine.scoateSunet();
    }
}
