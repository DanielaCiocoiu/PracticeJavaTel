package Autor;

public class Carte {
    public String titlu;
    public Autor autor;
    public double pret;


    public Carte(String titlu, Autor autor, double pret) {
        this.titlu = titlu;
        this.autor = autor;
        this.pret = pret;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    //The Return of Sherlock Holmes,de Arthur Conan Doyle,pret 47.2RON
    @Override
    public String toString() {
        return
                this.titlu +
                        this.autor + ", pret: " +
                        this.pret;
    }
}