package zadatakPlaninar;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Planinar[] planinari = new Planinar[3];

        for (int i = 0; i < planinari.length; i++) {

            System.out.print("Unesite ime planinara:");
            String ime = scanner.nextLine();

            System.out.print("Unesite prezime planinara:");
            String prezime = scanner.nextLine();

            Planinar planinar = new Planinar(ime, prezime);

            System.out.print("Unesite broj osvojenih vrhova:");
            int brojVrhova = scanner.nextInt();

            System.out.print("Unesite visinu najvišeg vrha:");
            BigDecimal visinaVrha = scanner.nextBigDecimal();
            scanner.nextLine();

            planinar.setBrojOsvojenihVrhova(brojVrhova);
            planinar.setVisinaNajvisegVrha(visinaVrha);

            planinari[i] = planinar;
        }

        System.out.println("\nUneseni planinari:");

        for (Planinar planinar : planinari) {
            System.out.println(planinar.dohvatiPodatke());
            System.out.println();
        }

    }
}