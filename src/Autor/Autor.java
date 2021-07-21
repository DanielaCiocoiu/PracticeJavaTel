package Autor;

public class Autor {
    public String nume;
    public String prenume;

    public Autor(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getNumeComplet() {
        String numeComplet;
        String nume = this.getNume();
        String prenume = this.getPrenume();
        numeComplet = nume + prenume;
        System.out.println(" " + numeComplet);
        return numeComplet;
    }

    @Override
    public String toString() {
        return ", " +
                this.nume + " " + this.prenume;
    }
}
