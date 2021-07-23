package Cinematograf;

public class Drama extends Film {
    public int varsta;

    public Drama(String titlu, int minute, int varsta) {
        super(titlu, minute);
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "Drama " + " " + super.getId() + " " + this.varsta + " " + super.getTitlu() + " " + super.getMinute();
    }
}
