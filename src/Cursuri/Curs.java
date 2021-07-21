package Cursuri;
/*Într-o instituție se oferă două tipuri de cursuri: cursuri de programare și c
ursuri de limbi străine.
        Orice curs are un id, o denumire și un preț. Id-ul este un număr
        care corespunde numărului de ordine al
        cursului adăugat.*/
public class Curs {

    private int id;
    private String denumire;
    private int pret;

    public Curs(int id, String denumire, int pret) {
        this.id = id;
        this.denumire = denumire;
        this.pret = pret;
    }

    public int getId() {
        return id;
    }

    public String getDenumire() {
        return denumire;
    }

    public int getPret() {
        return pret;
    }

}
