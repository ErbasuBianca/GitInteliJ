package Ex0512;


import java.util.ArrayList;

public class Biblioteca {

    private ArrayList <Carte> carti;

    //Constructor
    public Biblioteca(){
        this.carti = new ArrayList<>();
    }
    //Adauga carte
    public <Carte> void adaugaCarte(Carte parametruCarte){
        carti.add(parametruCarte);
        System.out.println("Carte adaugata : " + parametruCarte.getTitlu());
    }

    //Cautare carte dupa titlu
    public <Carte> Carte cautareCarte(String titluCautat){
        for (Carte carte : carti){
            if(Carte.getTitlu().equalsIgnoreCase(titluCautat)){
                return carte;
            }
        }
        return null; // Daca nu se gaseste titlu dorit
    }
    // Afisarea tuturor cartilor
    public void afiseazaCarti(){
        System.out.println("Cartile din blilbioteca sunt :");
        for (Carte carte: carti()){
            System.out.println(carte);
        }
    }
}
