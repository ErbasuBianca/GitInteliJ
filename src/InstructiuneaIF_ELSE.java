/*
/// Sintaxa
*** Java
if (conditie) {
   /// cod care se executa daca conditia este adevarata
   } else {
   // cod care se executa daca conditia este falsa
   }
 */

public class InstructiuneaIF_ELSE {
    public static void main(String[] args) {
        // vrem sa afisam daca o nota a trecut sau examenul
        int nota = 6;
        if (nota >= 5) {
            System.out.println("Ai promovat examenul");
        } else {
            System.out.println("Nu ai promovat examenul");
        }
        System.out.println("Asta va rula de fiecare data");

        lungimeaCuvantului("popicealbastre");
    }

    private static void lungimeaCuvantului(String cuvant) {
        if (cuvant.length() > 10) {
            System.out.println("Ai ales un cuvant lung");
        } else {
            System.out.println("Cuvantul ales este unul scurt");
        }
    }
}



