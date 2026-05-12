import java.util.Scanner;

public class ProvjeraOIBa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite OIB: ");
        String oib = scanner.nextLine();

        boolean ispravan = true;

        if (oib.length() != 11) {
            ispravan = false;
        } else {
            for (int i = 0; i < 11; i++) {
                if (!Character.isDigit(oib.charAt(i))) {
                    ispravan = false;
                    break;
                }
            }
        }

        if (ispravan) {

            int a = 0;

            for (int i = 0; i < 10; i++) {
                int broj = oib.charAt(i) - '0';

                if(i==0){
                    a += 10;
                }

                a = a + broj;
                a = a % 10;

                if (a == 0) {
                    a = 10;
                }

                a = (a * 2) % 11;
            }

            int kontrolna = (11 - a) % 10;
            int zadnja = oib.charAt(10) - '0';

            if (kontrolna == zadnja) {
                System.out.println("OIB je valjan");
            } else {
                System.out.println("OIB nije valjan");
            }

        } else {
            System.out.println("OIB nije valjan");
        }

    }
}
