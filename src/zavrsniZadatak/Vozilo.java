package zavrsniZadatak;

public class Vozilo {

    private String registarskiBroj;
    private String marka;
    private int godinaProizvodnje;

    public Vozilo(String registarskiBroj, String marka, int godinaProizvodnje) throws NeispravniPodaciException {

        if (godinaProizvodnje < 0) {
            throw new NeispravniPodaciException("Neispravna godina proizvodnje");
        }

        this.registarskiBroj = registarskiBroj;
        this.marka = marka;
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public String getRegistarskiBroj() {
        return registarskiBroj;
    }

    public String getMarka() {
        return marka;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void prikaziPodatke() {
        System.out.println("Registarski broj: " + registarskiBroj);
        System.out.println("Marka: " + marka);
        System.out.println("Godina proizvodnje: " + godinaProizvodnje);
    }
}
