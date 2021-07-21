package Profesor;

public class ProfesorEngleza extends Profesor {
    String materie;

    public ProfesorEngleza(String nume, int experienta) {

        super(nume, experienta, "Uman");
        this.materie = "Engleza";
    }
    @Override
    public String toString() {
        return String.format("Buna ziua: %s profesor de %s %s ", this.adresare(), this.materie, this.nume);
    }
}
