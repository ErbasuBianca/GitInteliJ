import java.util.Scanner;

/*
### Sintaxa
''' java
do{
   /// cod care se executa cel putin o data
   } while (conditie)
 */
public class InstructiuneaDO_WHILE {

    public static void main(String[] args) {
        int counter = 1;
        do {
            System.out.println("Numar: " + counter + "\n");
            counter++;
        } while (counter <= 5);

        System.out.println("-----------");


        validatePin();
    }
    // Programul solicita utilizatorului sa intriduca PIN-ul pana cand este acesta corect

    public static void validatePin() {
        Scanner scanner = new Scanner(System.in);
        int pinCorrect = 1234;
        int pin;

        do {
            System.out.println("Introduceti PIN-ul: ");
            pin = scanner.nextInt();
        } while (pin != pinCorrect);

        System.out.println("PIN corect! Acces permis");
    }
}
