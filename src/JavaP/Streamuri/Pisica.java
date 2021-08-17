package JavaP.Streamuri;

public class Pisica {

    private String nume;
    private int varsta;
    private double greutate;


    public Pisica(String nume, int varsta, double greutate) {
        this.nume = nume;
        this.varsta = varsta;
        this.greutate = greutate;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public double getGreutate() {
        return greutate;
    }

    @Override
    public String toString() {
        return "Pisica {" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", greutate=" + greutate +
                '}';
    }
}
