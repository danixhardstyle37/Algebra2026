package tokovi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ZadatakTokovi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int izbor = -1;

        do {
            System.out.println("\n1 Provjera postojanja datoteke");
            System.out.println("2 Kopiranje datoteke");
            System.out.println("3 Brisanje datoteke");
            System.out.println("0 Izlaz");
            System.out.print("Odaberi opciju: ");

            try {
                izbor = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Potrebno unijeti broj");
                continue;
            }

            switch (izbor) {

                case 1:
                    System.out.print("Unesite putanju datoteke: ");
                    String putanja = sc.nextLine();

                    File datoteka = new File(putanja);

                    if (datoteka.exists()) {
                        System.out.println("Datoteka postoji");
                    } else {
                        System.out.println("Datoteka ne postoji");
                    }
                    break;

                case 2:
                    try {
                        System.out.print("Unesite putanju originalne datoteke: ");
                        String izvor = sc.nextLine();

                        System.out.print("Unesite putanju kopije: ");
                        String odrediste = sc.nextLine();

                        FileInputStream fis = new FileInputStream(izvor);
                        FileOutputStream fos = new FileOutputStream(odrediste);

                        int a;

                        while ((a = fis.read()) != -1) {
                            fos.write(a);
                        }

                        fis.close();
                        fos.close();

                        File kopija = new File(odrediste);

                        if (kopija.exists()) {
                            System.out.println("Datoteka uspjesno kopirana");

                        } else {
                            System.out.println("Kopiranje nije uspjelo");
                        }

                    } catch (IOException e) {
                        System.out.println("Greska prilikom kopiranja datoteke");
                    }
                    break;

                case 3:
                    System.out.print("Unesi putanju datoteke za brisanje: ");
                    String brisanje = sc.nextLine();

                    File file = new File(brisanje);

                    if (!file.exists()) {
                        System.out.println("Datoteka ne postoji");
                    } else {
                        if (file.delete()) {
                            System.out.println("Datoteka je obrisana");
                        } else {
                            System.out.println("Datoteku nije moguce obrisati");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Kraj programa");
                    break;

                default:
                    System.out.println("Pogresan odabir");
            }

        } while (izbor != 0);

        sc.close();
    }
}