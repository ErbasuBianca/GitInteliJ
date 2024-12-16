/*
if (conditie) {
// cod care se executa daca conditia este adevarata
}
 */

public class InstructiuneaIF {
    public static void main(String[] args){
        // vrem sa validam ca varsta este mai mare decat 18 si sa afisam ca persoana este majora
        int varsta = 18;
        if (varsta >= 18){
            System.out.println("Esti major");
        }
        System.out.println("Acesta este un mesaj care se afiseaza in afara IF-ului");

        esteparcareagratuita("Duminica");
        }

        public static void esteparcareagratuita(String ziASaptamanii) {
            if (ziASaptamanii.equalsIgnoreCase("duminica")) ;
            System.out.println("Intrarea este gratuita azi");
        }


    }

