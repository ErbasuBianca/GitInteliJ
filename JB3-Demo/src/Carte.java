
public class Carte{

    private String titlu ;
    private String autor ;

    public Carte(String titlu, String autor){
        this.titlu = titlu;
        this.autor = autor;
    }

    public void afiseazaDetalii(){
        System.out.println("\tTitlu: " + titlu + "Autor:" +autor);
    }

    @Override
    public String toString() {
        return "Carte{" +
                "titlu='" + titlu + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
