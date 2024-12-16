public class Cinversii {

    public static void main(String[]args){

        int numarInt = 100;
        double numarDouble = numarInt;

        System.out.println("Numar int original: " + numarInt);
        System.out.println("Numar double (implicit): " + numarDouble);

        //Conversie explicita
        double valoareDouble = 9.99;
        int valoareInt = (int) valoareDouble;

        // Boxing si Unboxing
        Integer numarInteger = numarInt;
        int altInt = numarInteger;

        //Conversie de la String la int

        String textInt = "456";
        int numarDinText = Integer.parseInt(textInt);

       // Conversie int la String
        String textDinNumar = String.valueOf(numarInt);

        // Afisare
        System.out.println("Numar in original: " + numarInt);
        System.out.println("Numar double (implicit): " + numarDouble);
        System.out.println("Valoare double in original: " + valoareDouble);
        System.out.println("Valoare in (explicit): " + valoareInt);
        System.out.println("Numar Integer (boxing): " + numarInteger);
        System.out.println("Numar int(unboxing): " + altInt);
        System.out.println("Numar ca si text este; " + textInt + " Numarul ca si int este: " + numarDinText);
        System.out.println("Text din numar int: " + textDinNumar);


    }
}
