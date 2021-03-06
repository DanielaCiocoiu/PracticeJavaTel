package JavaP.ProblemaFirma;

import java.util.ArrayList;

/*6. Firma - adresa, arrayList angajati - SingletonPattern
        - metoda angajeaza care adauga o instanta de Angajat in array-ul
        de angajati doar daca el nu exista deja in firma*/
public class Firma {

    private static Firma singleton = null;
    //valori implicite cand am singleton
    private String adresa = "Staicovici";
    private ArrayList<Angajat> angajati = new ArrayList<>();

    private Firma() {
    }

    public static Firma getSingleton() {
        return singleton;
    }

    public String getAdresa() {
        return adresa;
    }

    public ArrayList<Angajat> getAngajati() {
        return angajati;
    }

    public static Firma getInstance() {
        if (singleton == null) {
            singleton = new Firma();
        }
        return singleton;
    }

    // sa parcurg arrayList-ul angajati si verific daca argumentul angajat este egal cu una din instantele din ArrayList
    //daca nu este egala cu nicuna dintre instante, il adaug in arrayList
    public void angajeaza(Angajat angajat) {
        for (Angajat angajat1 : angajati) {
            if (angajat.equals(angajat1)) {
                System.out.println("Acest angajat exista deja!");
                return;
            }
        }
        angajati.add(angajat);
    }
}
