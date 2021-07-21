package Profesor;

public class Profesor {
    public String nume;
    public int experienta;
    public String profil;

    public Profesor(String nume, int experienta, String profil) {
        this.nume = nume;
        this.experienta = experienta;
        this.profil = profil;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getExperienta() {
        return experienta;
    }

    public void setExperienta(int experienta) {
        this.experienta = experienta;
    }

    public String getProfil() {
        return profil;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }

    public String adresare(){
        if (this.profil.equals("uman")){
            return "Doamna";
        }else {
            return "Domnule";
        }
    }
    public String materie(){
        if (this.materie().equals("Filozofie")){
            return "Filozofie";
        }
        if (this.materie().equals("Engleza")){
            return "Engleza";
        }
        if (this.materie().equals("Fizica")){
            return "Fizica";
        } else {
            return "Mate";
        }
    }
    @Override
    public String toString() {
        //si pentru materie
        return String.format("Buna ziua: %s profesor de %s %s %s ",this.adresare(), this.materie(), this.nume);

        //sau -  return "Buna ziua, Domnule profesor de " + materie  + ", " + nume;
    }

}


