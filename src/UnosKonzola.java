import java.util.Scanner;

public class UnosKonzola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite prvi broj:");
        int a = sc.nextInt();

        System.out.println("Unesite drugi broj:");
        int b = sc.nextInt();

        int c = a + b;

        System.out.println("Zbroj broja " + a +" i broja " + b + " je " + c);
    }
}
