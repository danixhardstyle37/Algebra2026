package zadatakEvidencija;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Publikacija> publikacije = new ArrayList<>();

        int izbor = 0;

        while (izbor != 4) {

            System.out.println("\nIzaberite vrstu publikacije");
            System.out.println("1 - Knjiga");
            System.out.println("2 - Časopis");
            System.out.println("3 - Znanstveni rad");
            System.out.println("4 - Izlaz");

            System.out.print("Odaberi: ");
            izbor = sc.nextInt();
            sc.nextLine();

            if (izbor == 1) {

                System.out.print("Unesi naslov knjige: ");
                String naslov = sc.nextLine();

                System.out.print("Unesi godinu izdanja: ");
                int godina = sc.nextInt();
                sc.nextLine();

                System.out.print("Unesi autora: ");
                String autor = sc.nextLine();

                Knjiga knjiga = new Knjiga(naslov, godina, autor);

                publikacije.add(knjiga);

            } else if (izbor == 2) {

                System.out.print("Unesi naslov časopisa: ");
                String naslov = sc.nextLine();

                System.out.print("Unesi godinu izdanja: ");
                int godina = sc.nextInt();

                System.out.print("Unesi broj izdanja: ");
                int brojIzdanja = sc.nextInt();
                sc.nextLine();

                Casopis casopis = new Casopis(naslov, godina, brojIzdanja);

                publikacije.add(casopis);

            } else if (izbor == 3) {

                System.out.print("Unesi naslov znanstvenog rada: ");
                String naslov = sc.nextLine();

                System.out.print("Unesi godinu izdanja: ");
                int godina = sc.nextInt();
                sc.nextLine();

                System.out.print("Unesi područje rada: ");
                String podrucje = sc.nextLine();

                ZnanstveniRad znanstveniRad = new ZnanstveniRad(naslov, godina, podrucje);

                publikacije.add(znanstveniRad);

            } else if (izbor == 4) {

                System.out.println("Izlaz");

            } else {

                System.out.println("Pogresan unos!");
            }
        }

        Collections.sort(publikacije);

        System.out.println("\nSORTIRANE PUBLIKACIJE");

        for (Publikacija p : publikacije) {
            System.out.println(p);
        }

        sc.close();
    }
}