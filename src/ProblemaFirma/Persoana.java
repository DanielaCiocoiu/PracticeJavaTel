package ProblemaFirma;

import java.time.Period;
import java.util.Objects;

public abstract class Persoana {

    public String nume;

    public int varsta;

    public String email;

    public Persoana(String nume, int varsta, String email){
        this.nume = nume;
        this.varsta = varsta;
        this.email=email;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persoana)) return false;
        Persoana persoana = (Persoana) o;
        return varsta == persoana.varsta && nume.equals(persoana.nume) && email.equals(persoana.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, varsta, email);
    }


}
