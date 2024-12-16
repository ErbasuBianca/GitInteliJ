public class Calculator {
    public static void main(String[] args) {
        int suma = adunare(8, 2);
        System.out.println("Suma este: " + suma);
        int diferenta = scadere(8, 2);
        System.out.println("Diferenta este: " + diferenta);
        int catul = inmultire(8,2);
        System.out.println("Catul este :" +catul);
        int restul = impartire(8,2);
        System.out.println("Restul impartirii este:" + restul);
    }
    public static int adunare(int primulNumar, int alDoileaNumar) {
        return primulNumar + alDoileaNumar;
    }

    public static int scadere(int primulNumar, int alDoialeaNumar) {
        return primulNumar - alDoialeaNumar;

    }
    public static int inmultire (int primulNumar, int alDoileaeaNumar){
        return primulNumar * alDoileaeaNumar;
    }
    public static int impartire (int primulNumar, int alDoileaeaNumar){
        return primulNumar / alDoileaeaNumar;
    }
}