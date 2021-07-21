package StranutException;
/*Sa se creeze clasa Bunic, care mosteneste clasa Om si suprascrie metoda aStranutat
        pentru a arunca o exceptie de tip StranutaZgomotosException.
        Mesajul exceptiei va fi “Bunicul <x> a stranutat zgomotos”, unde x este numele instantei de Bunic*/
public class Bunic extends Om{
    public String nume;

    public Bunic(String nume) {
        super(nume);
        this.nume = nume;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public void aStranutat(String cuvant) {
        if (cuvant.equals("hapciu")) {
            try {
                throw new StranutZgomotosException("Bunicul " +this.nume + " a stranutat zgomotos");
            } catch (StranutException e) {
                e.printStackTrace();
            }
        }
    }


}
