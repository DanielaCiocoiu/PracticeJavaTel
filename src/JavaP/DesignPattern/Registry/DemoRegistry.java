package JavaP.DesignPattern.Registry;
public class DemoRegistry {

    public static void main(String[] args) {
        Curs curs = Curs.getInstance(Curs.Materie.JAVA);
        Curs curs1 = Curs.getInstance(Curs.Materie.PYTHON);

        Curs curs2 = Curs.getInstance(Curs.Materie.JAVA);
        System.out.println(curs == curs2);

        //pot folosi Registry pt mai multe conexiuni la diferite baze de date, Oracle,
    }
}
