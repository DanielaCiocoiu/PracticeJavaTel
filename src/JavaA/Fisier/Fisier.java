package Ex2Fisier;

public class Fisier {
    String nume;
    String extensie;
    int dimensiune;

    public Fisier(String nume, String extensie, int dimensiune) {
        this.nume = nume;
        this.dimensiune = dimensiune;
        this.extensie = extensie;
    }

    public Fisier() {
        this("default", "txt", 1);
    }

    public void salveaza(){
        System.out.println("Fisierul a fost salvat");
    }
    public boolean verificaDimensiunea(){
        return this.dimensiune < 800;

//        sau
//        if (this.dimensiune < 800){
//            return true;
//        }else {
//            return false;
//        }
    }
}
