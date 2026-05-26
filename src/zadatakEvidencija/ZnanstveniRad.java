package zadatakEvidencija;

public class ZnanstveniRad extends Publikacija {

    private String podrucje;

    public ZnanstveniRad(String naslov, int godinaIzdanja, String podrucje) {
        super(naslov, godinaIzdanja);
        this.podrucje = podrucje;
    }

    public String getPodrucje() {
        return podrucje;
    }

    public void setPodrucje(String podrucje) {
        this.podrucje = podrucje;
    }

    @Override
    public String toString() {
        return "Ja sam znanstveni rad. Naslov: " + getNaslov() + ", Godina izdanja: " + getGodinaIzdanja() + ", Područje: " + podrucje;
    }
}