package oop;

public class Student {
    private String ime;
    private double ocjena;
    private int studentID;

    public Student(String ime, int studentID) {
        this.ime = ime;
        this.studentID = studentID;
        this.ocjena = 0.0;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double getOcjena() {
        return ocjena;
    }

    public void setOcjena(double ocjena) {
        this.ocjena = ocjena;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void prikazPodataka(){
        System.out.println("Ime: " + this.ime + " Student ID: " + this.studentID + " Ocjena: " + this.ocjena);
    }
}
