package com.skillbrain.polimorfism;
/*
### 11. **Polimorfism**

- **Exercițiu**: Creează o clasă `Vehicul` cu metoda `porneste()`. Creează două clase derivate: `Masina` și `Motocicleta`,
 fiecare suprascriind `porneste()`. Scrie un program care folosește un `Vehicul` pentru a apela `porneste()` pentru obiectele
 `Masina` și `Motocicleta`.
 */
public class Polimorfism {
    public static void main(String[] args) {
        Vehicul vehicul1 = new Masina();
        Vehicul vehicul2 = new Motocicleta();

        vehicul1.porneste();
        vehicul2.porneste();
    }
}
