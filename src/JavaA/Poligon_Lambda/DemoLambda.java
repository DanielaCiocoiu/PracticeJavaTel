package Ex3Poligon_Lambda;
public class DemoLambda {

    public static void main(String[] args) {
        Concatenare concatenare = (s1, s2) -> s1 + s2;
        System.out.println(concatenare.concateneaza("Ana ", "are mere"));


        AfisareString afisareString = (str, nr) -> {
            for (int i = 0; i < nr; i++) {
                System.out.println(str);
            }
        };

        afisareString.afiseazaDeNOri("Ana ", 4);

        Inmultire inmultire = x -> {
            int total = 1;
            for (int i = 0; i < x.length; i++) {
                total *= x[i];
            }
            return total;
        };
        int num[] = {2, 5, 7, 8};
        System.out.println("inmultire: " + inmultire.inm(num));

    }
}

