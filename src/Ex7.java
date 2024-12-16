/* Scrieti un program incare cititi de la tastatura un numar, si
        calculati:

        - rezultatul sumei cu 5

        - rezultatul scaderii cu 12.3

        - rezultatul inmultirii cu -3.2

        - rezultatul impartirii cu 4

        - rezultatul modulului cu 6
 */
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nrTastat = scanner.nextInt();

        int nrSuma= 5;
        int sumaNr= nrTastat + nrSuma;
        System.out.println("suma este:" + sumaNr);

        double nrDif= 12.3;
        double difNr= nrTastat - nrDif;
        System.out.println("diferenta este:"+ difNr);

        double nrMul= -3.2;
        double produsNr= nrTastat * nrMul;
        System.out.println("produsul este:"+ produsNr);

        int nrImp= 4;
        int catNr= nrTastat / nrImp;
        System.out.println("catul este:"+ catNr);

        int nrMod= 6;
        int modNr= nrTastat % nrMod;
        System.out.println("modulul este:"+ modNr);
    }
}
