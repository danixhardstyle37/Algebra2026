import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        System.out.println(dt);
        System.out.println(dt.getDayOfWeek());
        System.out.println(dt.getMonth().plus(1));

        double a = 4;
        double b = 3;
        double c = 16;

        double kvadratA = Math.pow(a,2);
        double kvadratC = Math.pow(c,2);

        System.out.println("Kvadrat broja " + a + ": " + kvadratA);
        System.out.println("Kvadrat broja " + c + ": " + kvadratC);

        double korijenC = Math.sqrt(c);

        System.out.println("Korijen broja " + c +": " + korijenC);

        double bNaTrecu = Math.pow(b,3);

        System.out.println(b + " na treću potenciju: " + bNaTrecu);

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi ocjenu (1-5): ");
        int ocjena = 5;

        if (ocjena == 1) {
            System.out.println("nedovoljan");
        } else if (ocjena == 2) {
            System.out.println("dovoljan");
        } else if (ocjena == 3) {
            System.out.println("dobar");
        } else if (ocjena == 4) {
            System.out.println("vrlo dobar");
        } else if (ocjena == 5) {
            System.out.println("odličan");
        } else {
            System.out.println("Neispravna ocjena!");
        }

        //uvjetovanje korištenjem znakova
        char spol = 'm';

        if (spol == 'm') {
            System.out.println("Korisnik je muška osoba!");
        }  else if (spol == 'ž') {
            System.out.println("Korisnik je ženska osoba!");
        }   else {
            System.out.println("Nije unesen ispravan znak");
        }

        //case
        switch(ocjena){
            case 1:
                System.out.println("nedovoljan");
                break;
            case 2:
                System.out.println("dovoljan");
                break;
            case 3:
                System.out.println("dobar");
                break;
            case 4:
                System.out.println("vrlo dobar");
                break;
            case 5:
                System.out.println("odličan");
                break;
            default:
                System.out.println("Neispravna ocjena!");
        }

        //provjera dan u tjednu
        String dan = "utorak";

        switch(dan){
            case "ponedjeljak":
            case "utorak":
            case "srijeda":
            case "četvrtak":
            case "petak":
                System.out.println("Radni dan");
                break;
            case "subota":
            case "nedjelja":
                System.out.println("Vikend");
                break;
            default:
                System.out.println("Ne postojeći dan u tjednu!");
        }

    }
}
