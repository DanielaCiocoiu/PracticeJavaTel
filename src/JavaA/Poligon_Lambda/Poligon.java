package Ex3Poligon_Lambda;
/*
. Sa se creeze interfata Poligon cu urmatoarele metode abstracte:
getLungime()
getNumarLaturi()
Interfata Poligon va defini metoda default getPerimetru, care va returna n*l, unde n este numarul de laturi si l este lungimea

Sa se creeze clasa TriunghiEchilateral cu atributul lungime, un constructor cu parametrul lungime. Metoda getLungime va returna valoarea atributului. Metoda getNumarLaturi va returna 3.

Identic pentru Patrat (4 laturi).

Identic pentru Hexagon (6 laturi).

Sa se creeze clasa UtilPoligon cu

metoda statica totalNrLaturi(Poligon[] p), care va calcula numarul total de laturi ale poligoanelor din vectorul p.
metoda statica totalPerimetru(Poligon[] p), care va calcula perimetrul total al poligoanelor din vectorul p.
In metoda main din clasa DemoPoligon sa se creeze mai multe instante de poligoane, care se vor adauga intr-un vector.
Apoi sa se apeleze metodele statice din clasa UtilPoligon si sa se afiseze valorile returnate de acestea.

*/
public interface Poligon {

    public int getLungime();
    public int getNumarLaturi();

    public default int getPerimetru(){
        return getLungime() * getNumarLaturi();
    }

}
