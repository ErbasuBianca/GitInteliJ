package Ex2;
/*
Try-catch simplu**: Creaza o metoda 'imparte()' care primeste 2 numere si returneaza rezultatul impartirii.
Gestiunea exceptiei 'ArithmeticException" in cazul impartirii la zero.
 */



public class Ex2 {
    public static void main(String[] args){
        System.out.println("Rezultat valid: " +impartire(10, 2));
        System.out.println("Rezultat invalid: " +impartire(10, 0));
    }

public static double impartire(int nr1, int nr2) {
    try {
        return nr1 / nr2;
    } catch (Exception e) {
        System.out.println("Eroare impartire la zero" + e);
        return 0;
    }
}
}