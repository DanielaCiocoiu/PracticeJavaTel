package Ex3Poligon_Lambda;
/*Sa se creeze clasa TriunghiEchilateral cu atributul lungime, un constructor cu parametrul lungime.
Metoda getLungime va returna valoarea atributului. Metoda getNumarLaturi va returna 3.

        Identic pentru Patrat (4 laturi).

        Identic pentru Hexagon (6 laturi).*/

public class TriunghiEchilateral implements Poligon {

    int lungime;
    int nrLaturi = 3;

    public TriunghiEchilateral(int lungime) {
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
