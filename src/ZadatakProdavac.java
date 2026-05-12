import java.util.Scanner;

public class ZadatakProdavac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite iznos (npr: 1234,51): ");
        double iznos = sc.nextDouble();

        double[] novcanice = {500, 200, 100, 50, 20, 10, 5};
        double[] kovanice = {2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01};

        System.out.println("Morate uzvratiti:");

        for (int i = 0; i < novcanice.length; i++) {

            int broj = (int)(iznos / novcanice[i]);

            if (broj > 0) {
                System.out.println(broj + "*" + novcanice[i]);
            }

            iznos = iznos % novcanice[i];
        }

        for (int i = 0; i < kovanice.length; i++) {

            int broj = (int)(iznos / kovanice[i]);

            if (broj > 0) {
                System.out.println(broj + "*" + kovanice[i]);
            }

            iznos = iznos % kovanice[i];
            iznos = Math.round(iznos * 100.0) / 100.0; //Dodano iz razloga sto mi 0.51 - 0.5 daje 0,00999999... umjesto 0.1 pa gubim cent
            //Drugo rjesenje bi bilo koristenje BigDecimal umjesto double
        }

    }
}
