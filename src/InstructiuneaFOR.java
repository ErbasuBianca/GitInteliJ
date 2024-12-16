/*
   ### Sintaxa
   ' ''' java
   for (initializare; conditie; incrementare) {
   /// cod care se executa in bucla
   }
 */

public class InstructiuneaFOR {

    public static void main(String[] args) {
        for(int counter =0; counter <10; counter++){
            System.out.println("Counterul este: " + counter);
        }
        numerePare( 2);
        sumaNNumere( 3);
    }
    // afiseaza toate numerele pare pana la variabila numar ca si parametru
    public static void numerePare(int numar){
        for (int counter = 1; counter <= numar; counter++){
            if (counter % 2 == 0){
            System.out.println(counter);

        }
    }
}
public static void sumaNNumere(int numarDeReferinta){
    int suma1 = 0;
    int suma2 = 0;
    for(int counter = 1; counter <= numarDeReferinta; counter++){
        suma2 += counter;
        suma1 = suma1 + counter;
    }
    System.out.println("Suma primelor " + numarDeReferinta + "numere este: "+ suma1);
    System.out.println("Suma primelor " + numarDeReferinta + "numere este: "+ suma2);
}
}
