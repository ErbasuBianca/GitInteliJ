/*
4. **Numere prime într-un interval**

Scrie un program care primește două numere de la tastatură (start și end) și folosește o buclă `for`
pentru a afișa toate numerele prime între aceste două valori.
 */

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        // Cream un obiect Scanner
        Scanner scanner = new Scanner(System.in);

        // Setam limitele intervalului
        System.out.print("Introduceti limita de inceput a intervlului: ");
        int start = scanner.nextInt();

        System.out.print("Introduceti limita de la sfarsitul intervalului: ");
        int end = scanner.nextInt();

        System.out.println("Numerele prime din intervalul [" + start + ", " + end + "] sunt:");


        for (int num = start; num <= end; num++) {
            if (estePrim(num)) { // Verificam daca numarul este prim
                System.out.print(num + " ");
            }
        }

        // Inchidem scanner
        scanner.close();
    }

    // Verificam daca un numar este prim
    public static boolean estePrim(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
