
/*Exercițiul 1: Adunarea a două numere întregi



**Descriere:** Scrie un program care citește două numere întregi de la tastatură și afișează suma lor.



**Exemplu de ieșire:**

        ```

Introdu primul număr: 10

Introdu al doilea număr: 20

Suma celor două numere este: 30

 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercitiul1 {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu primul numar: ");
        int numarul1 = scanner.nextInt();

        System.out.println("Introdu al doilea numar: ");
        int numarul2 = scanner.nextInt();

        afiseazaSuma(numarul1, numarul2);
        scanner.close();

    }

    public static void afiseazaSuma(int primulNumar, int alDoileaNumar){

        int suma = primulNumar+alDoileaNumar;
        System.out.println("Suma celor doua numere este: " + suma);

    }
}
