package ZadatakNogomet;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Nogometas> nogometasi = new ArrayList<>();

        nogometasi.add(new Nogometas("Dario", 7, 15));
        nogometasi.add(new Nogometas("Marko", 9, 22));
        nogometasi.add(new Nogometas("Josip", 11, 12));
        nogometasi.add(new Nogometas("Petar", 10, 18));

        System.out.println("Prije sortiranja");

        for (Nogometas n : nogometasi) {
            System.out.println(n);
        }

        Collections.sort(nogometasi);

        System.out.println("\nPoslje sortiranja");

        for (Nogometas n : nogometasi) {
            System.out.println(n);
        }
    }
}