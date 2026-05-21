package zadatak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Fakultet {

    public static void main(String[] args) {

        ArrayList<Osoba> clanoviFakulteta = new ArrayList<>();

        clanoviFakulteta.add(new Student("Dario", "Boc", 24, "IB2301", 2));

        clanoviFakulteta.add(new Student("Pamela", "Benković", 27, "IB2302", 3));

        clanoviFakulteta.add(new Profesor("Marko", "Abramović", 23, "Programiranje", 2500));

        clanoviFakulteta.add(new Profesor("Dorian", "Hajnić", 24, "Matematika", 2200));

        System.out.println("=== Predstavljanje članova fakulteta ===");

        for (Osoba osoba : clanoviFakulteta) {
            osoba.predstaviSe();
            System.out.println();
        }

        Collections.sort(clanoviFakulteta, Comparator.comparingInt(Osoba::getGodine));

        System.out.println("=== Nakon sortiranja po godinama ===");

        for (Osoba osoba : clanoviFakulteta) {
            System.out.println(osoba.getIme() + " " + osoba.getPrezime() + " - " + osoba.getGodine() + " godina");
        }
    }
}