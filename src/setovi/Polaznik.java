package setovi;

import java.util.Objects;

public class Polaznik implements Comparable<Polaznik> {

    private String ime;
    private String prezime;
    private String email;

    public Polaznik(String ime, String prezime, String email) {
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Polaznik polaznik = (Polaznik) o;
        return Objects.equals(ime, polaznik.ime) && Objects.equals(prezime, polaznik.prezime) && Objects.equals(email, polaznik.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ime, prezime, email);
    }

    @Override
    public int compareTo(Polaznik drugiPolaznik) {
        int usporedbaPrezimena = prezime.compareTo(drugiPolaznik.prezime);

        if (usporedbaPrezimena != 0) {
            return usporedbaPrezimena;
        }

        int usporedbaImena = ime.compareTo(drugiPolaznik.ime);

        if (usporedbaImena != 0) {
            return usporedbaImena;
        }

        return email.compareTo(drugiPolaznik.email);
    }
}