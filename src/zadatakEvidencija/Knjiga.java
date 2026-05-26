package zadatakEvidencija;

public class Knjiga extends Publikacija {

    private String autor;

    public Knjiga(String naslov, int godinaIzdanja, String autor) {
        super(naslov, godinaIzdanja);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Ja sam knjiga. Naslov: " + getNaslov() + ", Godina izdanja: " + getGodinaIzdanja() + ", Autor: " + autor;
    }
}