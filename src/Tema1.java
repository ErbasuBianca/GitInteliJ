import java.util.Scanner;
public class Tema1 {

    public static void main(String[] args) {
                 //afisam mesajul imi place java
                  System.out.println("Imi place Java");


                //afisam de 6 ori mesajul cursul acesta este foarte fain
                 for (int i = 0; i < 6; i++) {
                         System.out.println("Cursul acesta este foarte fain");
                     }

                 // dam nr pntru varsta Anei și diferența de vârstă
                  int varstaAna = 24;
                 int diferentaVarsta = 6;

                  // calculam varsta lui David
                   int varstaDavid = varstaAna - diferentaVarsta;

                   // afisam varssta lui David
                  System.out.println("Varsta lui David este: " + varstaDavid);




                 // cream un obiect Scanner pentru a citi de la tastatura
                  Scanner scanner = new Scanner(System.in);

                  // afisam un mesaj pentru a cere o propozitie de la utilizator
                System.out.println("Introduceți o propoziție:");

                  // citim propozitia introdusa de utilizator
                  String propozitie = scanner.nextLine();

                 // afisam propozitia citita
                 System.out.println("Ați introdus propoziția: " + propozitie);

                  // incheiem scannerul pentru a elibera resursele
                 scanner.close();

                  // apelamla  metoda myVariables
                  myVariables();
             }
      // definim metoda myVariables
             public static void myVariables() {
                  // numim variabilele
                   int numar = 54;
                  String mesaj = "Aceasta este o variabilă de tip String";
                boolean esteAdevarat = true;


                 // afisam variabilele
                 System.out.println("Valoarea variabilei int: " + numar);
                 System.out.println("Valoarea variabilei String: " + mesaj);
                   System.out.println("Valoarea variabilei boolean: " + esteAdevarat);
             }

             // numim  citesteSiAfiseazaNumere
             public static void citesteSiAfiseazaNumere() {
                 // Cream un obiect Scanner pentru a citi de la tastatură
                 Scanner scanner = new Scanner(System.in);

                 // citim primul numar
                 System.out.println("Introduceti primul numar:");
                 int numar1 = scanner.nextInt();

                 // citim al doilea numar
                 System.out.println("Introduceti al doilea număr:");
                 int numar2 = scanner.nextInt();

                 // Afișăm numerele citite
                 System.out.println("Primul număr introdus este: " + numar1);
                 System.out.println("Al doilea număr introdus este: " + numar2);
                 // Închidem scannerulscanner.close();
                 scanner.close();
             }
             }
