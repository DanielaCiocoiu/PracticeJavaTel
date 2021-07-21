package Cursuri;

public class CursProgramare extends Curs{

    public CursProgramare(int id, String denumire, int pret) {
        super(id, denumire, pret);
    }

    @Override
    public String toString() {
        return "Curs Programare " + " " +super.getId() + " " + super.getDenumire() +  " " +super.getPret();
    }
}
