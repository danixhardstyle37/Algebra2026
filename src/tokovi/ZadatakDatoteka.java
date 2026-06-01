package tokovi;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ZadatakDatoteka {
    public static void main(String[] args) throws IOException {

        File datoteka = new File("src/izlaz_zadatak.txt");

        PrintWriter zapis = new PrintWriter(new FileWriter(datoteka));

        zapis.println("aaaaaaa");
        zapis.println("bbbbbbb");

        zapis.close();

        System.out.println("Datoteka kreirana");

        if (datoteka.exists()) {
            System.out.println("Datoteka postoji");

            boolean obrisano = datoteka.delete();

            if (obrisano) {
                System.out.println("Datoteka obrisana");
            } else {
                System.out.println("Neuspjesno brisanje");
            }
        }

    }
}