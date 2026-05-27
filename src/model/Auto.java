package model;

public class Auto {

    private String model;
    private String boja;
    private int godina;

    public Auto(String model, String boja, int godina) {
        this.model = model;
        this.boja = boja;
        this.godina = godina;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public void prikazPodataka() {
        System.out.println("Model: " + model);
        System.out.println("Boja: " + boja);
        System.out.println("Godina: " + godina);
    }

}