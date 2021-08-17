package Ex3Poligon_Lambda;
/*        In metoda main din clasa DemoPoligon sa se creeze mai multe instante de poligoane,
                care se vor adauga intr-un vector.
                Apoi sa se apeleze metodele statice din clasa UtilPoligon si sa se afiseze valorile returnate de acestea.*/

public class DemoPoligon {

    public static void main(String[] args) {

        Poligon [] pol = new Poligon[5];

        Poligon a = new Patrat(4);
        Poligon b = new TriunghiEchilateral(6);
        Poligon c = new Patrat(6);
        Poligon d = new TriunghiEchilateral(6);
        Poligon e = new Patrat(2);

        pol[0] = a;
        pol[1] = b;
        pol[2] = c;
        pol[3] = d;
        pol[4] = e;

        System.out.println(UtilPoligon.totalNrLaturi(pol));
        System.out.println(UtilPoligon.totalPerimetru(pol));


    }

}
