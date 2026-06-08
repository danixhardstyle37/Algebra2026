package zavrsniZadatak;

import java.io.*;
import java.util.ArrayList;

public class EvidencijaVozila {

    private ArrayList<Vozilo> vozila = new ArrayList<>();

    public void dodajVozilo(Vozilo vozilo) {
        vozila.add(vozilo);
    }

    public void prikaziSvaVozila() {

        if (vozila.isEmpty()) {
            System.out.println("Nema vozila");
            return;
        }

        for (Vozilo v : vozila) {
            System.out.println("----------------");
            v.prikaziPodatke();
        }
    }

    public void spremiPodatkeUDatoteku(String datoteka) {

        try (PrintWriter pw = new PrintWriter(new FileWriter(datoteka))) {

            for (Vozilo v : vozila) {

                if (v instanceof Automobil) {

                    Automobil a = (Automobil) v;

                    pw.println("AUTO;" +
                            a.getRegistarskiBroj() + ";" +
                            a.getMarka() + ";" +
                            a.getGodinaProizvodnje() + ";" +
                            a.getBrojVrata());
                }

                else if (v instanceof Motocikl) {

                    Motocikl m = (Motocikl) v;

                    pw.println("MOTO;" +
                            m.getRegistarskiBroj() + ";" +
                            m.getMarka() + ";" +
                            m.getGodinaProizvodnje() + ";" +
                            m.getTipMotora());
                }
            }

            System.out.println("Podaci spremljeni");

        } catch (IOException e) {
            System.out.println("Greska pri spremanju");
        }
    }

    public void ucitajPodatkeIzDatoteke(String datoteka) {

        vozila.clear();

        try (BufferedReader br = new BufferedReader(new FileReader(datoteka))) {

            String red;

            while ((red = br.readLine()) != null) {

                String[] p = red.split(";");

                if (p[0].equals("AUTO")) {
                    vozila.add(new Automobil(p[1], p[2], Integer.parseInt(p[3]), Integer.parseInt(p[4])));
                }
                else if (p[0].equals("MOTO")) {
                    vozila.add(new Motocikl(p[1], p[2], Integer.parseInt(p[3]), p[4]));
                }
            }

            System.out.println("Podaci ucitani");

        } catch (Exception e) {
            System.out.println("Greska pri ucitavanju.");
        }
    }
}