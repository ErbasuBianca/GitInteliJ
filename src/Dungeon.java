import java.util.Random;
import java.util.Scanner;

public class Dungeon {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        // variabile jucator
        System.out.println("Introdu numele jucatorului");
        String numeJucator = in.nextLine();
        int sanatate = 100;
        int atacDeteriorare = 50;
        int nrPortiuni = 3;
        int valoareRegenerare = 10;
        int sansePortiune = 50;

        // variabile inamic
        String[] inamici = {"Zombie", "Skeleton", "Warrion", "Asasin"};
                int maxSanatateInamic = 75;
        int atacDeterioarareInamic = 25;

        boolean running =true;
        System.out.println("Bine ai venit in Temnita" + numeJucator+ " ! ");

        GAME:
        while(running){
            System.out.println("--------------------------");
            int sanatateInamic = rand.nextInt(maxSanatateInamic);
            String inamic = inamici[rand.nextInt(inamici.length)];
            System.out.println(inamici[0]);
            System.out.println(inamici[1]);
            System.out.println(inamici[2]);
            System.out.println(inamici[3]);
            System.out.println("\t " + inamic + " a aparut! #");

            while(sanatateInamic > 0) {
                System.out.println("\tSanatatea ta este: " + sanatate);
                System.out.println("\tSanatatea inamicului" + inamic + "este" + sanatateInamic);
                System.out.println("\tCe ai vrea sa faci ? ");
                System.out.println("\t1. Ataca");
                System.out.println("\t2. Bea o portiune");
                System.out.println("\t3. Fugi");

                String input = in.nextLine();
                if (input.equals("1")) {
                // cod pentru a ataca
                    int deteriorareProdusa = rand.nextInt(atacDeteriorare);
                    int deteriorarePimita = rand.nextInt(atacDeterioarareInamic);

                    sanatateInamic = deteriorareProdusa;
                    sanatate = deteriorarePimita;
                    System.out.println("\tla-i lovit pe " + inamic+ " cu " + deteriorareProdusa + " deteriorare");
                    System.out.println("\tAi primit " + deteriorarePimita + " deteriorare");

                    if (sanatate < 1){
                        System.out.println("\tAi fost lovit prea tare , esti prea slabit sa continui");
                    }

            } else if (input.equals("2")) {
                    // cod pentru a bea o potiune
                    if (nrPortiuni > 0) {
                        sanatate += valoareRegenerare;
                        nrPortiuni--; // codul pentru a scana nrPotiuni cu 1
                        System.out.println("\tAi baut o potiune, te-ai vindecat cu " + valoareRegenerare +
                                "\n\tAcum ai " + sanatate + " sanatate" +
                                "\n\tTi-au mai ramas " + nrPortiuni + " potiuni.");
                    } else{
                        System.out.println("\tNu mai ai potiuni! Invinge un inamic sa mai castigi potiuni");
                    }
                } else if (input.equals("3")) {
                    // cod pentru a fugi
                    System.out.println("\tAi fugit de " + inamic);
                    continue GAME;
                } else {
                    // cod pentru portiune invalida
                    System.out.println("\tComanda invalida");

                }
            }
            if (sanatate < 1){
                System.out.println("Te-au batut crunt in Temnita, noroc data viitoare");
                break;
            }

            System.out.println("----------------------------------");
            System.out.println(" # " + inamic + " a fost invins! #");
            System.out.println(" #  Ai " + sanatate + " sanatate. #");
            if(rand.nextInt(100 ) < sansePortiune){
                nrPortiuni++;
                System.out.println(" # Ai castigat o potiune de pe urma infrangerii lui " + inamic + "! #");
                System.out.println(" # Mai ai " + nrPortiuni+ " potiuni.#" );
            }

            System.out.println("Ce ai vrea sa faci in continuare ?");
            System.out.println("1. Countinua lupta");
            System.out.println("2. Termina jocul");
            String input = in.nextLine();

            while (!input.equals("1") && !input.equals("2")){
                System.out.println("Comanda invalida");
                input = in.nextLine();
            }
            switch (input){
                case "1":
                    System.out.println("Continui aventura!");
                case "2":
                    System.out.println("\nAi ales sa iesi din temnita. Drum bun!");
                    break GAME;

            }

            System.out.println("###################");
            System.out.println(" # Multumim de joc!");
            System.out.println("###################");

        }
    }
}
