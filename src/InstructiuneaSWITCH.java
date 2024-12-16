/*
#### Sintaxa
'''' java
switch (variabila){
    case valoare1:
    // cod pentru valoare1
    break;
    case valoare2:
    // cod pentru valoare2
    break;

   // ....
   default:
   // cod implicit daca niciuna dintre valori nu este potrivita
   break
   }
 */


public class InstructiuneaSWITCH {
    public static void main(String[] args) {
        // sa se afiseze ziua saptamanii in functie de numarul introdus de utilizator
        int ziua = 0;

        switch (ziua) {
            case 1:
                System.out.println("Luni");
                break;
            case 2:
                System.out.println("Marti");
                break;
            case 3:
                System.out.println("Miercuri");
                break;
            default:
                System.out.println("Marti");
                break;
        }
        System.out.println(returneazaZiuaSaptamaniiCaSiUnNumar("Sambata"));
    }

    public static int returneazaZiuaSaptamaniiCaSiUnNumar(String zi) {
        return switch (zi) {
            case "Luni" -> 1;
            case "Marti" -> 2;
            case "Miercuri" -> 3;
            case "Joi" -> 4;
            case "Vineri" -> 5;
            case "Sambata" -> 6;
            case "Duminica" -> 7;
            default -> 0;
        };
    }

    }
