import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Polja {
    public static void main(String[] args) {
        int[] brojevi = new int[5];
        brojevi[0] = 11;
        brojevi[1] = 5;
        brojevi[2] = 15;
        brojevi[3] = 4;
        brojevi[4] = 22;

        for(int i : brojevi){
            System.out.println(i);
        }

        System.out.println(brojevi[4]);

        System.out.println("Zadatak");

        for(int i = 0; i < brojevi.length; i++){
            System.out.println(brojevi[i]);
        }


        System.out.println("Zadatak 2");
        Integer[] brojevi2 = {11, 5, 15, 4, 22};

        List<Integer> listaBrojeva = Arrays.asList(brojevi2);

        Collections.reverse(listaBrojeva);

        for(int i : listaBrojeva){
            System.out.println(i);
        }

        Scanner unos = new Scanner(System.in);
        int[] godine = new int[7];

        System.out.println("Unesite 7 godina:");

        for (int i = 0; i < 7; i++) {
            System.out.print("Godina " + (i + 1) + ": ");
            godine[i] = unos.nextInt();
        }

        for (int i = 0; i < godine.length; i++) {

            if ((godine[i] % 4 == 0 && godine[i] % 100 != 0) || (godine[i] % 400 == 0)) {
                System.out.println(godine[i] + " je prijestupna godina");
            } else {
                System.out.println(godine[i] + " nije prijestupna godina");
            }
        }
    }
}
