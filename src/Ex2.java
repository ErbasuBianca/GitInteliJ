/*
2. **Clasificare notă**

Creează un program care primește o notă de la tastatură (între 1 și 10) și folosește o instrucțiune
`if-else` sau `switch` pentru a afișa un mesaj de evaluare
(1-4: "Insuficient", 5-6: "Suficient", 7-8: "Bine", 9-10: "Foarte Bine").
 */

import java.util.Scanner;

public class Ex2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduceti un nr de la 1 la 10 : ");
            int nota = scanner.nextInt();
            switch (nota) {
                case 1, 2, 3, 4 :
                    System.out.println("Insuficient");
                    break;
                case 5, 6:
                    System.out.println("Suficient");
                    break;
                case 7, 8:
                    System.out.println("Bine");
                    break;
                case 9, 10:
                    System.out.println("Foarte bine");
                    break;
                default:
                    System.out.println("Nota introdusa nu este valida");
                    scanner.close();
            }
        }
    }