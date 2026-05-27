package model;

public class Krug extends GeometrijskiLik {

    private double radijus;

    public Krug(double radijus) {
        this.radijus = radijus;
    }

    @Override
    public double opseg() {
        return 2 * Math.PI * radijus;
    }

    @Override
    public double povrsina() {
        return Math.PI * radijus * radijus;
    }
}