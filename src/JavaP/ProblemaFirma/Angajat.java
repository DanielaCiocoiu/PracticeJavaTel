package JavaP.ProblemaFirma;

import java.util.Objects;

/*3. Angajat - va implementa Builder Design Pattern
        - clasa ce mosteneste clasa Persoana si are atribut in plus: nrAngajat
        - comportament - emiteFactura - returneaza o instanta a clasei Factura.*/
public class Angajat extends Persoana {

    private int nrAngajat;

    private Angajat(String nume, int varsta, String email, int nrAngajat) {
        super(nume, varsta, email);
        this.nrAngajat = nrAngajat;
    }

    //mi-l cere instanta de builder
    private Angajat() {
        super("", 0, "");
    }

    public Factura emiteFactura(Factura a) {

        Factura.toateFacturile.add(a);
        return a;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof Angajat)) {
            return false;
        }
        Angajat a = (Angajat) o;
        if (this.nrAngajat == a.nrAngajat) {
            return true;
        } else {
            return false;
        }
    }

    public static class Builder {
        private Angajat instance = new Angajat();

        public Builder setNume(String nume) {
            instance.nume = nume;
            return this;
        }

        public Builder setVarsta(int varsta) {
            instance.varsta = varsta;
            return this;
        }

        public Builder setEmail(String email) {
            instance.email = email;
            return this;
        }

        public Builder setNrAngajat(int nrAngajat) {
            instance.nrAngajat = nrAngajat;
            return this;
        }

        public Angajat build() {
            return instance;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(nrAngajat);
    }

    @Override
    public String toString() {
        return "Angajatul " +
                "nr:  " + nrAngajat +
                ", numele: '" + nume + '\'' +
                ", varsta: " + varsta +
                ", email: '" + email +" ";
    }
}
