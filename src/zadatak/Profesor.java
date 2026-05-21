package zadatak;

class Profesor extends Osoba {
    private String predmet;
    private double placa;

    public Profesor(String ime, String prezime, int godine,
                    String predmet, double placa) {
        super(ime, prezime, godine);
        this.predmet = predmet;
        this.placa = placa;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public double getPlaca() {
        return placa;
    }

    public void setPlaca(double placa) {
        this.placa = placa;
    }

    @Override
    public void predstaviSe() {
        System.out.println("Ja sam profesor " + getIme() + " " + getPrezime() + ", predajem " + predmet + ".");
    }
}