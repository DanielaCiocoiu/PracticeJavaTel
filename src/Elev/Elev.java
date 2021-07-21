/*
Definiti clasa Elev cu atributele nume, notaMate, notaRomana, notaInfo si metoda getMedie (calculeaza media notelor elevului).
Folositi aceasta metoda intr-un program pentru a afisa numele elevului cu cea mai mare medie dintre 3 elevi definiti de voi.
*/

package Elev;

public class Elev {
    private String nume;
    private int notaMate;
    private int notaRomana;
    private int notaInfo;

    public Elev(String nume, int notaMare, int notaRomana, int notaInfo) {
        this.nume = nume;
        this.notaMate = notaMare;
        this.notaRomana = notaRomana;
        this.notaInfo = notaInfo;
    }

    public Elev() {
    }

    public String getNume() {
        return nume;
    }

    public int getNotaMate() {
        return notaMate;
    }

    public int getNotaRomana() {
        return notaRomana;
    }

    public int getNotaInfo() {
        return notaInfo;
    }

    public int getMedie() {
        int medie = (this.notaInfo + this.notaMate + this.notaRomana) / 3;
        return medie;
    }

    @Override
    public String toString() {
        return "nume='" + nume + '\'' +
                ", notaMate=" + notaMate +
                ", notaRomana=" + notaRomana +
                ", notaInfo=" + notaInfo;
    }
}
