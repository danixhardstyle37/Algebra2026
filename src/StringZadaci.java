import java.util.Scanner;

public class StringZadaci {
    public static void main(String[] args) {
        //Zadatak 1
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite tekst: ");

        String text = sc.nextLine();

        text = text.trim();

        int slova = 0;
        int brojevi = 0;
        int ostalo = 0;

        for(int i=0; i<text.length(); i++){
            char c = text.charAt(i);

            if(Character.isLetter(c)){
                slova++;
            }else if(Character.isDigit(c)){
                brojevi++;
            }else{
                ostalo++;
            }
        }

        System.out.println("Slova: " + slova);
        System.out.println("Brojevi: " + brojevi);
        System.out.println("Ostalo: " + ostalo);

        //Zadatak 2
        System.out.print("Unesite recenicu: ");
        String recenica = sc.nextLine();

        recenica = recenica.trim();

        String[] rijeci = recenica.split("\\s+");

        for(int i=rijeci.length-1; i>= 0; i--){
            System.out.print(rijeci[i]);
            if(i != 0){
                System.out.print(" ");
            }
        }
    }
}
