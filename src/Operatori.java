package com.skillbrain;

public class Operatori {

    public static void main(String[] args) {

        // + , -, *, / % - operatori artimetici

        int primulNumar = 2;
        int alDoileaNumar = 5;

        int sumaNumerelor = primulNumar + alDoileaNumar;
        int diferentaNumerelor = primulNumar - alDoileaNumar;
        double catulNumerelor = (double) alDoileaNumar / primulNumar;
        int restulImpartiriiNumerelor = alDoileaNumar % primulNumar;


        System.out.println("Suma numerelor este: "+sumaNumerelor);
        System.out.println("Diferenta numerelor este: "+diferentaNumerelor);
        System.out.println("Catul numerelor este: "+catulNumerelor);
        System.out.println("Restul impartirii  numerelor este: "+restulImpartiriiNumerelor);

        // ==, !=, >, <, >=, <= - operatori de comparare

        boolean suntNumereleEgale = (primulNumar == alDoileaNumar);
        boolean suntNumereleDiferite = (primulNumar != alDoileaNumar);

        System.out.println("Sunt numerele egale: " + suntNumereleEgale);
        System.out.println("Sunt numerele diferite: " + suntNumereleDiferite);

        // && (AND), || (OR), ! (NOT)- operatori logici

        boolean variabilaAND = (5==5) && (6==6);
        System.out.println("Rezultat variabila AND: "+variabilaAND);

        boolean variabilaOR = (4==5) || (6==5);
        System.out.println("Rezultat variabila OR: " +variabilaOR);

        boolean variabilaNOT = !(5>=5);
        System.out.println("Rezultat variabila NOT: " + variabilaNOT);
    }
}
