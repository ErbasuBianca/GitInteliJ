/*
   ### Sintaxa
   '''' java
   while (conditie){
   /// cod care se executa in bucla
   }
 */

import java.util.Scanner;

public class InstructiuneaWHILE {
    public static void main(String[] args){
        int counter = 1;
        while (counter <=5){
            System.out.println("Numar: " + counter);
            counter++;
        }
        System.out.println("-------------");

        calculator();
    }
    //Programul calculeaza suma numerelor de utilizator pana cand suma depaseste 100
    public static void calculator(){
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        while (suma <=100){
            System.out.println("Introduceri un numar: ");
            int numar = scanner.nextInt();
            suma += numar;
        }
        System.out.println("Suma totala este: " + suma);

    }
}

