/*
### Sintaxa
**** java
variabila = (conditie) ? valoare_true : valoare_false;
 */

public class OperatorulTernar {

    public static void main(String[] args) {
        int varsta = 15;
        String mesaj = (varsta >= 18) ? "Esti major" : "Esti major";
        System.out.println(mesaj);

        // exemplu 2

        System.out.println(valoareReducere(true));
        System.out.println(valoareReducere(false));

    }

    private static String valoareReducere(boolean membru) {
        double reducerea = membru ? 0.15 : 0.05;
        return "Reducerea este: " + (reducerea * 100) + "%";
    }
}

