package com.skillbrain.Interfatasisupraincarare;
/*
#### 3. **Interfață și Supraincărcare**
   - **Exercițiu**: Creează o interfață `Transformabil` cu metoda `transforma()`. Creează două clase:
     - `TransformatorString`, care implementează `transforma()` pentru a schimba un șir în litere mari sau mici, în funcție de o suprascriere.
     - `TransformatorNumar`, care implementează `transforma()` pentru a converti un număr într-un alt format (de exemplu, pătrat sau dublu).
     Creează instanțe și testează metodele.
 */
public class Interfata {
    public static void main(String[] args) {
        Transformabil stringTransformer = new TransformatorString();
        Transformabil numberTransformer = new TransformatorNumar();

        stringTransformer.transforma("Java");
        numberTransformer.transforma("cinci");
    }
}
