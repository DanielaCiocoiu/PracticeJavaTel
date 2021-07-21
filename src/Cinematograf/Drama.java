package Cinematograf;

public class Drama extends Film {
    public int varsta;

    public Drama(int id, String titlu, int minute, int varsta) {
        super(id, titlu, minute);
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "Drama " + " " + varsta + " " + super.getTitlu() + " " + super.getMinute();
    }
}
