import java.util.Scanner;

public class SumaBrojeva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("**** Program koji računa sumu brojeva između 2 broja koja uneseš *****");
        System.out.println("Unesi manji broj:");
        int a = sc.nextInt();
        System.out.println("Unesi veći broj:");
        int b = sc.nextInt();
        int suma = 0;

        while (a < b) {
            suma += a;
            a++;
        }

        System.out.println("Suma je jednaka: " + suma);

        int broj = 1;
        int suma7 = 0;

        do {
            if (broj % 7 == 0) {
                suma7 += broj;
            }
            broj++;
        } while (broj <= 1000);

        System.out.println("Suma brojeva od 1 do 1000 djeljivih sa 7 je: " + suma7);
    }
}
