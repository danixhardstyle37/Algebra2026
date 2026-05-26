package zadatakEvidencija;

abstract class Publikacija implements Comparable<Publikacija> {

    private String naslov;
    private int godinaIzdanja;

    public Publikacija(String naslov, int godinaIzdanja) {
        this.naslov = naslov;
        this.godinaIzdanja = godinaIzdanja;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    @Override
    public int compareTo(Publikacija p) {
        return Integer.compare(this.godinaIzdanja, p.godinaIzdanja);
    }
}