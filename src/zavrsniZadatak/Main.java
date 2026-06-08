package zavrsniZadatak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EvidencijaVozila evidencija = new EvidencijaVozila();

        int izbor;

        do {
            System.out.println("\n1. Dodaj automobil");
            System.out.println("2. Dodaj motocikl");
            System.out.println("3. Prikazi vozila");
            System.out.println("4. Spremi u datoteku");
            System.out.println("5. Ucitaj iz datoteke");
            System.out.println("0. Izlaz");
            System.out.print("Odabir: ");

            izbor = sc.nextInt();
            sc.nextLine();

            try {

                switch (izbor) {

                    case 1:

                        System.out.print("Registarski broj: ");
                        String regA = sc.nextLine();

                        System.out.print("Marka: ");
                        String markaA = sc.nextLine();

                        System.out.print("Godina proizvodnje: ");
                        int godinaA = sc.nextInt();

                        System.out.print("Broj vrata: ");
                        int vrata = sc.nextInt();
                        sc.nextLine();

                        evidencija.dodajVozilo(new Automobil(regA, markaA, godinaA, vrata));

                        break;

                    case 2:

                        System.out.print("Registarski broj: ");
                        String regM = sc.nextLine();

                        System.out.print("Marka: ");
                        String markaM = sc.nextLine();

                        System.out.print("Godina proizvodnje: ");
                        int godinaM = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Tip motora: ");
                        String tip = sc.nextLine();

                        evidencija.dodajVozilo(new Motocikl(regM, markaM, godinaM, tip));

                        break;

                    case 3:
                        evidencija.prikaziSvaVozila();
                        break;

                    case 4:
                        evidencija.spremiPodatkeUDatoteku("vozila.txt");
                        break;

                    case 5:
                        evidencija.ucitajPodatkeIzDatoteke("vozila.txt");
                        break;

                    case 0:
                        System.out.println("Kraj programa");
                        break;

                    default:
                        System.out.println("Neispravan odabir");
                }

            } catch (NeispravniPodaciException e) {
                System.out.println(e.getMessage());
            }

        } while (izbor != 0);

        sc.close();
    }
}