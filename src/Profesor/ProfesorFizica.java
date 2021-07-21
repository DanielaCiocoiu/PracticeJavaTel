package Profesor;

public class ProfesorFizica extends Profesor {
    String materie;

    public ProfesorFizica(String nume, int experienta) {

        super(nume, experienta, "Real");
        this.materie = "Fizica";

    }

    @Override
    public String toString() {
        return String.format("Buna ziua: %s profesor de %s %s ",this.adresare(), this.materie, this.nume);

       //sau -  return "Buna ziua, Domnule profesor de " + materie  + ", " + nume;
    }
}
