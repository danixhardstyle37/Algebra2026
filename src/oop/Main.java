package oop;

import model.Auto;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ivo Ivić", 15);
        Student student2 = new Student("Marica Maric", 15);

        System.out.println(student1);
        System.out.println(student2);

        System.out.println(student1.getIme());

        student1.setOcjena(4.1);
        student1.prikazPodataka();

        Auto auto1 = new Auto("Mazda 3", "Crvena", 2019);
        Auto auto2 = new Auto("BMW X5", "Plava", 2020);

        System.out.println(auto1);
        System.out.println(auto2);

        System.out.println(auto1.getModel());

        auto2.setBoja("Plava");

        auto2.prikazPodataka();
    }
}
