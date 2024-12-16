public class OperatiiMatematice {
    public static void main(String[] args) {
        int primulNumar = 16;
        int alDoileaNumar = 25;
        int sumaNumerelor = primulNumar + alDoileaNumar;
        int diferentaNumerelor = primulNumar - alDoileaNumar;
        int produsulNumerelor = primulNumar * alDoileaNumar;
        double catulNumerelor = (double) alDoileaNumar / primulNumar;
        int restulImpartiriiNumerelor = alDoileaNumar % primulNumar;


        System.out.println("Suma numerelor este; " + sumaNumerelor);
        System.out.println("Diferenta numerelor este: " + diferentaNumerelor);
        System.out.println("Produsul numerelor este: " + produsulNumerelor);
        System.out.println("Diferenta numerelor este: "+catulNumerelor);
        System.out.println("Restul impartirii  numerelor este: "+restulImpartiriiNumerelor);

    }
}
