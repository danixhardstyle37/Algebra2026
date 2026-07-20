package mape;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EvidencijaPolaznika {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, Polaznik> listaPolaznika = new HashMap<>();
        // Map<String, Polaznik> listaPolaznika = new TreeMap<>();

        int br;

        do {
            System.out.println("\n----- EVIDENCIJA POLAZNIKA -----");
            System.out.println("1. Dodaj polaznika");
            System.out.println("2. Ispisi sve polaznike");
            System.out.println("3. Pretrazi po e-mailu");
            System.out.println("4. Izlaz");
            System.out.print("Odabir: ");

            br = sc.nextInt();
            sc.nextLine();

            switch (br) {

                case 1:
                    System.out.print("Unesi ime: ");
                    String ime = sc.nextLine();

                    System.out.print("Unesi prezime: ");
                    String prezime = sc.nextLine();

                    System.out.print("Unesi e-mail: ");
                    String email = sc.nextLine();

                    String kljuc = email.toLowerCase();

                    if (listaPolaznika.containsKey(kljuc)) {
                        System.out.println("Polaznik s tom e-mail adresom vec postoji");
                    } else {
                        Polaznik noviPolaznik = new Polaznik(ime, prezime, email);

                        listaPolaznika.put(kljuc, noviPolaznik);
                        System.out.println("Polaznik je uspjesno dodan");
                    }

                    break;

                case 2:
                    if (listaPolaznika.isEmpty()) {
                        System.out.println("Nema unesenih polaznika");
                    } else {
                        System.out.println("\nPopis polaznika:");

                        for (Polaznik p : listaPolaznika.values()) {
                            System.out.println(p.getIme() + " " + p.getPrezime() + ", email: " + p.getEmail());
                        }
                    }

                    break;

                case 3:
                    System.out.print("Unesi e-mail za pretragu: ");
                    String trazeniEmail = sc.nextLine();

                    Polaznik pronadeniPolaznik = listaPolaznika.get(trazeniEmail.toLowerCase());

                    if (pronadeniPolaznik != null) {
                        System.out.println("Pronaden polaznik:");
                        System.out.println(pronadeniPolaznik.getIme() + " " + pronadeniPolaznik.getPrezime() + ", email: " + pronadeniPolaznik.getEmail());
                    } else {
                        System.out.println("Polaznik nije pronaden");
                    }

                    break;

                case 4:
                    System.out.println("Program zavrsen");
                    break;

                default:
                    System.out.println("Pogresan broj");
            }

        } while (br != 4);

        sc.close();
    }
}