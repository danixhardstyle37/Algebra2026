package zadatakPlaninar;

import java.math.BigDecimal;

public class Planinar {

    private String ime;
    private String prezime;
    private int brojOsvojenihVrhova;
    private BigDecimal visinaNajvisegVrha;

    public Planinar(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getBrojOsvojenihVrhova() {
        return brojOsvojenihVrhova;
    }

    public void setBrojOsvojenihVrhova(int brojOsvojenihVrhova) {
        this.brojOsvojenihVrhova = brojOsvojenihVrhova;
    }

    public BigDecimal getVisinaNajvisegVrha() {
        return visinaNajvisegVrha;
    }

    public void setVisinaNajvisegVrha(BigDecimal visinaNajvisegVrha) {
        this.visinaNajvisegVrha = visinaNajvisegVrha;
    }

    public String dohvatiPodatke() {
        return "Ime: " + ime +
                "\nPrezime: " + prezime +
                "\nBroj osvojenih vrhova: " + brojOsvojenihVrhova +
                "\nVisina najvišeg vrha: " + visinaNajvisegVrha;
    }

}