/*
3. **Fibonacci cu `for`**

Scrie un program care afișează primele `n` numere din secvența Fibonacci, unde `n` este citit de la tastatură.
 Secvența Fibonacci începe cu 0 și 1, iar fiecare număr este suma celor două numere precedente.
 */

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("IntroduceÈ›i numÄƒrul de termeni din secvenÈ›a Fibonacci: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("IntroduceÈ›i un numÄƒr pozitiv.");
        } else {
            // Variabilele pentru primele douÄƒ numere Fibonacci
            int fib1 = 0;
            int fib2 = 1;
            System.out.println("Primele " + n + " numere din secvenÈ›a Fibonacci sunt:");
            for (int i = 1; i <= n; i++) {
                System.out.print(fib1 + " ");
                int nextFib = fib1 + fib2;
                fib1 = fib2;
                fib2 = nextFib;
            }
        }
        scanner.close();
    }
}
