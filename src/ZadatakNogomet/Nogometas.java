package ZadatakNogomet;

class Nogometas extends Sportas implements Comparable<Nogometas> {

    private int brojGolova;

    public Nogometas(String ime, int brojDresa, int brojGolova) {
        super(ime, brojDresa);
        this.brojGolova = brojGolova;
    }

    public int getBrojGolova() {
        return brojGolova;
    }

    public void setBrojGolova(int brojGolova) {
        this.brojGolova = brojGolova;
    }

    @Override
    public int compareTo(Nogometas n) {
        return Integer.compare(n.brojGolova, this.brojGolova);
    }

    @Override
    public String toString() {
        return "Ime: " + getIme() + ", Broj dresa: " + getBrojDresa() + ", Broj golova: " + brojGolova;
    }
}