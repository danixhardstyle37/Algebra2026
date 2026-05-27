package model;

public class Pravokutnik extends GeometrijskiLik {

    private double sirina;
    private double visina;

    public Pravokutnik(double sirina, double visina) {
        this.sirina = sirina;
        this.visina = visina;
    }

    @Override
    public double opseg() {
        return 2 * (sirina + visina);
    }

    @Override
    public double povrsina() {
        return sirina * visina;
    }
}