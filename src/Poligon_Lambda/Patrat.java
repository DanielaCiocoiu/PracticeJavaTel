package Ex3Poligon_Lambda;

public class Patrat implements Poligon{
    int lungime;

    int nrLaturi = 4;

    public Patrat(int lungime){
        this.lungime = lungime;
    }

    @Override
    public int getLungime() {
        return this.lungime;
    }

    @Override
    public int getNumarLaturi() {
        return this.nrLaturi;
    }
}
