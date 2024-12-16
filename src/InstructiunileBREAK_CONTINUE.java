/*
### Descriere
- **'break'** opreste complet executia unei bucle.
- **'continue'** sare peste iteratia curenta si trece la urmatoarea iteratie.
 */

public class InstructiunileBREAK_CONTINUE {

    public static void main(String[] args){
        for(int counter = 1; counter <=5; counter++){
            if(counter ==4){
                continue; // sarim peste valoarea 3
            }
            if (counter ==5){
                break; // oprim bucla la valoarea 5
            }
            System.out.println("Numar: " + counter);
        }
        System.out.println("\n.................");

        // ex2

        divizibilCu13(103);
    }
    public static void divizibilCu13(int numarref){
        for(int counter = 53; counter<=numarref; counter++){
            System.out.println(counter);
            if (counter % 13 ==0);
            System.out.println(("Primul numar divizibil cu 13 este: " + counter +"\n" ));
            break;
        }

    }
}
