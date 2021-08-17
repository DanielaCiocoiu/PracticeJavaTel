package JavaA.Cursuri;

public class CursLimbaStraina extends Curs{
    public CursLimbaStraina(int id, String denumire, int pret) {
        super(id, denumire, pret);
    }

    @Override
    public String toString() {
        return "Curs Limba Straina " + " " +super.getId() + " " + super.getDenumire() +  " " +super.getPret();
    }
}
