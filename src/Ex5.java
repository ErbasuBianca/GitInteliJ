import java.util.Scanner;

/*
5. **Generarea unui triunghi cu `while`**

Scrie un program care primește un număr întreg pozitiv `n`
și folosește o buclă `while` pentru a genera un triunghi de asteriscuri de `n` linii.
Fiecare linie trebuie să aibă un număr de asteriscuri egal cu numărul liniei curente.
 */
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        // Cream un obiect Scanner
        Scanner scanner = new Scanner(System.in);

        // Introdu un numar pozitv
        System.out.print("Introduceti un numar intreg pozitiv: ");
        int n = scanner.nextInt();

        // Verificam daca numarul este pozitiv
        if (n <= 0) {
            System.out.println("Introduceti un numar intreg pozitiv: ");
        } else {
            int i = 1;


            while (i <= n) {
                int j = 1;
                while (j <= i) {
                    System.out.print("*");
                    j++;
                }
                System.out.println();
                i++;
            }
        }

        // Inchidem scanner
        scanner.close();
    }
}


