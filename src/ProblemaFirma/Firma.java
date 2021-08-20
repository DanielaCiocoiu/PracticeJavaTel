package ProblemaFirma;

import java.io.File;
import java.util.ArrayList;

/*6. Firma - adresa, arrayList angajati - SingletonPattern
        - metoda angajeaza care adauga o instanta de Angajat in array-ul de angajati doar daca el nu exista deja in firma*/
public class Firma {

    //valori implicite cand am singleton
    private String adresa = "Staicovici";
    private ArrayList<Angajat> angajati = new ArrayList<>();
    private static Firma singleton = null;
    private Firma(){

    }

    public static Firma getInstance(){
        if (singleton==null){
           singleton =new Firma();
        }
        return singleton;
    }

    public void angajeaza(Angajat angajat){
        // sa parcurg arrayList-ul angajati si verific daca argumentul angajateste egal cu una din instantele din ArrayList
        //daca nu este egala cu nicuna dintre instante, il adaug in arrayList
    }
}
