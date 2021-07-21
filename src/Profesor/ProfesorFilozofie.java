package Profesor;

public class ProfesorFilozofie extends Profesor {
    String materie;
    public ProfesorFilozofie(String nume, int experienta) {

        super(nume, experienta, "Uman");
     this.materie = "Filozofie";
       }

    @Override
    public String toString() {
        return String.format("Buna ziua %s profesor de %s %s ",this.adresare(), this.materie, this.nume);
    }
}
