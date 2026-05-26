package zadatakEvidencija;

public class Casopis extends Publikacija {

    private int brojIzdanja;

    public Casopis(String naslov, int godinaIzdanja, int brojIzdanja) {
        super(naslov, godinaIzdanja);
        this.brojIzdanja = brojIzdanja;
    }

    public int getBrojIzdanja() {
        return brojIzdanja;
    }

    public void setBrojIzdanja(int brojIzdanja) {
        this.brojIzdanja = brojIzdanja;
    }

    @Override
    public String toString() {
        return "Ja sam časopis. Naslov: " + getNaslov() + ", Godina izdanja: " + getGodinaIzdanja() + ", Broj izdanja: " + brojIzdanja;
    }
}