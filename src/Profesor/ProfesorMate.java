package Profesor;

public class ProfesorMate extends Profesor {
    String materie;
    public ProfesorMate(String nume, int experienta) {
        super(nume, experienta, "Real");
        this.materie = "Matematica";
    }
    @Override
    public String toString() {
        return String.format("Buna ziua %s profesor de %s %s ",this.adresare(), this.materie, this.nume);

    }
}
