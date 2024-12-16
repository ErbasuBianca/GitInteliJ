import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercitii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu un numar intreg: ");
        int numarIntreg = scanner.nextInt();
        System.out.println("Numarul intreg introdus este:" + numarIntreg);

        System.out.println("Introdu un numar zecimal: ");
        double numarZecimal = scanner.nextDouble();
        System.out.println("Numarul zecimal introdus este: " + numarZecimal);

        scanner.nextLine();
        System.out.println("Introdu un text:");
        String text = scanner.nextLine();
        System.out.println("Textul introdus este: " + text);

        scanner.close();


    }
}
