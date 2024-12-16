import Ex0512.Biblioteca;

/*
1. *Definire și utilizare clasă simplă*: Creează o clasă Carte cu atributele titlu și autor.
Adaugă o metodă care afișează informațiile despre carte. Creează mai multe obiecte ale clasei și afișează detaliile.
Creaza o clasa biblioteca care contine o lista de carti (Class carte definita anterior).Ofera metode:
Pentru adaugarea de carti.
Pentru cautarea cartiulor dupa titlu.
Pentru afisarea tututot cartilor. Testeaza class Biblioteca prin popularea listei si cautarea unei carti.
 */
public class Ex1 {
    public static void main(String[] args) {
        Carte carte1 = new Carte("Mandrie si prejudecata ", "Jane");
        Carte carte2 = new Carte("Crima si pedeapsa", "Fiodor ");
        Carte carte3 = new Carte ("titlu", "George");


        carte1.afiseazaDetalii();
        carte2.afiseazaDetalii();
        carte3.afiseazaDetalii();

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adaugaCarte(carte1);
        biblioteca.adaugaCarte(carte2);
        biblioteca.adaugaCarte(carte3);

        biblioteca.afiseazaCarti();
    }
}
