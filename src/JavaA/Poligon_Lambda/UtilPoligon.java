package Ex3Poligon_Lambda;
/*
metoda statica totalNrLaturi(Poligon[] p), care va calcula numarul total de laturi ale poligoanelor din vectorul p.
        metoda statica totalPerimetru(Poligon[] p), care va calcula perimetrul total al poligoanelor din vectorul p.
        In metoda main din clasa DemoPoligon sa se creeze mai multe instante de poligoane,
        care se vor adauga intr-un vector.
        Apoi sa se apeleze metodele statice din clasa UtilPoligon si sa se afiseze valorile returnate de acestea.
*/

public class UtilPoligon {

    public static int totalNrLaturi(Poligon[] p){

        int total = 0;
        for (Poligon pol : p) {
            total += pol.getNumarLaturi();
        }
        return total;
    }

    public static int totalPerimetru(Poligon[] p){
        int total = 0;
        for (Poligon tot: p) {
            total+= tot.getPerimetru();
        }
        return total;
    }

}


