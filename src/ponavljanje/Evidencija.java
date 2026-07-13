package ponavljanje;

import java.util.ArrayList;
import java.util.Scanner;

public class Evidencija {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Polaznik> listaPolaznika = new ArrayList<>();

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

                    listaPolaznika.add(new Polaznik(ime, prezime, email));
                    System.out.println("Dodan polaznik");
                    break;

                case 2:
                    if (listaPolaznika.isEmpty()) {
                        System.out.println("Nema unesenih polaznika.");
                    } else {
                        System.out.println("\nPopis polaznika:");
                        for (Polaznik p : listaPolaznika) {
                            System.out.println(p.getIme() + " " + p.getPrezime() + ", email: " + p.getEmail());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Unesi e-mail za pretragu: ");
                    String trazeniEmail = sc.nextLine();

                    boolean pronaden = false;

                    for (Polaznik p : listaPolaznika) {
                        if (p.getEmail().equalsIgnoreCase(trazeniEmail)) {
                            System.out.println("Pronaden polaznik:");
                            System.out.println(p.getIme() + " " + p.getPrezime() + ", email: " + p.getEmail());
                            pronaden = true;
                        }
                    }

                    if (!pronaden) {
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

    }
}