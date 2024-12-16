package com.skillbrain.incapsularea;
/*
    ### 10. **Încapsulare**

- **Exercițiu**: Creează o clasă `Student` cu atributele `nume`, `varsta` și `medie`. Fă atributele private și creează metode
publice `get` și `set` pentru a le accesa și modifica. Asigură-te că valoarea `medie` este întotdeauna între 1 și 10.
 */

public class Incapsularea {
    public static void main(String[] args) {
        Student student = new Student("Ana Popescu", 20, 9.5);
        System.out.println("Nume: " + student.getNume());
        System.out.println("Vârstă: " + student.getVarsta());
        System.out.println("Medie: " + student.getMedie());

        // Modificăm media la o valoare incorectă
        student.setMedie(15);
        System.out.println("Medie actualizată: " + student.getMedie());
    }
}
