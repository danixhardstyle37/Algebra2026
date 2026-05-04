import java.time.LocalDateTime;

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

    }
}
