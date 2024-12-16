package com.skillbrain.mostenirea;
/*
### 8. **Moștenire**

- **Exercițiu**: Creează o ierarhie de clase pentru animale: `Animal` (părinte), `Mamifer` și `Pasare` (copii). Adaugă
atribute și metode relevante în fiecare clasă. Instanțiază obiecte din clasele copil și testează moștenirea.


 */
public class Mostenirea {
    public static void main(String[] args) {
        Mamifer mamifer = new Mamifer("Urs");
        Pasare pasare = new Pasare("Vrabie");

        mamifer.mananca();
        mamifer.alapteaza();

        pasare.mananca();
        pasare.zboara();
    }
}
