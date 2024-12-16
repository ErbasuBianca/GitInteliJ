package com.skillbrain.modificatorideaccess1;

/*
### 6. **Modificatori de acces (public, private, default, protected)**

- **Exercițiu**: Creează o clasă `Persoana` cu atributele `nume` (public), `varsta` (protected), `adresa` (private) și
 `telefon` (default). Creează metode publice pentru a accesa și modifica aceste atribute. Testează accesibilitatea atributelor
 și metodelor dintr-o altă clasă.
 */


public class ModificatoriDeAcces1 {
    public static void main(String[] args) {
        Persoana persoana = new Persoana("Andreea", 24, "Dejului 1", "072908423585");
        System.out.println("-----------------");
        System.out.println("Nume: " + persoana.nume);
        System.out.println("Varsta: " + persoana.varsta);
        System.out.println("Adresa: " + persoana.getAdresa());
        System.out.println("Telefon: " + persoana.telefon);
        System.out.println("--------------------------\n Acum modificam atributele obiectului nostru");
        persoana.nume = "Andrei";
        System.out.println("Nume: " + persoana.nume);
        persoana.varsta = 30;
        System.out.println("Varsta: " + persoana.varsta);
        persoana.setAdresa("Teleorman 13");
        System.out.println("Adresa: " + persoana.getAdresa());
        persoana.telefon = "075395137478";
        System.out.println("Telefon: " + persoana.telefon);
    }
}
