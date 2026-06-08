package zavrsniZadatak;

public class Automobil extends Vozilo {

    private int brojVrata;

    public Automobil(String registarskiBroj, String marka, int godinaProizvodnje, int brojVrata) throws NeispravniPodaciException {

        super(registarskiBroj, marka, godinaProizvodnje);

        if (brojVrata < 0) {
            throw new NeispravniPodaciException("Neispravan broj vrata");
        }

        this.brojVrata = brojVrata;
    }

    public int getBrojVrata() {
        return brojVrata;
    }

    public void setBrojVrata(int brojVrata) throws NeispravniPodaciException {

        if (brojVrata < 0) {
            throw new NeispravniPodaciException("Neispravan broj vrata");
        }

        this.brojVrata = brojVrata;
    }

    @Override
    public void prikaziPodatke() {
        super.prikaziPodatke();
        System.out.println("Broj vrata: " + brojVrata);
    }
}