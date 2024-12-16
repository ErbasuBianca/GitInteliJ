package com.skillbrain;

/*
### Exercițiul 2: Citirea și afișarea unui nume complet

**Descriere:** Scrie un program care citește numele și prenumele unei persoane ca două intrări separate și creaza o metoda care sa
afișează numele complet într-o singură linie.

**Exemplu de ieșire:**
```
Introdu prenumele: Maria
Introdu numele de familie: Popescu
Numele complet este: Maria Popescu
 */

import java.util.Scanner;

public class Exercitiul2 {

     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Introdu prenumele: ");
         String prenume = scanner.nextLine();
         System.out.println("Introdu numele de familie: ");
         String nume = scanner.nextLine();
         aliprireNume (nume,  prenume);
         scanner.close();
     }
    public static void aliprireNume(String nume, String prenume){
       String numeComplet = prenume + nume;
        System.out.println("Numele complet este: "+ numeComplet);

    }
}
