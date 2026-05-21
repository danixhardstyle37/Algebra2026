package zadatak;

class Student extends Osoba {
    private String brojIndexa;
    private int godinaStudija;

    public Student(String ime, String prezime, int godine,
                   String brojIndexa, int godinaStudija) {
        super(ime, prezime, godine);
        this.brojIndexa = brojIndexa;
        this.godinaStudija = godinaStudija;
    }

    public String getBrojIndexa() {
        return brojIndexa;
    }

    public void setBrojIndexa(String brojIndexa) {
        this.brojIndexa = brojIndexa;
    }

    public int getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(int godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

    @Override
    public void predstaviSe() {
        super.predstaviSe();
        System.out.println("Ja sam student s brojem indexa " + brojIndexa + " na " + godinaStudija + ". godini.");
    }
}