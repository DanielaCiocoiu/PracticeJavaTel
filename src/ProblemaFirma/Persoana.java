package ProblemaFirma;

import java.time.Period;

public abstract class Persoana {

    public String nume;

    public int varsta;

    public String email;

    public Persoana(String nume, int varsta, String email){
        this.nume = nume;
        this.varsta = varsta;
        this.email=email;
    }



}
