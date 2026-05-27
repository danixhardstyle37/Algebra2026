package model;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Ucilica ucilica = new Ucilica();

        Pravokutnik prav1 = new Pravokutnik( 9,14);
        Trokut trok1 = new Trokut ( 9,14,8);
        Krug krug1 = new Krug( 5);

//        System.out.println(prav1);
//        System.out.println(trok1);
//        System.out.println(krug1);

        ucilica.getLikovi().add(prav1);
        ucilica.getLikovi().add(trok1);
        ucilica.getLikovi().add(krug1);

        for (GeometrijskiLik gl : ucilica.getLikovi()) {
            System.out.println(gl);
        }
        System.out.println("Sortiranje i ispis");

        for (GeometrijskiLik gl : ucilica.getLikovi()) {
            System.out.println(gl);
        }

    }
}
