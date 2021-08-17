package Ex3Poligon_Lambda;

/* Sa se creeze urmatoarele interfete functionale, care vor fi utilizate in metoda main cu ajutorul expresiilor lambda.
         Concatenare cu metoda String concateneaza(String s1, String s2);
         AfisareString cu metoda void afiseazaDeNOri(String s, int n);
         Inmultire cu metoda int inmultire(int[] array);*/

@FunctionalInterface
public interface Concatenare {

    public String concateneaza(String s1, String s2);

}
